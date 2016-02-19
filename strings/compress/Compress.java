package strings.compress;

/**
 * Q: Compress a string by its neighboring letters:
 * aaabccccbddaa = a3b1c4b1d2a2
 * However, if the compressed strings length is larger than the length of the 
 * original, we return the original.
 * @author igorpogorelskiy
 */
public class Compress {
	
	/**
	 * Solution: We iterate over the string, being careful to update the last 
	 * iteration outside of the loop as well as using a StringBuilder to
	 * keep the string concatenation efficient. This efficiently reaches
	 * O(n) where n is the number of chars in the string. O(n) space is required
	 * by the SB.
	 * @param s string to compress
	 * @return compressed string
	 */
	public static String compress(String s) {
		if (s.equals("") || s == null) {
			return "";
		}
		StringBuilder sb = new StringBuilder();
		char currChar = s.charAt(0);
		int letterCount = 1;
		
		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i) == currChar) {
				letterCount++;
			} else {
				sb.append(currChar);
				sb.append(letterCount);
				letterCount = 1;
				currChar = s.charAt(i);
			}
		}
		
		// append last iteration
		sb.append(currChar);
		sb.append(letterCount);
		
		String compressed = sb.toString();
		return compressed.length() < s.length() ? compressed : s;
	}
}
