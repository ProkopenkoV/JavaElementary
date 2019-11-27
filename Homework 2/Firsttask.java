public class Firsttask {

    public static void main(String[] args) {
        System.out.print("Original array elements: ");
        int arrForHW2[] = {61, 119, 202, 7, 300, 150, 781, 927, 9, 222,};
        for (int i = 0; i < arrForHW2.length; i++) {
            System.out.print(arrForHW2[i] + " ");
        }

        System.out.println("");
        for (int i = 0; i < arrForHW2.length; i++) {
            if (arrForHW2[i] % 2 == 0) {
                System.out.println(arrForHW2[i] + " - Even number ");
            } else {
                System.out.println(arrForHW2[i] + " - Odd number");
            }
        }
    }

}