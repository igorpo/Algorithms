package strings.palindrome;

public class Palindrome {
	
	
	public boolean isPalindrome(String s) {
        String f = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
        int p1 = 0;
        int p2 = f.length() - 1;
        
        while (p1 < p2) {
            if (f.charAt(p1) == f.charAt(p2)) {
                p1++;
                p2--;
            } else {
                return false;
            }
           
        }
         return true;
      
    } 
}
