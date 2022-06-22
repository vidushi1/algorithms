package arrays.misc;

public class PeakElement {

    //Problem 09 :An element is considered peak element,if its greater than its neighbours
     public static void main(String args[]){
         peakElementInInArray();
     }
    private static void peakElementInInArray() {
        int[] num = {10, 20, 15, 2, 23, 90, 67};
        for (int i = 1; i < num.length - 1; i++) {
            if (num[i] > num[i - 1] && num[i] > num[i + 1]) {
                System.out.println("Peak ELement is :" + num[i]);
            }
        }
    }
}

