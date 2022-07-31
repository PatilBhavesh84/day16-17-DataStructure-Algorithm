package com.BridgeLabz;
public class PrimeRange {

	public static boolean isPrime(int n) {
		if (n == 0 || n == 1) {
			return false;
		}
		if (n == 2) {
			return true;
		}
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		for (int i = 0; i <= 1000; i++) {
			if (isPrime(i)) {
				System.out.print(i + " ");

			}
		}
	}
}