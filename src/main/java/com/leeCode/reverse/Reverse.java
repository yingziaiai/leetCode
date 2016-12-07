 package com.leeCode.reverse;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Reverse {
public static void main(String[] args) {
	StringTokenizer tokenizer = new StringTokenizer("Hello is a word");
	int size = 5; 
//	while (tokenizer.hasMoreTokens()) {
//		System.out.println(tokenizer.nextToken());
//		size+=1;
//	}
	ArrayList<String> result = new ArrayList<String>(size);
	
	String[] reverseResult = new String[size];
	String[] srcStrings = new String[size];
	
	while (tokenizer.hasMoreTokens()) {
			for (int i = 0; i < size-1; i++) {
				srcStrings[i] = tokenizer.nextToken();
				int j = size -1 - i;
				reverseResult[j] = srcStrings[i];				
				}
			
	}
	System.out.println(Arrays.toString(srcStrings));
	System.out.println(Arrays.toString(reverseResult));
	
	
}
}
