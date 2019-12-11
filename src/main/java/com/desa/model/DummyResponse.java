package com.desa.model;

public class DummyResponse {
	
	private String arg1;
	
	
	public DummyResponse() {
		
	}

	public String getArg1() {
		return arg1;
	}
	
	
	public void setArg1(String arg1) {
		this.arg1 = arg1;
	}
	
	
	public String getResponse() {
		return "-> DummyResponse: ".concat(arg1);
	}
	
	
	

}
