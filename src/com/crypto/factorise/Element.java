package com.crypto.factorise;

import java.io.Serializable;
import java.util.Map;

public class Element implements Serializable {

	private Element a = null;
	private Element b = null;
	
	private String a1 = null;
	private String b1 = null;
		
	private String operator = null;
		
	/**
	 * Unary operator with a simple Element
	 * 
	 */
	public Element(String a, String op) {
		this.a1 = a;
		this.operator = op;
	}
	
	/**
	 * Unary operator with a complex Element
	 * 
	 */
	
	public Element(Element a, String op) {
		this.a = a;
		this.operator = op;

	}
	
	/**
	 * operator between a simple and a complex element
	 * 
	 */

	public Element(Element a, String b, String op) {

		this.a = a;
		this.b1 = b;
		this.operator = op;

	}
	
	/**
	 * operator between two simple elements
	 * 
	 */
	public Element(String a, String b, String op) {

		this.a1 = a;
		this.b1 = b;
		this.operator = op;

	}
	
	/**
	 * operator between two complex elements
	 * 
	 */

	public Element(Element a, Element b, String op) {

		this.a = a;
		this.b = b;
		this.operator = op;

	}
	
	/**
	 * Prints out the canonical tree structure on the console - System.out
	 * 
	 */
	
	public void printTree(){
		
		
	}
	
	/**Creates a copy of the current Element
	 * 
	 * 
	 * 
	 */
	@Override
	public Element clone(){
		
		return null;
	}
	
	

	/**Substitues all the occurences of variableName in the Element with the value
	 * 
	 * 
	 * 
	 */

	public Element substitute(String variableName,String value){
		
		return null;	
	}
	
	
	/**Links all the occurences of variableName in the Element to the referenced element
	 * 
	 * 
	 * 
	 */
    public Element bindTo(String variableName, Element element){
		
	 return null;	
	}
	
    /**Computes the mathematical value of the Element by substituting all the 
	 * variables with the provides values.
	 * 
	 * @param valueMap Map containing the variable name as the key and the variable value as the value.
	 */
    
    public Integer evaluate(Map valueMap){
    	
    	
    return null;
    }
    
    
    
    
    
    
}
