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
	 * Default Constructor
	 * 
	 */
	public Element() {
		
	}
		
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
	 * variables with the provided values.
	 * 
	 * @param valueMap Map containing the variable name as the key and the variable value as the value.
	 */
    
    public Integer evaluate(Map valueMap){
    	
    	
    ValueElement a = (ValueElement) applyOperator(this.a,this.b,this.operator);
    	    	
    return a.getValue();
    }
    
    
    
    private Element applyOperator(Element element1,Element element2,String operator){
    	
    
    	
    	if(isSimple(element1) && isSimple(element2)){
    	
    	 return calculate((ValueElement)element1,(ValueElement)element2,operator);
    	}
    	
    	else if(isSimple(element1) && !isSimple(element2)){
    		
    		applyOperator(new ValueElement(element1), 
  			              applyOperator(element2.a,element2.b,element2.operator),
  			              operator);
    		
    	}
    	
    	else if(!isSimple(element1) && isSimple(element2)){
    		
    		applyOperator(applyOperator(element1.a,element1.b,element1.operator), 
    				     new ValueElement(element2),
		                 operator);
    		
    	 }
    	
    	else{
    	
    	 applyOperator(applyOperator(element1.a,element1.b,element1.operator), 
    			      applyOperator(element2.a,element2.b,element2.operator),
    			      operator);
    	
    	}
    	
     return null;
    }

	private Element calculate(ValueElement element1, ValueElement element2, String operator2) {
	
		
		if(operator2.equals("+")){
		    return new ValueElement(element1.getValue() + element2.getValue());
		}
		
		else if(operator2.equals("-")){
			return new ValueElement(element1.getValue() - element2.getValue());
		}
		
		else if(operator2.equals("*")){
			return new ValueElement(element1.getValue() * element2.getValue());
		}
		
		else if(operator2.equals("/")){
			return new ValueElement(element1.getValue() / element2.getValue());
		}
		
		else if(operator2.contains("k")){
			
			int k1 = getModulo(operator2);
			
			Integer a = element1.getValue();
			
			if (a ==null){
			a = element2.getValue();
			}
			
			return new ValueElement( a % k1 );
		}
		
		
		
		
		
		return null;
	}
	
	

	public Element getA() {
		return a;
	}

	public void setA(Element a) {
		this.a = a;
	}

	public Element getB() {
		return b;
	}

	public void setB(Element b) {
		this.b = b;
	}

	public String getA1() {
		return a1;
	}

	public void setA1(String a1) {
		this.a1 = a1;
	}

	public String getB1() {
		return b1;
	}

	public void setB1(String b1) {
		this.b1 = b1;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	private Integer  getModulo(String operator2) {
		
		return Integer.parseInt(operator2.substring(1));
		
		
	}

	private boolean isSimple(Element element1) {
	
		if(element1.a==null && element1.a1!=null && element1.operator==null){
			return true;
		}
		
		
		return false;
	}
    
    
    
}
