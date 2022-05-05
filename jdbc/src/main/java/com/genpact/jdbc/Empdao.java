package com.genpact.jdbc;

public interface Empdao {
	public void saveEmp(Employee e);
	public void getAllEmp();
	public int deleteEmp(int id);
}
