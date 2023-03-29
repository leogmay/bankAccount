
package view;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class Data {

	public static String asksAccountHolder() {

		return JOptionPane.showInputDialog("Please, inform who is the account's holder: ");

	}

	public static int asksAccountType() {

		return Integer.parseInt(
				JOptionPane.showInputDialog("Inform the type of the account 1 - Savings Account 2 - Checking Account"));
	}

	public static int asksOption() {

		String[] options = { "1 - Deposit", "2 - Withdraw", "3 - Create Extract", "4 - Create Account's Info",
				"5 - Create Complete Extract", "6 - Exit" };

		JComboBox<String> menu = new JComboBox<String>(options);
		JOptionPane.showConfirmDialog(null, menu, "Choose the desired option", JOptionPane.OK_CANCEL_OPTION);

		return menu.getSelectedIndex();
	}

	public static void showBalance(double balance) {

		if (balance <= -1000) {
			JOptionPane.showMessageDialog(null, "You can't have less than 1000 reais");
		} else {
			JOptionPane.showMessageDialog(null, "The current balance is: " + balance);
		}

	}

	public static void msgExitingProgram() {

		JOptionPane.showMessageDialog(null, "The program is being finished!", "FINISHING", JOptionPane.WARNING_MESSAGE);

		System.exit(0);

	}

	public static void showsAccountInfo(String accountsHolder, int accountType, double balance) {

		String nAccount = "";

		if (accountType == 1) {

			nAccount = "Savings";
		} else {
			nAccount = "Checking";
		}

		JOptionPane.showMessageDialog(null,
				"The holder of the account is: " + accountsHolder + "\n" + "The type of the account is: " + nAccount);

	}

	public static void showsCompleteExtract(String information) {

		JOptionPane.showMessageDialog(null, information, "Complete Extract", JOptionPane.INFORMATION_MESSAGE);

	}

	public static double asksValue() {

		double value = Double
				.parseDouble(JOptionPane.showInputDialog("What is the desired value you wish to deposit? "));

		return value;

	}

	public static double asksWithdrawValue() {

		double value = Double
				.parseDouble(JOptionPane.showInputDialog("What is the desired value you wish to withdraw? "));

		return value;

	}

	public static String asksDate() {

		String date = JOptionPane.showInputDialog("When is this transaction? ");

		return date;
	}

}
