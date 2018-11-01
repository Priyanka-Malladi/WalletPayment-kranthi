package com.cg.Wallet.bean;


	import java.io.Serializable;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.LocalTime;

	public class BalanceDetailsBean implements Serializable {
		private LocalDate date;
		private LocalTime time;
		private double balance;
		private double amount;
		private BigInteger phoneNum;
		
		
		
		

		public LocalDate getDate() {
			return date;
		}

		public void setDate(LocalDate date) {
			this.date = date;
		}

		public LocalTime getTime() {
			return time;
		}

		public void setTime(LocalTime time) {
			this.time = time;
		}

		public double getBalance() {
			return balance;
		}

		public void setBalance(double balance) {
			this.balance = balance;
		}

		public BigInteger getPhoneNum() {
			return phoneNum;
		}

		public void setPhoneNum(BigInteger phoneNum) {
			this.phoneNum = phoneNum;
		}

		public double getAmount() {
			return amount;
		}

		public void setAmount(double amount) {
			this.amount = amount;
		}
		
		

}
