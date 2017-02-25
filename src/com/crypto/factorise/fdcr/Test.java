package com.crypto.factorise.fdcr;


import java.util.concurrent.Future;

public class Test extends FDCR {

	
	public static void main(String[] args){
		
		
		
		String pstring = createString((17)*(11),16);
		///
		String p1string =createString((7)*( 19),16);
		
		
		//String pstring = createString((17+0)*(11+0),16);
		
		//String p1string =createString((15+0)*( 5+0),16);
		
		
		//String pstring = createString((17+4)*(11+8),16);
		///
		////String p1string =createString((15+8)*( 5+4),16);
		
		String astring = createString(223,8);
		
		String bstring = createString(241,8);


//223  11011111     241  11110001
//225  11100001     207  11001111
		//System.out.println("P is:"+pstring);
		
		
		System.out.println("P1 is:"+(17+4)*(11+11));
		
		System.out.println("P1 is:"+(15+4)*(5+11));
		
		
		System.out.println("P is:"+pstring);
		System.out.println("Q is:"+p1string);
		
		
	}
	
	
	
	
	
	
	
}
