package com.crypto.factorise;

import java.io.Serializable;

public class ValueElement extends Element implements Serializable{
	
	
	private Integer a;
	
	
	public ValueElement(){
		super();
	}
	
	public ValueElement(Integer a){
		super();
		this.a=a;
	}
	
	
	public ValueElement(Element element){
		super();
	}


	public Integer getA() {
		return a;
	}


	public void setA(Integer a) {
		this.a = a;
	}
	
	
	

}
