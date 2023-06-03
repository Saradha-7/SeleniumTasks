package week2.assignments;

public class HappyNumber {

	public static void main(String[] args) {
		int n = 13;
		int m,a=0;
		
		while (n!=1) {
			int r = n%10;
			m = (int) Math.pow(r, 2);
			System.out.println(m);
			n = n/10;
			
			
		}
	//	System.out.println(m);
		

	}

}
