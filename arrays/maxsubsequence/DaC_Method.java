package arrays.maxsubsequence;

public class DaC_Method {
	public static int findMaxSubSequence(int[] A, int l, int r) {
		if (l == r) {
			return A[l];
		}
		int m = (l + r) / 2;
		return Math.max(Math.max(
				findMaxSubSequence(A, l, m),
				findMaxSubSequence(A, m + 1, r)),
				crossSegmentSum(A, l, r));
	}
	
	public static int crossSegmentSum(int[] A, int l , int r) {
		int m = (l + r) / 2;
		int sum = 0;
		int left = Integer.MIN_VALUE;
		int right = Integer.MIN_VALUE;
		
		// compute left sum
		for (int i = m; i >= l; i--) {
			sum += A[i];
			if (sum > left) {
				left = sum;
			}
		}
		sum = 0;
		// compute right sum
		for (int i = m + 1; i <= r; i++) {
			sum += A[i];
			if (sum > right) {
				right = sum;
			}
		}
		return left + right;
	}
	
	public static void main(String[] args) {
		int[] A = {-2, -5, 6, -2, -3, 1, 5, -6};
		System.out.println(findMaxSubSequence(A, 0, 7));
	}
}
