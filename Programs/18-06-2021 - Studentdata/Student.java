package com.model;

public class Student {
	 private int SNO;
	 private int SID;
	   private String NAME;
	   
	   public Student() {}
	public Student(int sno,int sid, String name) {
		super();
		this.SNO = sno;
		this.SID = sid;
		this.NAME = name;
	}
	public int getSNO() {
		return SNO;
	}
	public void setSNO(int sno) {
		SNO = sno;
	}
	public int getSID() {
		return SID;
	}
	public void setSID(int sid) {
		SID = sid;
	}
	public String getNAME() {
		return NAME;
	}
	public void setNAME(String name) {
		NAME = name;
	}
	
	}
	
	
	
	
