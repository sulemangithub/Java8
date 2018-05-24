package com.kpit.example1;

public class Account {
	int acno;
	String name;
	double balance;
	
	public Account() {
		// TODO Auto-generated constructor stub
	}

	public Account(int acno, String name, double balance) {
		super();
		this.acno = acno;
		this.name = name;
		this.balance = balance;
	}

	public int getAcno() {
		return acno;
	}

	public void setAcno(int acno) {
		this.acno = acno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [acno=" + acno + ", name=" + name + ", balance=" + balance + "]";
	}
}
