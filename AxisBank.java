package week3.day1;

public class AxisBank extends BankInfo {
	public void deposit() {
		System.out.println("Term Deposit 12% @ Axis bank");
	}
	public static void main(String[] args) {
		AxisBank Axis = new AxisBank();
		Axis.deposit();
		Axis.saving();

	}

}
