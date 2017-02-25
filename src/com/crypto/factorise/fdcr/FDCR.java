package com.crypto.factorise.fdcr;

import java.util.ArrayList;
import java.util.List;

public class FDCR {

	
	
	static Integer p1 = 223;
	static Integer p2 = 241;
	
	static Integer product = p1*p2;
	
	
	static List<String> validList = new ArrayList<String>();
	
	
	public static void main(String [] args){
		
	String pstring = createString(product,16);
	
	String astring = createString(p1,8);
	
	String bstring = createString(p2,8);
	
	
	for(Integer i=0;i<255;i++){
		
		for(Integer j=0;j<255;j++){
		
		 Integer p1 = i*j;
		
		 String p1string =  createString(p1,16);
			
		 String istring  =  createString(i,8);
			
		 String jstring  =  createString(j,8);
		 
		 
		 if(check(p1string,pstring)){
			 
			 
			 System.out.println(i+ "  " +istring+"     "+j+"  "+jstring);
		 }
		 
		 
		 
		 
		 
	   }
	}
	
		
	}


	private static boolean check(String p1string, String pstring) {
	
		if(p1string.substring(8,16).equals(pstring.substring(8,16))){
		return true;
		}
		
		
		
		return false;
	}


	protected static String createString(Integer product2, int i) {
	
		String value = product2.toBinaryString(product2);
	
		
		while(value.length()<i){
		value = "0"	+value;
		}
		
		
		
		return value;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
