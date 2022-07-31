package com.BridgeLabz;
import java.util.*;
import java.util.Scanner;

public class BinaryWordSearch {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int i;  

		System.out.println("Enter number of words you want to add : ");
		int n=sc.nextInt();

		String[] words= new String[n];
		for ( i = 0; i < words.length; i++)
		{
			System.out.print("Enter" + (i + 1) + ": ");
			words[i] = sc.next();
		}
		System.out.println("Enter word to search");
		String word=sc.next();

		Arrays.sort(words);

		int index= Arrays.binarySearch(words,word);
		System.out.println(word+ "="+ index);
		sc.close();
	}
}
