package Amazon.Easy;

import java.util.HashMap;
import java.util.Map;

/**
 * LeetCode 136
 * @author kokonatsudream
 *
 */
public class SignleNumber {
	public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++){
        	map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
        	if(entry.getValue() == 1)
        		return entry.getKey();
        }
        return -1;
	}
}
