package com.cg.Wallet.dao;

import java.math.BigInteger;

import com.capg.Wallet.exception.WalletException;
import com.cg.Wallet.bean.BalanceDetailsBean;
import com.cg.Wallet.bean.CustomerBean;

public interface IWalletDao {

	public boolean createAccount(CustomerBean cb);

	boolean deposit(BalanceDetailsBean balbean, double amount) throws WalletException;

	public void printTransaction();

	public double showBalance(BalanceDetailsBean cb);

	public boolean fundTransfer( BigInteger toNum, double amount) throws WalletException;
	
	boolean withdraw(BalanceDetailsBean balbean, double amount) throws WalletException;

	

	
}