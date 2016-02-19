package arrays.firstmissingpos;

/**
 * Given an unsorted integer array, find the first missing positive integer.
 * @author igorpogorelskiy
 *
 */
public class FirstMissingPositive {
	public int firstMissingPositive(int[] A) {
        int n = A.length;
        int i = 0;
        
        while (i < n) {
            if (A[i] >= 1 && A[i] <= n && A[i] != i + 1 && A[i] != A[A[i] - 1]) {
                swap(A, i, A[i] - 1);
            } else {
                i++;
            }
        }
        
        for (int j = 0; j < n; j++) {
            if (A[j] != j + 1) {
                return j + 1;
            }
        }
        
        return n + 1;
    }
    
    private void swap(int[] A, int i, int j) {
        int tmp = A[i];
        A[i] = A[j];
        A[j] = tmp;
    }
}
