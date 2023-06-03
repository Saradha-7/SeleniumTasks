package week2.assignments;

import java.util.ArrayList;
import java.util.List;

public class ReverseEvenIndexWords {

	public static void main(String[] args) {
		String str = "Selenium Expert";
		String[] string = str.split(" ");
		for (int i = 0; i < string.length; i++) {
			if (i%2!=0) {
				char ch[]=string[i].toCharArray();
				String str1 = "";
				for (int j = ch.length-1; j >=0 ; j--) {
					str1 = str1 + ch[j];					
				}
				System.out.println(str1);				
			} else {
				System.out.println(string[i]);
			}		
		}
	}
}
