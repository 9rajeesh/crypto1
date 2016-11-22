package com.crypto.factorise;

import java.io.Serializable;

public class ValueElement extends Element implements Serializable{
	
	
	private Integer value;
	
	
	public ValueElement(){
		super();
	}
	
	public ValueElement(Integer a){
		super();
		this.value=a;
	}
	
	
	public ValueElement(Element element){
		super();
		String a = element.getA1();
		this.value = Integer.parseInt(a);
		
	}


	public Integer getValue() {
		return value;
	}


	public void setA(Integer a) {
		this.value = a;
	}
	
	
	

}
