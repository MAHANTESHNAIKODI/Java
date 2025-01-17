package Leetcode;


import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        twosum(new int[]{5, 2, 7, 4, 9}, 9);
        findTwoSum(new int[]{5, 2, 7, 4, 9}, 9);
    }

    public static int[] twosum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }

            }

        }
        return nums;
    }


    private static int[] findTwoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            boolean containsKey = numMap.containsKey(complement);
            if (containsKey) {
                return new int[]{numMap.get(complement), i};
            } else {
                numMap.put(nums[i], i);
                Comparator<Integer> objectComparator = (o1, o2) -> {
                    if (o1%10>o2%20){
                     return  1;
                    }
                    else return -1;

                };
            }
        }
        return new int[]{};
    }



}

