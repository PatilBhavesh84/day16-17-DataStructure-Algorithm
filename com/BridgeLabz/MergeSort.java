package com.BridgeLabz;
import java.util.Arrays;
public class MergeSort {
	public static void main(String[] args) {

		String[] values = {"banana", "mango", "kiwi", "grapes", "lichi", "apple"};
		System.out.println("Before sort: " + Arrays.toString(values));
		mergeSort(values, 0, values.length - 1);
		System.out.println("\nAfter sort: " + Arrays.toString(values));
	}
	public static void mergeSort(String[] a, int from, int to) {
		if (from == to) {
			return;
		}
		int mid = (from + to) / 2;

		mergeSort(a, from, mid);
		mergeSort(a, mid + 1, to);
		merge(a, from, mid, to);
	}
	public static void merge(String[] a, int from, int mid, int to) {
		int n = to - from + 1;       
		String[] b = new String[n];   
		int s1 = from;               
		int s2 = mid + 1;            
		int j = 0;               
		while (s1 <= mid && s2 <= to) {
			if (a[s1].compareTo(a[s2]) < 0) {
				b[j] = a[s1];
				s1++;
			} else {
				b[j] = a[s2];
				s2++;
			}
			j++;
		}
		while (s1 <= mid) {
			b[j] = a[s1];
			s1++;
			j++;
		}
		while (s2 <= to) {
			b[j] = a[s2];
			s2++;
			j++;
		}
		for (j = 0; j < n; j++) {
			a[from + j] = b[j];
		}
	}
}

