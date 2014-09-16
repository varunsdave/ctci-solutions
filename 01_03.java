package com.varunsdave.ctci_01_03;
import java.io.*;
import java.lang.*;

/**
 * 
 * @author Varun Dave
 * 
 * This class provides solution to question 01.03 from Cracking the Coding Interview book
 * 
 * The problem is that given two string check if one is a permutation of the other
 * 
 *
 */
public class Solution {

	public static void main (String [] args) throws java.lang.Exception{
		
		String original = "hello!";
		String perm = "!heello";
		
		System.out.println(checkPermutation(original,perm));
		
	}
	
	public static boolean checkPermutation(String input_1, String input_2){
		if (input_1.length() != input_2.length()){
			return false; //since permutations have to be equal to each other
		}
		
		int [] charOccurances_1 = new int [256];
		int [] charOccurances_2 = new int [256];
		
		for (int i=0; i<input_1.length(); i++){
			int val_1 = input_1.charAt(i);
			int val_2 = input_2.charAt(i);
			
			charOccurances_1[val_1]++;
			charOccurances_2[val_2]++;
			
		}
		
		for (int i=0; i<128; i++){
			if (charOccurances_1[i]!= charOccurances_2[i]){
				return false;
			}
		}
		return true;
	}
}
