package week2.assignments;

public class Solution {
	
	public static boolean reverseEvenWords(String str) {
			
		String str1 = "";
		char ch[]=str.toCharArray();
		int len = ch.length;
		boolean answer = false;
		for (int i = len-1; i >=0; i--) {
			str1 = str1 + ch[i];			
		}		
		if(str.equals(str1)) {
			answer = true;
		}
		return answer;
	}

	public static void main(String[] args) {
		System.out.println(Solution.reverseEvenWords("MADAM"));
	}

}
