package strings.reverse;

/**
 * Q: Reverse a string. 
 * @author igorpogorelskiy
 *
 */
public class Reverse {
	
	/**
	 * Solution: Since java strings are immutable, we cannot do this in place
	 * as we can in C. So we can do the next best thing: convert the string into
	 * a character array and do an in place reversal there. Then we revert back
	 * to a string and presto!
	 * @param s string to reverse
	 * @return reversed string
	 */
	public static String reverse(String s) {
		if (s.equals("")) {
			return s;
		}
		
		char[] chars = s.toCharArray();
		
		// we need these pointers to swap
		int frontPtr = 0;
		int endPtr = s.length() - 1;
		
		while (frontPtr < endPtr) {
			char tmp = chars[frontPtr];
			chars[frontPtr++] = chars[endPtr];
			chars[endPtr--] = tmp;
		}
		String reversed = new String(chars);
		return reversed;
	}
}
