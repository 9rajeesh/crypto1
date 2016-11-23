package com.crypto.factorise;

import java.io.Serializable;
import java.util.Map;

import com.crypto.factorise.exceptions.UnAssignedValueException;

public class ValueElement extends Element implements Serializable{
	
	
	private Integer value;
	
	
	public ValueElement(){
		super();
	}
	
	public ValueElement(Element element,Map<String,Integer> valueMap) throws UnAssignedValueException{
		super();
		
		
		if(isNumber(element.getA1())){
		this.value = Integer.parseInt(element.getA1());	
		}
		
		else{
		
		Integer value = (Integer)valueMap.get(element.getA1());
		if(value==null){
		throw new UnAssignedValueException();
		}
		this.value=value;
		
		}
	}
	
	private boolean isNumber(String a1) {
		
		try{
		Integer.parseInt(a1);	
		return true;
		}
		catch(Exception e){
		return false;	
		}
		
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
