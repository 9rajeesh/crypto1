package com.crypto.factorise;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Map;

import com.crypto.factorise.exceptions.UnAssignedValueException;

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
	 * Simple Element
	 * 
	 */
	public Element(String a) {
		this.a1 = a;
		
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
	 * Prints out the canonical tree structure on the console - //System.out
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
	public Element clone() throws CloneNotSupportedException {

		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutput out = null;
		byte[] yourBytes = null;

		try {

			out = new ObjectOutputStream(bos);
			out.writeObject(this);
			out.flush();
			yourBytes = bos.toByteArray();

		}

		catch (IOException e) {
			throw new CloneNotSupportedException();
		}

		finally {
			try {
				bos.close();
			} catch (IOException e) {
				throw new CloneNotSupportedException();
			}

		}

		Object o = null;
		ByteArrayInputStream bis = new ByteArrayInputStream(yourBytes);
		ObjectInput in = null;
		try {
			in = new ObjectInputStream(bis);
			o = in.readObject();

		}

		catch (IOException ex) {
			throw new CloneNotSupportedException();
		}

		catch (ClassNotFoundException ex) {
			throw new CloneNotSupportedException();
		}

		finally {
			try {
				if (in != null) {
					in.close();
				}

			} catch (IOException ex) {
				throw new CloneNotSupportedException();
			}

		}

		return (Element) o;
	}
	
	

	/**Substitues all the occurences of variableName in the Element with the value
	 * 
	 * 
	 * 
	 */

	public void substitute(String variableName,String value){
		
	zoomIn(this.a,this.b,variableName,value);
	}
	
	
	private void zoomIn(Element a, Element b,String variableName,String value){
		
		if(!isSimple(a)){
		zoomIn(a.a,a.b,variableName,value);
		}
		
		else{
		String variableNameLocal = a.a1;
		if(variableNameLocal!=null && variableNameLocal.equals(variableName)){
		//This has to be replaced by the value provided	
		 a.a1=value;
		  }
		}
		
		if(!isSimple(b)){
		zoomIn(b.a,b.b,variableName,value);
		}
		
		else{
		String variableNameLocal = b.a1;
		if(variableNameLocal!=null && variableNameLocal.equals(variableName)){
		//This has to be replaced by the value provided	
		 b.a1=value;
		  }
	    }
		
	}
	
		
	/**Links all the occurences of variableName in the Element to the referenced element
	 * 
	 * 
	 * 
	 */
	
	 public void bindTo(String variableName, Element element){
		
	   zoom2(this.a,this.b,variableName,element);
	}
	
   
	 private void zoom2(Element a, Element b,String variableName, Element element){
		 
		 
		 if(!isSimple(a)){
		 zoom2(a.a, a.b, variableName, element);
		 }
		 else{
				String variableNameLocal = a.a1;
				if(variableNameLocal!=null && variableNameLocal.equals(variableName)){
				//This has to be replaced by the element provided
				a.a1= null;
				a.a=element;
				}
		 }
		 
		 if(!isSimple(b)){
		 zoom2(b.a, b.b, variableName, element);
		 }
		 
		 else{
				String variableNameLocal = b.a1;
				if(variableNameLocal!=null && variableNameLocal.equals(variableName)){
				//This has to be replaced by the element provided
				b.a1= null;
				b.a=element.a;
				b.b=element.b;
				b.operator=element.operator;
				}
		 }
		 
	 }
	 
	 	 
	 /**Computes the mathematical value of the Element by substituting all the 
	 * variables with the provided values.
	 * 
	 * @param valueMap Map containing the variable name as the key and the variable value as the value.
     * @throws UnAssignedValueException 
	 */
    
    public Integer evaluate(Map valueMap) throws UnAssignedValueException{
    	
    	
    ValueElement a = (ValueElement) applyOperator(this.a,this.b,this.operator,valueMap);
    	    	
    return a.getValue();
    }
    
    
    
    private Element applyOperator(Element element1,Element element2,String operator,Map valueMap) throws UnAssignedValueException {
    	
       ///bug fix to handle k
    	if(isSimple(element1) && element2==null){
        	
       	 return calculate(new ValueElement(element1,valueMap), 
       			          null,
       			          operator);
       	}
    	
    	else if(!isSimple(element1) && element2==null){
        	
       	 return applyOperator(applyOperator(element1.a,element1.b,element1.operator,valueMap), 
       			          null,
       			          operator,
       			          valueMap);
       	}
    	
    	else  if(isSimple(element1) && isSimple(element2)){
    	
    	 return calculate(new ValueElement(element1,valueMap), 
    			          new ValueElement(element2,valueMap),
    			          operator);
    	}
    	
    	else if(isSimple(element1) && !isSimple(element2)){
    		
    		return	applyOperator(new ValueElement(element1,valueMap), 
  			              applyOperator(element2.a,element2.b,element2.operator,valueMap),
  			              operator,
  			              valueMap);
    		
    	}
    	
    	else if(!isSimple(element1) && isSimple(element2)){
    		
    		return	applyOperator(applyOperator(element1.a,element1.b,element1.operator,valueMap), 
    				     new ValueElement(element2,valueMap),
		                 operator,
		                 valueMap);
    		
    	 }
    	
    	else{
    	
    		return applyOperator(applyOperator(element1.a,element1.b,element1.operator,valueMap), 
    			       applyOperator(element2.a,element2.b,element2.operator,valueMap),
    			       operator,
    			       valueMap);
    	
    	}
    	
  
    }

	private Element calculate(ValueElement element1, ValueElement element2, String operator2) {
	
          if(operator2.contains("k")){
			
			int k1 = getModulo(operator2);
			
			Integer a = null;
			
			if(element1!=null){
			a =	element1.getValue();
			}
			
			if(element2!=null){
			a =	element2.getValue();
			}
			
			
			char[] c = a.toBinaryString(a).toCharArray();
			
			int length = c.length;
			
			char place = c[length-k1-1];
			
			String placeString = Character.toString(place);
			
			return new ValueElement( Integer.parseInt(placeString) );
		}
		
        else if(operator2.equals("+")){
		    return new ValueElement(element1.getValue() + element2.getValue());
		}
		
		else if(operator2.equals("-")){
			return new ValueElement(element1.getValue() - element2.getValue());
		}
		else if(operator2.equals("and")){
			return new ValueElement(element1.getValue() * element2.getValue());
		}
		
		else if(operator2.equals("*")){
			return new ValueElement(element1.getValue() * element2.getValue());
		}
		
		else if(operator2.equals("/")){
			return new ValueElement(element1.getValue() / element2.getValue());
		}
		
		
			
		//System.out.println("returning null:");
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
	
		//System.out.println(element1.a + "     "+element1.b +"      " +  element1.a1);
	
		if(element1 instanceof ValueElement){
		return true;
		}
		
		if(element1.a==null && element1.a1!=null && element1.operator==null){
			return true;
		}
		
		
		return false;
	}
    
    
    
}
