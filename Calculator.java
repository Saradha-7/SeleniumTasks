package week3.day1;

public class Calculator {
	public void add(int a, int b) {
		System.out.println("Two arguments addition " +a+b);
		
	}
	public void add(int a, int b,int c) {
		System.out.println("Three arguments addition " +a+b+c);
		
	}
	public void multiple(double a, double b) {
		System.out.println("Two arguments multiplication with double "+a*b);
		
	}
	public void multiple(float a, float b) {
		System.out.println("Two arguments multiplication with float "+a*b);
		
	}
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.add(2, 3);
		calc.add(2, 3, 4);
		calc.multiple(4, 5);
		calc.multiple(2.0, 3.0);
		
	}

}
