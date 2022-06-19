package arrays.duplicate;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public static void main(String args[]) {
        int nums[] = {1, 2, 2, 4, 5, 6, 7, 7, 8};
        System.out.println(containsDuplicate(nums));
    }

    static boolean containsDuplicate(int[] nums) {
        Set<Integer> output = new HashSet();
        int i = nums.length - 1;
        if (i > 0) {
            while (i >= 0) {
                if (!output.add(nums[i])) {
                    return true;
                }
                i--;
            }
        }

        return false;
    }
}

