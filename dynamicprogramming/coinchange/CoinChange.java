package dynamicprogramming.coinchange;

public class CoinChange {

	public static int coinChange(int sum, int[] denominations) {
		int[] A = new int[sum + 1];
		A[0] = 0;
		for (int i = 1; i <= sum; i++) {
			A[i] = Integer.MAX_VALUE; // initially we need to only record one number itself
			for (int j = 0; j < denominations.length; j++) {
				if (denominations[j] <= i) {
					A[i] = Math.min(1 + A[i - denominations[j]], A[i]);
				}
			}
		}
		return A[sum];
	}

	public static void printArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] denominations = new int[] {1, 7, 9, 10};
		int sum = 34;
		// printArr(coinChange(sum, denominations));
		System.out.println(coinChange(sum, denominations));
	}
}