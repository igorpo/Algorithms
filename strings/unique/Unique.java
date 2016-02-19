package strings.unique;

/**
 * Q: Determine if a string has all unique characters.
 * @author igorpogorelskiy
 */
public class Unique {
	
	/**
	 * Solution: O(n) time and O(k) space, where 'k' is the size of the 
	 * alphabet in which the string can be encoded in. We assume standard ASCII
	 * for this problem. We use the ASCII value as the makeshift hash value!
	 * @param s string to determine char uniqueness of.
	 * @return true if unique, false otherwise
	 */
	public static boolean uniqueStr(String s) {
		if (s.equals("")) {
			return true;
		} 
		
		boolean[] table = new boolean[256]; // ASCII "hash" table
		char[] chars = s.toCharArray();
		
		for (int i = 0; i < chars.length; i++) {
			if (table[chars[i]]) {
				return false;
			} else {
				table[chars[i]] = true;
			}
		}
		
		return true;
	}
}
