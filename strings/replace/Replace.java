package strings.replace;

/**
 * Q: Replace all the spaces in a string with '%20'.
 * @author igorpogorelskiy
 */
public class Replace {
	
	/**
	 * Solution: We will use char arrays for this...
	 * @param s string to replace
	 * @return the new string with spaces replaced
	 */
	public static String replace(String s) {
		if (s == null) {
			return null;
		}
		
		// first we want to count the spaces in the string
		int numSpaces = 0;
		int len = s.length();
		for (int i = 0; i < len; i++) {
			if (s.charAt(i) == ' ') {
				numSpaces++;
			}
		}
		
		// we need a new char array to hold the newly constructed string
		// example:
		// my name is igor - 15, 3 spaces
		// my%20name%20is%20igor - 21
		// len(s) - numSpaces + (3 * numSpaces)
		// len(s) + 3n - n = len(s) + 2 * numSpaces
		int newLen = len + 2 * numSpaces;
		char[] newStr = new char[newLen];
		
		// We keep two pointers: i will keep the current pointer for the 
		// original string, and j will update the position in the newly created
		// string. Every time we encounter a space we push j further along.
		for (int i = 0, j = 0; i < len && j < newLen; i++, j++) {
			if (s.charAt(i) != ' ') {
				newStr[j] = s.charAt(i);
			} else {
				newStr[j] = '%';
				newStr[j + 1] = '2';
				newStr[j + 2] = '0';
				j += 2;
			}
		}
		
		String replacedStr = new String(newStr);
		return replacedStr;
	}
}
