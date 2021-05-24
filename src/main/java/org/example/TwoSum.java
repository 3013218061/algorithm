package org.example;

import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author: shangjinyu
 * @create: 2021-05-24 14:32
 **/
public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[0];
        if(nums == null || nums.length == 0){
            return result;
        }
        Map<Integer,Integer> valueIndexMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(valueIndexMap.containsKey(target - nums[i])){
                return new int[]{valueIndexMap.get(target - nums[i]),i};
            }
            valueIndexMap.put(nums[i],i);
        }
        return result;
    }
}
