package com.cg.Wallet.service;

import java.math.BigInteger;

import com.capg.Wallet.exception.WalletException;
import com.capg.Wallet.exception.WalletExceptionMessages;
import com.cg.Wallet.bean.BalanceDetailsBean;
import com.cg.Wallet.bean.CustomerBean;
import com.cg.Wallet.dao.IWalletDao;
import com.cg.Wallet.dao.WalletDaoImp;

public class WalletServiceImp implements IWalletService{
	
	IWalletDao dao = new WalletDaoImp(); 
	CustomerBean custbean = new CustomerBean();
	
	@Override
	public boolean createAccount(CustomerBean custbean) throws WalletException {
		// TODO Auto-generated method stub
		
		return dao.createAccount(custbean);
		
	}

	@Override
	public boolean withdraw(BalanceDetailsBean balbean, double amount) throws WalletException {
		// TODO Auto-generated method stub
		boolean valid = validate(balbean);
		if(valid){
		return dao.withdraw(balbean,amount);
	}
		else{
			valid = false;
		}
		return valid;
	}

	@Override
	public boolean deposit(BalanceDetailsBean balbean, double amount) throws WalletException {
		// TODO Auto-generated method stub
		boolean valid = validate(balbean);
		if(valid){
		return dao.deposit(balbean,amount);
	}
		else{
			valid = false;
		}
		return valid;
	}

	@Override
	public void printTransaction() {
		// TODO Auto-generated method stub
		dao.printTransaction();
	}

	@Override
	public double showBalance(BalanceDetailsBean custbean) {
		// TODO Auto-generated method stub
		return dao.showBalance(custbean);
	}

	@Override
	public boolean fundTransfer( BigInteger toNum , double amount) throws WalletException {
		// TODO Auto-generated method stub
		return dao.fundTransfer(toNum,amount);
	}

	@Override
	public boolean validate(BalanceDetailsBean balbean) throws WalletException {
		boolean isValid = true;
		/*if(!(custbean.getFirstName().matches("[A-Z][A-Za-z]*") && custbean.getFirstName()!=null))
		{
			throw new WalletException(WalletExceptionMessages.ERROR1);
		}
	
		if(!(custbean.getLastName().matches("[A-Z][A-Za-z]*")))
		{
			throw new WalletException(WalletExceptionMessages.ERROR2);
		}
	
			if(!(custbean.getEmailId().matches("[A-Za-z0-9]+@+[a-z]+\\.com")))
		{
			throw new WalletException(WalletExceptionMessages.ERROR3);
		}*/
		
	
		if(!(balbean.getPhoneNum().toString().matches("[8-9][0-9]{9}")) ) 
		{
			isValid=false;
			throw new WalletException(WalletExceptionMessages.ERROR4);
			
			
		}
		
		
		if(!(balbean.getBalance()>500 && balbean.getBalance()!=0 ))
		{
			isValid=false;
			
			throw new WalletException(WalletExceptionMessages.ERROR5);
		}
		
		return isValid;
	}
}
