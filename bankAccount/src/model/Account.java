package model;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import view.Data;

public class Account {

	private String accountsHolder;
	private int accountType;
	private double balance;
	private String tipoco;
	private String movementsType;

	private ArrayList<Movements> movementsList = new ArrayList();

	public String createExtract() {

		if (accountType == 1) {

			tipoco = "Savings";

		} else if (accountType == 2) {

			tipoco = "Checking";
		}

		String information = "ACCOUNT'S HOLDER:  " + this.accountsHolder + "\nACCOUNT'S TYPE: " + tipoco + "\n"
				+ "=======================" + "\nMovements \n" + "=====================";

		for (int i = 0; i < movementsList.size(); i++) {
			Movements m = movementsList.get(i);

			if (m.getMovementsType() == 1) {

				movementsType = "Withdraw";
			} else if (m.getMovementsType() == 0) {

				movementsType = "Deposit";
			}

			information += "\nMovement Type: " + " - " + movementsType + " - " + "\n" + "value " + m.getValue() + "\n"
					+ "Date: " + m.getdate() + "\n" + "===========================" + "\n";
		}
		return information;
	}

	public void setAccountsHolder(String accountsHolder) {

		this.accountsHolder = accountsHolder;

	}

	public void setAccountType(int accountType) {

		this.accountType = accountType;

	}

	public void deposit() {

		Movements movements = new Movements();

		movements.setMovementsType(0);

		movements.setValue(Data.asksValue());

		movements.setDate(Data.asksDate());

		movementsList.add(movements);

		this.balance += movements.getValue();
	}

	public void withdraw() {

		Movements movements = new Movements();

		movements.setMovementsType(1);

		movements.setValue(Data.asksWithdrawValue());

		movements.setDate(Data.asksDate());

		movementsList.add(movements);

		this.balance -= movements.getValue();

		if (balance <= -1000) {
			JOptionPane.showMessageDialog(null, "You can't have less than 1000 reais");
		} else {
			JOptionPane.showMessageDialog(null, "The current balance is: " + balance);
		}

	}

	public double getBalance() {

		return balance;
	}
}
