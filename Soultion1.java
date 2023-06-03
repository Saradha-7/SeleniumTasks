package week2.assignments;



public class Soultion1 {
	public static int charCount(String str) {
		char letter = 'e';
		int count = 0;
		char[] str1 = str.toCharArray(); 
		for (int i = 0; i < str1.length; i++) {
			if (str1[i]==letter) {
				count = count + 1;				
			}		
		}
		return count;	
	}	
	public static void main(String[] args) {
		Soultion1 result = new Soultion1();
		System.out.println(result.charCount("Selenium WebDriver"));
	}
}
