package com.crypto.factorise;

public class Element {

	private Element a = null;
	private Element b = null;
	
	private String a1 = null;
	private String b1 = null;
	
	
	private String operator = null;
	
	
	public Element(String a,String b,String op){
		
		this.a1=a;
		this.b1=b;
		this.operator=op;
		
	}
	
    public Element(Element a,Element b,String op){
		
		this.a=a;
		this.b=b;
		this.operator=op;
		
	}
	
	
	
	
	
	
	
}
