package com.varunsdave.ctci_01_01;

import java.io.*;
import java.util.*;
import java.lang.*;


/**
 *  @author Varun Dave
 *  @version 0.1
 *  
 *  This code provides solution to a problem that asks to determine 
 *  whether a given string contains only unique chars. 
 *  
 *  The space requirement for this solution is n for the length 128
 *  The code is tested for ASCII character set only.
 *  
 *  This code is case-sensitive. That is, it treats a and A as two different
 *  characters.
 *  
 */
public class Solution {
	
	public static void main(String[] args) throws java.lang.Exception{
		String pass_test = "sample";
		String fail_test = "sample text"; //should fail at double t
		
		
		
		System.out.println("the result from pass_test is : " + containsUniqueChars(pass_test));
		System.out.println("the result from fail_test is : "+ containsUniqueChars(fail_test));
		
	}
	
	private static boolean containsUniqueChars(String input_string){
		if (input_string.length()>128){
			return false;
		}
		
		int [] char_occurences = new int [128];
		
		for (int i = 0; i< input_string.length(); i++){
			int val = input_string.charAt(i);
			char_occurences[val]++;
			if (char_occurences[val] > 1){
				
				return false;
			}
		}
		return true;
	}
	
}
