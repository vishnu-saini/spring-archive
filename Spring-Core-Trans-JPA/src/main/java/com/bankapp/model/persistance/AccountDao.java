package com.bankapp.model.persistance;

public interface AccountDao {
	public void update(Account account);
	public Account find(int id);
}