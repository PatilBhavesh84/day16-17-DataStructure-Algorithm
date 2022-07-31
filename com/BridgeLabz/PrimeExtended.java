package com.BridgeLabz;
import java.util.ArrayList;
public class PrimeExtended {
	public static void palindromeChecker(int n){  

		
		int r,sum=0,temp;
		temp=n;    
		while(n>0){    
			r=n%10;  
			sum=(sum*10)+r;    
			n=n/10;    
		}    
		if(temp==sum)    
			System.out.println("palindrome number ");    
		else    
			System.out.println("not palindrome");    
	}  
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
		ArrayList <Integer> primeArray = new ArrayList<>();
		for (int i = 0; i <= 1000; i++) {
			if (isPrime(i)) {
				System.out.print(i + " ");
				primeArray.add(i);
			}
		}
		System.out.println(primeArray);
		for (int j =0;j<primeArray.size();j++) {
			System.out.print(primeArray.get(j)+": ");
			palindromeChecker(primeArray.get(j));
			System.out.println();

		}
	}
}