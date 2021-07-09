package com.quest.algo.palindromesubstrings;

import java.util.HashSet;
import java.util.Set;

public class PalindromeSubstrings {
	
	public static void facade(String str) {
		print(palindromeSubstrings(str));
	}
	
	private static Set<String> palindromeSubstrings(String str){
		Set<String> result = new HashSet<>();
		
		for (int i = 0; i < str.length(); i++) {
			for (int j = i+1; j <= str.length(); j++) {
				String subStr = str.substring(i, j);
				if(isStrpalindrome(subStr)) {
					result.add(subStr);
				}
			}
		}
		
		return result;
		
	}

	private static boolean isStrpalindrome(String str) {
		char[] charArray = str.toCharArray();
		if(charArray.length == 1)
			return false;
		
		for (int i = 0, j = charArray.length-1; i <= j; i++, j--) {
			if(charArray[i] != charArray[j]) {
				return false;
			}
		}
		
		return true;
	}
	
	private static void print(Set<String> list) {
		for (String str : list) {
			System.out.println(str);	
		}
		
	}
}
