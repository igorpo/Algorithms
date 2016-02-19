package strings.longestcommonprefix;

public class LCP {
	/**
     * @param strs: A list of strings
     * @return: The longest common prefix
     */
    public String longestCommonPrefix(String[] strs) {
        
        if (strs.length == 0) {
            return "";
        }
        
        String lcp = strs[0];
        
        for (int i = 0; i < strs.length; i++) {
            char[] currentStr = strs[i].toCharArray();
            if (currentStr.length == 0) return "";
            for (int j = 0; j < lcp.length(); j++) {
                if ((lcp.charAt(j) != currentStr[j])) {
                    lcp = lcp.substring(0, j);
                    break;
                }
            }
        }
        
        return lcp;
    }
}
