package task5;

import java.util.Scanner;

public class AccountMainClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Account a = new Account("Dominic Toretto", "sbi1542", 5000);

		boolean start=true;
		while(start) {
			System.out.println("==========Bank Menu==========");
			System.out.println(
					" 1.Account Details....\n 2.Deposit Money....\n 3.Withdrow Money....\n 4.Check Balance...\n 5.Show Transaction History..\n 6.Exit..");
			System.out.println(" Enter your choice..");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				a.displayAccountDetails();
				break;

			case 2:
				System.out.println("Enter your deposited amount..");
				double amount=sc.nextDouble();
				a.deposit(amount);
				break;
			case 3:
				System.out.println("Enter amount:");
				double am=sc.nextDouble();
				a.withdraw(am);
				break;
			case 4:
				System.out.println("Remaining balance in your account is:"+a.getBalance());
				break;
			case 5:
				a.displayTransactionHistory();
				break;
			case 6:
				System.out.println("Thank your using this bank..");
				start=false;
				break;
			default:System.out.println("Invalid choice...");
			}
		}
	}
}
