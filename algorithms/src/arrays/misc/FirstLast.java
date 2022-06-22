package arrays.misc;

/*
Given an array of integers nums sorted in ascending order, find the starting and ending position of a given target value.
Your algorithm's runtime complexity must be in the order of O(log n). If the target is not found in the array, return [-1, -1].
Example 1:
Input: nums = [5,7,7,8,8,10], target = 8 Output: [3,4]
Example 2:
Input: nums = [5,7,7,8,8,10], target = 6 Output: [-1,-1]
* */
public class FirstLast {

    public static void main(String args[]) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        int start = 0;
        int end = nums.length - 1;
        int first = 0;
        int last = Integer.MAX_VALUE;
        while (start <= end) {
            if (first == 0) {
                if (nums[start] == target) {
                    first = start;
                    System.out.println("First index is :" + first);
                } else {
                    start++;
                }
            }
            if (last == Integer.MAX_VALUE) {
                if (nums[end] == target) {
                    last = end;
                    System.out.println("Last index is :" + last);
                } else {
                    end--;
                }
            }
        }
    }
}
