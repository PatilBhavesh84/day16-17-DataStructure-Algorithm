package com.BridgeLabz;

public class BubbleSort {
	public void sortArray(int[] numArray) {
		int n = numArray.length;
		int temp = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {

				if (numArray[j - 1] > numArray[j]) {
					temp = numArray[j - 1];
					numArray[j - 1] = numArray[j];
					numArray[j] = temp;
				}
			}
		}
	}
	public void printArray(int[] x) {
		for(int i=0; i<x.length; i++)
			System.out.print(x[i] + " ");
	}
	public static void main(String[] args) {
		BubbleSort b = new BubbleSort();
		int[] num = {12,4,52,85};
		System.out.println("Sorted list=:");
		b.sortArray(num);
		b.printArray(num);   
	}
}
