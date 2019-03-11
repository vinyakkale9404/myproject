package com.itrix.Utility;

import java.text.SimpleDateFormat;

public class Conversion {
	public java.sql.Date utilToSqlDate(java.util.Date util)
	{
		java.sql.Date sql=new java.sql.Date(util.getTime());
		return sql;

		
	}
	public java.util.Date sqlToUtilDate(java.sql.Date sql)
	{
		java.util.Date util=new java.util.Date(sql.getTime());
		return util;
		
	}
	public java.sql.Date convertStrToDate(String strDate)
	{
		
		java.sql.Date sqlDate=null;
		
		try
		{
			System.out.println("strDate"+strDate);
			SimpleDateFormat sdf =new SimpleDateFormat("yyyy/MM/dd");
			java.util.Date utilDate=sdf.parse(strDate);
		sqlDate=new java.sql.Date(utilDate.getTime());
		System.out.println("sqlDate"+sqlDate);
			
			
		}
		catch(Exception e)
		{
			System.out.println("convert Date conversionto string format:"+e);
			e.printStackTrace();
		}
		return sqlDate;
		
	}
	
}
