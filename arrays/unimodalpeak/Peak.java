package arrays.unimodalpeak;

public class Peak {
	/**
     * @param A: An integers array.
     * @return: return any of peek positions.
     */
    public static int findPeak(int[] A) {
        
        int l = 0;
        int r = A.length - 1;
        
        while (l < r) {
           
        	int m = (l + r) / 2;
            
            if (A[m] > A[m + 1]) {
            	r = m;
            } else {
            	l = m + 1;
            }
            
        }
        return l;
    }
    
    public static void main(String[] args) {
    	
    	int[] A = new int[]{1, 3, 4, 7, 8, 2};
    	int v = findPeak(A);
    	System.out.println("Peak Index: " + v + "  Value at peak: " + A[v]);
    	
    	A = new int[]{10, 17, 6, 5, 4, 3, 2, 1};
    	v = findPeak(A);
    	System.out.println("Peak Index: " + v + "  Value at peak: " + A[v]);
    	
    	A = new int[]{10};
    	v = findPeak(A);
    	System.out.println("Peak Index: " + v + "  Value at peak: " + A[v]);
    	
    	A = new int[]{10, 13, 14, 15, 7, 6, 5};
    	v = findPeak(A);
    	System.out.println("Peak Index: " + v + "  Value at peak: " + A[v]);
    	
    	A = new int[]{1, 2};
    	v = findPeak(A);
    	System.out.println("Peak Index: " + v + "  Value at peak: " + A[v]);
    	
    	A = new int[]{10, 2};
    	v = findPeak(A);
    	System.out.println("Peak Index: " + v + "  Value at peak: " + A[v]);
    }
}
