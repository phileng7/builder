package com.constructor;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Bucket {
	private int bucket_id;
	private LocalDate expiration_date;
	private BigDecimal balance;
	
	public Bucket(int bucket_id, LocalDate expiration_date, BigDecimal balance) {
		super();
		this.bucket_id = bucket_id;
		this.expiration_date = expiration_date;
		this.balance = balance;
	}
	
	public int getBucket_id() {
		return bucket_id;
	}
	public void setBucket_id(int bucket_id) {
		this.bucket_id = bucket_id;
	}
	public LocalDate getExpiration_date() {
		return expiration_date;
	}
	public void setExpiration_date(LocalDate expiration_date) {
		this.expiration_date = expiration_date;
	}
	public BigDecimal getBalance() {
		return balance;
	}
	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Bucket [bucket_id=" + bucket_id + ", expiration_date=" + expiration_date + ", balance=" + balance + "]";
	}	
}
