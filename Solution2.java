package week2.assignments;

import java.util.ArrayList;
import java.util.List;

public class Solution2 {
	public static String reverseEvenWords(String str) {
		String[] str1=str.split(" ");
		String r="";
		for(int i=0;i<str1.length;i++) {
			if(i%2==1) {
				str1[i]=reverse(str1[i]);
				
			}
			r=r+" "+str1[i];
		}
		return r;
		
	}

		
	public static String reverse(String str1) {
		// TODO Auto-generated method stub
		String rev="";
		for(int i=str1.length()-1;i>=0;i--) {
			rev=rev+str1.charAt(i);
			
		}
		return rev;
	}


	public static void main(String[] args) {
		System.out.println(Solution2.reverseEvenWords("I am a Software Tester"));
	}
}
