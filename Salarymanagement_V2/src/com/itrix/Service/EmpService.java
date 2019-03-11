package com.itrix.Service;

import java.util.ArrayList;
import java.util.List;

import com.itrix.Dao.EmpDao;
import com.itrix.Model.EmpMast;



public class EmpService {

	public int empInsert(EmpMast empMast)
	{
		int status=0;
		try
		{
			EmpDao empDao=new EmpDao();
			status=empDao.empInset(empMast);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return status;
		
	}
	public int empDelete(int emp_id)
	{
		int status=0;
		try
		{
			EmpDao dao=new EmpDao();
			status=dao.empDelete(emp_id);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return status;
	}
	public List<EmpMast> getEmpDetails()
	{
		List<EmpMast> list=new ArrayList<EmpMast>();
		try
		{
			EmpDao dao=new EmpDao();
			list=dao.getEmpDetails();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return list;
		
	}
	public EmpMast getEmpById(int emp_id) {

		int status = 0;
		EmpMast empmast = new EmpMast();

		try {

			EmpDao dao = new EmpDao();
			empmast = dao.getEmpById(emp_id);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return empmast;

	}
	
	public int empUpdate(EmpMast empMast)
	{
		int status=0;
		try
		{
			EmpDao dao=new EmpDao();
			status=dao.empUpdate(empMast);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return status;
		
	}
}
