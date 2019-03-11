package com.itrix.Dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import com.itrix.Model.EmpMast;
import com.itrix.Utility.DbUtil;



public class EmpDao {
	ResourceBundle tableName=ResourceBundle.getBundle("DbTable");
	ResourceBundle empmasttable=ResourceBundle.getBundle("EmpMast");
	
	public int empInset(EmpMast empMast)
	{
		
		 Connection con=null;
		int status=0;
		boolean resultflag=false;
		PreparedStatement ps=null;
		try{
			
			con=DbUtil.getConnection();
			String sql="insert into employee1_mast(emp_id,first_name,middle_name,last_name,mob_no,email_id,designation,department,address,pancard_no,adharcard_no,date_join) values(?,?,?,?,?,?,?,?,?,?,?,?)";
			ps=con.prepareStatement(sql);
			ps.setInt(1, empMast.getEmp_id());
			ps.setString(2, empMast.getFirst_name());
			ps.setString(3, empMast.getMiddle_name());
			ps.setString(4, empMast.getLast_name());
			ps.setString(5, empMast.getMob_no());
			ps.setString(6, empMast.getEmail_id());
			ps.setString(7, empMast.getDesignation());
			ps.setString(8, empMast.getDepartment());
			ps.setString(9, empMast.getAddress());
			ps.setString(10, empMast.getPancard_no());
			ps.setString(11, empMast.getAdharcard_no());
			ps.setDate(12, (Date) empMast.getDate_join());
			
			
			System.out.println("Connected");
			status=ps.executeUpdate();
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return status;
		
	}
	
	public List<EmpMast> getEmpDetails()
	{
		Connection con=null;
		PreparedStatement ps=null;
		List <EmpMast> list=new ArrayList<EmpMast>();
		try
		{
			String tblEmpMast=tableName.getString("employee1_mast");
			String id=empmasttable.getString("emp_id");
			String fname=empmasttable.getString("first_name");
			String mname=empmasttable.getString("middle_name");
			String lname=empmasttable.getString("last_name");
			String mobno=empmasttable.getString("mob_no");
			String email=empmasttable.getString("email_id");
			String design=empmasttable.getString("designation");
			String dept=empmasttable.getString("department");
			String address=empmasttable.getString("address");
			String panno=empmasttable.getString("pancard_no");
			String adhar=empmasttable.getString("adharcard_no");
			String date=empmasttable.getString("date_join");
			
			
			con=DbUtil.getConnection();
			String sql="select * from employee1_mast";
			ps=con.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			
			while(rs.next())
			{
				EmpMast empmast=new EmpMast();
				empmast.setEmp_id(rs.getInt(1));
				empmast.setFirst_name(rs.getString(2));
				empmast.setMiddle_name(rs.getString(3));
				empmast.setLast_name(rs.getString(4));
				empmast.setMob_no(rs.getString(5));
				empmast.setEmail_id(rs.getString(6));
				empmast.setDesignation(rs.getString(7));
				empmast.setDepartment(rs.getString(8));
				empmast.setAddress(rs.getString(9));
				empmast.setPancard_no(rs.getString(10));
				empmast.setAdharcard_no(rs.getString(11));
				empmast.setDate_join(rs.getDate(12));
				list.add(empmast);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return list;
		
	}
	public static int empDelete(int emp_id)
	{ 
		int status=0;
		Connection con=null;
		try
		{
			con=DbUtil.getConnection();
			PreparedStatement ps=con.prepareStatement("delete from employee1_mast where emp_id=?");
			ps.setInt(1, emp_id);
			status=ps.executeUpdate();
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return status;
		
	}
	public static EmpMast getEmpById(int emp_id)
	{
		EmpMast empmast=new EmpMast();
		Connection con=null;
		PreparedStatement ps=null;
		try
		{
			con=DbUtil.getConnection();
			String sql="select * from employee1_mast where emp_id=?";
			ps=con.prepareStatement(sql);
			ps.setInt(1, emp_id);
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				empmast.setEmp_id(rs.getInt(1));
				empmast.setFirst_name(rs.getString(2));
				empmast.setMiddle_name(rs.getString(3));
				empmast.setLast_name(rs.getString(4));
				empmast.setMob_no(rs.getString(5));
				empmast.setEmail_id(rs.getString(6));
				empmast.setDesignation(rs.getString(7));
				empmast.setDepartment(rs.getString(8));
				empmast.setAddress(rs.getString(9));
				empmast.setPancard_no(rs.getString(10));
				empmast.setAdharcard_no(rs.getString(11));
				empmast.setDate_join(rs.getTime(12));
				
			}
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return empmast;

}
	public int empUpdate(EmpMast empMast)
	{	int status=0;
		Connection con=null;
		PreparedStatement ps=null;
		
		try
		{
			con=DbUtil.getConnection();
			String sql="update employee1_mast set first_name=?,middle_name=?,last_name=?,mob_no=?,email_id=?,designation=?,department=?,address=?,pancard_no=?,adharcard_no=?,date_join=? where emp_id=?";
			ps=con.prepareStatement(sql);
			ps.setString(1, empMast.getFirst_name());
			ps.setString(2, empMast.getMiddle_name());
			ps.setString(3, empMast.getLast_name());
			ps.setString(4, empMast.getMob_no());
			ps.setString(5, empMast.getEmail_id());
			ps.setString(6, empMast.getDesignation());
			ps.setString(7, empMast.getDepartment());
			ps.setString(8, empMast.getAddress());
			ps.setString(9, empMast.getPancard_no());
			ps.setString(10, empMast.getAdharcard_no());
			ps.setDate(11, (Date) empMast.getDate_join());
			ps.setInt(12, empMast.getEmp_id());
			
			status=ps.executeUpdate();
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return status;
		
	}
	
}