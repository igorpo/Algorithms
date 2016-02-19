package arrays.index;

public class ArrayIndexProblem {
	public static int findIndexMatchingValue(int[] A) {
		int l = 0;
		int r = A.length - 1;
		
		while (l <= r) {
			int m = (l + r) / 2;
			if (A[m] == m) {
				return m;
			} else if (A[m] < m) {
				l = m + 1;
			} else {
				r = m - 1;
			}
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		int[] A = {1, 3, 4, 5, 10, 11};
		System.out.println(findIndexMatchingValue(A));
		
		int[] B = {0, 1, 4, 5, 10, 11};
		System.out.println(findIndexMatchingValue(B));;
		
		int[] C = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 13, 15, 18};
		System.out.println(findIndexMatchingValue(C));
		
		int[] D = {0};
		System.out.println(findIndexMatchingValue(D));
		
		int[] E = {1, 2, 4, 5};
		System.out.println(findIndexMatchingValue(E));
		
		int[] F = {1};
		System.out.println(findIndexMatchingValue(F));
	}
}
