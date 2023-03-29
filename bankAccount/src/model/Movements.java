package model;

import javax.swing.JOptionPane;

public class Movements {

	private int movementsType;
	private double value;
	private String date;

	public int getMovementsType() {

		return movementsType;
	}

	public void setMovementsType(int movementsType) {

		this.movementsType = movementsType;

	}

	public double getValue() {

		return value;

	}

	public void setValue(double value) {

		this.value = value;

	}

	public String getdate() {

		return date;
	}

	public void setDate(String date) {

		this.date = date;
	}
}