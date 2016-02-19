package strings.permutation;

/**
 * Q: Determine if two strings are permutations of one another.
 * @author igorpogorelskiy
 */
public class Permutation {
	
	/**
	 * Solution: We use the ASCII values as makeshift hash values into an
	 * array. This way we can keep O(n) time and only use O(k) space, where 'k'
	 * is the constant representing the number of assumed ASCII chars
	 * @param s1
	 * @param s2
	 * @return
	 */
	public static boolean isPerm(String s1, String s2) {
		if (s1 == null || s2 == null || s1.length() != s2.length()) {
			return false;
		}
		int N = s1.length();
		int k = 256;
		int[] table = new int[k];
		char[] s1chars = s1.toCharArray();
		char[] s2chars = s2.toCharArray();
		
		// populate our table with the correct amount of characters found for s1
		for (int i = 0; i < N; i++) {
			table[s1chars[i]]++;
		}
		
		// decrease the proper key (char) count for s2
		for (int i = 0; i < N; i++) {
			table[s2chars[i]]--;
		}
		
		// run through the table one last time to check all is 0
		for (int i = 0; i < k; i++) {
			if (table[i] != 0) {
				return false;
			}
		}
		
		return true;
	}
}
