public class Thirdtask {

    public static void main(String[] args) {
        int arrForHW2[] = new int[20];
        int frstEl = 1;
        System.out.print(frstEl + " ");
        int scEl = 1;
        System.out.print(scEl + " ");
        for (int i = 3; i <= arrForHW2.length; i++) {
            int thrdEl = frstEl + scEl;
            System.out.print(thrdEl + " ");
            frstEl = scEl;
            scEl = thrdEl;

        }
    }
}