package arrays.misc;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class MajorityElement {

  /*  Given an array of size n, find the majority element. The majority element is the element
      that appears more than ⌊ n/2 ⌋ times.
    You may assume that the array is non-empty and the majority element always exist in the array.
    Example 1:
    Input: [3,2,3] Output: 3 Example 2:
    Input: [2,2,1,1,1,2,2] Output: 2*/

    public static void main(String args[]) {
        Integer[] num = {2, 2, 1, 1, 1, 2, 2};
        Map<Integer, Integer> hmap = new HashMap<>();
        Integer size = (num.length != 0) ? num.length / 2 : 0;
        Stream.of(num).forEach(n -> {
            if (hmap.containsKey(n)) {
                Integer count = hmap.get(n);
                if (count > size) {
                    System.out.println("number is :" + n);
                } else {
                    hmap.put(n, count + 1);
                }
            } else {
                hmap.put(n, 1);
            }
        });
    }
}
