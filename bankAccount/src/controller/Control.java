package controller;

import javax.swing.JOptionPane;

import model.Account;
import model.Movements;
import view.Data;

public class Control {

	Account account = new Account();

	public void showsMenu() {

		String information;
		String accountsHolder = Data.asksAccountHolder();
		int accountType = Data.asksAccountType();
		account.setAccountsHolder(accountsHolder);
		account.setAccountType(accountType);

		int options;

		do

		{

			options = Data.asksOption();

			double balance = 0;

			switch (options) {

			case 0:

				account.deposit();

				break;

			case 1:

					account.withdraw();

				break;

			case 2:

				balance = account.getBalance();
				Data.showBalance(balance);
				break;

			case 3:

				balance = account.getBalance();
				Data.showsAccountInfo(accountsHolder, accountType, balance);

				break;

			case 4:

				information = this.account.createExtract();
				Data.showsCompleteExtract(information);
			}
		} while (options != 5);

		Data.msgExitingProgram();
	}
}
