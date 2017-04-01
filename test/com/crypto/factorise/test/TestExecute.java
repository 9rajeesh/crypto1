package com.crypto.factorise.test;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestExecute {

	

		   public static void main(String[] args) {
		      Result result = JUnitCore.runClasses(ElementTest.class,FactorisationEquationFactoryTest.class);
		      
				
		      for (Failure failure : result.getFailures()) {
		    	 failure.getDescription();
		    	 Throwable e = failure.getException();
		    	 if(e!=null){
		    	 e.printStackTrace(System.out);
		         System.out.println("Failure in "+failure.getDescription());
		    	 }
		      }
		      System.out.println("Total cases run:"+result.getRunCount());
		      System.out.println("Final result:"+result.wasSuccessful());
		   
		   
		   }
		 
}   
		

