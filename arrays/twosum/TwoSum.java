package arrays.twosum;

import java.util.HashMap;

public class TwoSum {
	/*
     * @param numbers : An array of Integer
     * @param target : target = numbers[index1] + numbers[index2]
     * @return : [index1 + 1, index2 + 1] (index1 < index2)
     */
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            map.put(target - numbers[i], i);
        }
        
        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(numbers[i])) {
                if (map.get(numbers[i]) != i) {
                    return new int[]{i + 1, map.get(numbers[i]) + 1};
                }
            }
        }
        
        return new int[2]; 
    }
}
