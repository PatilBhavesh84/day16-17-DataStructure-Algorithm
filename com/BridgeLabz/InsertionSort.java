package com.BridgeLabz;

public class InsertionSort {
	public static void main(String args[]) {
		String arr[] = {"polo", "thar", "slavia", "vento","compass","innova" };
		InsertionSort obj = new InsertionSort();
		obj.sort(arr);
		printArray(arr);
	}
void sort(String arr[]) {
	int n = arr.length;
	for (int i = 1; i < n; ++i) {
		String key = arr[i];
		int k = i - 1;

		while (k >= 0 && (arr[k].compareTo(key))>0) {
			arr[k + 1] = arr[k];
			k = k - 1;
		}
		arr[k + 1] = key;
	}
}
static void printArray(String arr[]) {
	int n = arr.length;
	for (int i = 0; i < n; ++i)
		System.out.print(arr[i] + " ");
	System.out.println();
}
}
