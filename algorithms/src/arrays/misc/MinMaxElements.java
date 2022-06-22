package arrays.misc;

public class MinMaxElements {

    public static void main(String[] args) {
        Integer[] nums ={7,8,9,11,12};
        System.out.println("Minimum number is :"+minNumber(nums));
        System.out.println("Maximum number is :"+maxNumber(nums));
    }


   static Integer maxNumber(Integer[] nums) {
        int max = Integer.MIN_VALUE;
        for(int i =0; i <=nums.length-1;i++) {
            if(max<=nums[i]){
                max = nums[i];
            }
        }
        return max;
    }

    static Integer minNumber(Integer[] nums) {
        int min = Integer.MAX_VALUE;
        for(int i =0; i <=nums.length-1;i++) {
            if(min>=nums[i]) {
                min = nums[i];
            }
        }
        return min;
    }
}
