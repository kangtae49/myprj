package com.kt.www.demo.model;

import java.util.Date;

public class DemoVO {
	String txt;
	int nth;
	double real;
	Date dt = new Date();
	public String getTxt() {
		return txt;
	}
	public void setTxt(String txt) {
		this.txt = txt;
	}
	public int getNth() {
		return nth;
	}
	public void setNth(int nth) {
		this.nth = nth;
	}
	public double getReal() {
		return real;
	}
	public void setReal(double real) {
		this.real = real;
	}
	public Date getDt() {
		return dt;
	}
	public void setDt(Date dt) {
		this.dt = dt;
	}
	
	
}
