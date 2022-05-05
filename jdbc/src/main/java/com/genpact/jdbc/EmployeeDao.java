package com.genpact.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import javax.sql.DataSource;

public class EmployeeDao implements Empdao {

	Connection conn = null;
	
    private DataSource dataSource;
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }		

    
    
	public void saveEmp(Employee e) {
		
		   String sql = "INSERT INTO EMPLOYEE " +
	                "(id,name,address) VALUES (?, ?, ?)";
	        
	        
	        try {
	        	conn = dataSource.getConnection();
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ps.setInt(1, e.getId());
	            ps.setString(2, e.getNameString());
	            ps.setString(3, e.getAddressString());
	            ps.executeUpdate();
	            ps.close();

	        } catch (SQLException e1) {
	            throw new RuntimeException(e1);

	        } finally {
	            if (conn != null) {
	                try {
	                    conn.close();
	                } catch (SQLException e1) {}
	            }
	        }    
	}
	
	public void getAllEmp() {
		
		try {
			conn=dataSource.getConnection();
			String sql="Select * from employee";
			PreparedStatement pStatement=conn.prepareStatement(sql);
			
			ResultSet resultSet=pStatement.executeQuery();
			
			while(resultSet.next()) {
				System.out.println(resultSet.getInt(1)+"  "+resultSet.getString(2)+"  "+resultSet.getString(3));
			}
			pStatement.close();
			
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		
	}



	public int deleteEmp(int id) {
		
		int x=0;
		// TODO Auto-generated method stub
		try {
			conn=dataSource.getConnection();
			
			
			String sql="DELETE FROM EMPLOYEE WHERE id=?;";
			PreparedStatement pStatement=conn.prepareStatement(sql);
			
			pStatement.setInt(1, id);
			pStatement.close();
			x= pStatement.executeUpdate();
			
			
		}catch (Exception e) {
			// TODO: handle exception
		}
			return x;
	}
	
	
	
	

}
