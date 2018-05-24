package com.kpit.example1;

import java.util.ArrayList;
import java.util.List;

public interface IAccount {
	boolean addAccount(Account account);
	boolean removeAccount(int acno);
	boolean updateAccount(Account account);
	Account getAccount(int acno);
	List<Account> getAllAccounts();
	
	static List<Account> accounts = new ArrayList<>();
	
	public static void init() 
	{
		accounts.add(new Account(121,"A",5000));
		accounts.add(new Account(122,"B",6000));
		accounts.add(new Account(123,"C",7000));
		accounts.add(new Account(124,"E",8000));
	}

	public static boolean isValid(Account account)
	{
		return true;
	}
}
