package com.alfar.demo.model;

public class Allocation {
	
	private Integer id;
	private Integer employeeid;
	private String start;
	private String projectcode;
	
	public Allocation(Integer id, Integer employeeid, String start, String projectcode) {
		super();
		this.id = id;
		this.employeeid = employeeid;
		this.start = start;
		this.projectcode = projectcode;
	}
	
	public Allocation() {}
	
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(Integer employeeid) {
		this.employeeid = employeeid;
	}
	public String getStart() {
		return start;
	}
	public void setStart(String start) {
		this.start = start;
	}
	public String getProjectcode() {
		return projectcode;
	}
	public void setProjectcode(String projectcode) {
		this.projectcode = projectcode;
	}
	
	

}
