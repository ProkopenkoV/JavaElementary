import flowerProperties.Accessory;
import flowerProperties.Flower;
import shop.Bouquet;
import shop.Shop;
import support.Support;

import java.util.Scanner;

public class Runner{
    private Shop shop;
    private Scanner scanner;
    private Bouquet currentBouquet;

    public Runner(Shop shop) {
        this.shop = shop;
        this.scanner = new Scanner(System.in);
    }

    public static void main(String[] args) {
        Shop shop = new Shop();
        Runner consoleMenu = new Runner(shop);
        consoleMenu.makeYourOrder();
    }


    public void makeYourOrder() {
        System.out.println("\t1. Create bouquet");
        System.out.println("\t2. Carry out any operations with the bouquet");
        System.out.println("\t3. Print current bouquet");
        System.out.println("\t4. Leave the flower shop");

        int choice = getChoice();
        if (choice < 5 && choice > 0) {
            switch (choice) {
                case 1:
                    Bouquet bouquet = new Bouquet();
                    shop.addBouquet(bouquet);
                    currentBouquet = bouquet;
                    createBouquet();
                    break;
                case 2:
                    makeOperations();
                    break;
                case 3:
                    printBouquet();
                    break;
                case 4:
                    exit();
                    break;
            }
        } else {
            System.out.println("Wrong select!");
            makeYourOrder();
        }
    }

    public void createBouquet() {
        System.out.println("\t1. Add flower");
        System.out.println("\t2. Add accessory");
        System.out.println("\t3. Back");
        int choice = getChoice();
        if (choice < 4 && choice > 0) {
            switch (choice) {
                case 1:
                    addFlower();
                    break;
                case 2:
                    addAccessory();
                    break;
                case 3:
                    makeYourOrder();
                    break;
            }
        } else {
            System.out.println("Error!");
            createBouquet();
        }
    }

    public void makeOperations() {
        if (shop.getBouquets().length != 0) {
            System.out.println("\t1 Find out all cost");
            System.out.println("\t2 Sort by freshness");
            System.out.println("\t3 Find a flower by the stem");
            System.out.println("\t4 Back");
            int choice = getChoice();
            if (choice < 5 && choice > 0) {
                switch (choice) {
                    case 1:
                        chooseBouquet();
                        System.out.println(shop.calculateCost(currentBouquet));
                        makeOperations();
                        break;
                    case 2:
                        chooseBouquet();
                        shop.sortByFreshness(currentBouquet);
                        printBouquet();
                        makeOperations();
                        break;
                    case 3:
                        chooseBouquet();
                        findByStem(currentBouquet);
                        break;
                    case 4:
                        makeYourOrder();
                        break;
                }
            } else {
                System.out.println("Error!");
                makeOperations();
            }
        } else {
            System.out.println("U need to create the bouquet!");
            makeYourOrder();
        }

    }

    public void chooseBouquet() {
        if (shop.getBouquets().length == 0) {
            System.out.println("Please create the bouquet!");
        } else {
            System.out.println("Please choose bouquet:");
            for (int i = 0; i < shop.getBouquets().length; i++) {
                int j = i;
                System.out.println("#" + (j + 1));
                System.out.println(shop.getBouquets()[i].toString());
            }
            int choice = getChoice();
            try {
                currentBouquet = shop.getBouquets()[choice - 1];
            } catch (Exception e) {
                System.out.println("Error!");
                chooseBouquet();
            }
        }
    }

    private void addAccessory() {
        System.out.println("Print something");
        String type = scanner.nextLine();
        System.out.println("Enter price");
        int price = Support.parseToNumber(scanner);
        shop.addAccessoryToBouquet(currentBouquet, new Accessory(price, type));
        createBouquet();
    }

    public void addFlower() {
        System.out.println("Print something");
        String type = scanner.nextLine();
        System.out.println("Enter freshness level");
        int percent = Support.parseToNumber(scanner);
        System.out.println("Enter price");
        int price = Support.parseToNumber(scanner);
        System.out.println("Enter stem length");
        int length = Support.parseToNumber(scanner);
        shop.addFlowerToBouquet(currentBouquet, new Flower(price, type, percent, length));
        createBouquet();
    }

    public void printBouquet() {
        for (Bouquet bouquet : shop.getBouquets()) {
            System.out.println(bouquet.toString());
        }
        makeYourOrder();
    }

    public void exit() {
        scanner.close();
        System.out.println("If you didn’t collect anything, then come back and quickly collect everything:)");
        System.exit(0);
    }

    public int getChoice() {
        int order = 0;
        while (order == 0) {
            try {
                order = Support.parseToNumber(scanner);
            } catch (NumberFormatException e) {
                System.out.println("U need enter the number");
            }
        }
        return order;
    }

    public void findByStem(Bouquet bouquet) {
        System.out.println("Minimum stem size");
        int min = Support.parseToNumber(scanner);
        System.out.println("Maximum stem size");
        int max = Support.parseToNumber(scanner);
        for (Flower flower : shop.findByStem(bouquet, min, max)) {
            System.out.println(flower.toString());
        }
        makeOperations();
    }
}