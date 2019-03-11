package com.itrix.Model;

import java.util.Date;

public class EmpMast {
	private int emp_id;
	private String first_name;
	private String middle_name;
	private String last_name;
	private String mob_no;
	private String email_id;
	private String designation;
	private String department;
	private String address;
	private String pancard_no;
	private String adharcard_no;
	private Date date_join;
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getMiddle_name() {
		return middle_name;
	}
	public void setMiddle_name(String middle_name) {
		this.middle_name = middle_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getMob_no() {
		return mob_no;
	}
	public void setMob_no(String mob_no) {
		this.mob_no = mob_no;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPancard_no() {
		return pancard_no;
	}
	public void setPancard_no(String pancard_no) {
		this.pancard_no = pancard_no;
	}
	public String getAdharcard_no() {
		return adharcard_no;
	}
	public void setAdharcard_no(String adharcard_no) {
		this.adharcard_no = adharcard_no;
	}
	public Date getDate_join() {
		return date_join;
	}
	public void setDate_join(Date date_join) {
		this.date_join = date_join;
	}
}
