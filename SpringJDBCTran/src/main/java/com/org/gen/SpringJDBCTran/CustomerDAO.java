package com.org.gen.SpringJDBCTran;

public interface CustomerDAO {

	public void insert(Customer customer);
	public Customer findByCustomerid(int custId);
}
