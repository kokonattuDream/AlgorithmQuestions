package Medium;
/**
 * LeetCode 11
 * @author kokonatsudream
 *
 */
public class ContainerWithMostWater {
	public int maxArea(int[] height) {
        int max = 0;
        int l = 0;
        int r = height.length - 1;
        
        while(l < r){
        	max = Math.max(max,  Math.min(height[l], height[r]) * (r - l));
        	if(height[l] < height[r]){
        		l++;
        	} else {
        		r--;
        	}
        }
        
        return max;
    }
}
