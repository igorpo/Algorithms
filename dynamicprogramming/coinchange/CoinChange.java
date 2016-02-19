package dynamicprogramming.coinchange;

import java.util.Arrays;

public class CoinChange {

	public static int coinChange(int sum, int[] denominations) {
		int[] A = new int[sum + 1];
		Arrays.fill(A, Integer.MAX_VALUE);
		A[0] = 0;
		for (int i = 0; i <= sum; i++) {
			for (int j = denominations.length - 1; j >= 0; j--) {
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
		int sum = 63;
		// printArr(coinChange(sum, denominations));
		System.out.println(coinChange(sum, denominations));
	}
}