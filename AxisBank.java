package week3.day1;

public class AxisBank extends BankInfo {
	public void deposit() {
		System.out.println("1000 deposited from current account");
	}

	public static void main(String[] args) {
		AxisBank bank = new AxisBank();
		bank.deposit();
		bank.saving();
		bank.fixed();
		

	}

}
