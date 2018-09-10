/**
 * Given an integer, write a function to determine if it is a power of two.

Example 1:

Input: 1
Output: true 
Explanation: 20 = 1
Example 2:

Input: 16
Output: true
Explanation: 24 = 16
Example 3:

Input: 218
Output: false
 * @author kokonatsudream
 *
 */
public class PowerOfTwo {
	public boolean isPowerOfTwo(int n) {
        if(n == 0) return false;
        if(n == 1) return true;
        
        if(n % 2 == 0) return isPowerOfTwo(n/2);
        else return false;
    }
}
