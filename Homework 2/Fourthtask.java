public class Fourthtask {

    public static void main(String[] args) {
        int min;
        int max;
        System.out.print("Original array elements: ");
        int arrForHW2[] = {61, 119, 202, 7, 300, 150, 781, 927, 9, 222,};
        for (int i = 0; i < arrForHW2.length; i++) {
            System.out.print(arrForHW2[i] + " ");
        }
        max=arrForHW2[0];
        min=arrForHW2[0];
        for (int i = 1; i < arrForHW2.length; i++) {
            if(arrForHW2[i] < min){
                min=arrForHW2[i];
            }
        }
        System.out.println("");
        System.out.println("Minimal array element it's "+min);
        for (int i = 1; i < arrForHW2.length; i++) {
            if(arrForHW2[i] > max){
                max=arrForHW2[i];
            }
        }
        System.out.println("Maximum array element it's "+max);
    }

}