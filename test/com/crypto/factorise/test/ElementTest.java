package com.crypto.factorise.test;

import static org.junit.Assert.*;
import java.util.HashMap;
import java.util.Map;
import org.junit.Test;
import com.crypto.factorise.Element;
import com.crypto.factorise.exceptions.UnAssignedValueException;

public class ElementTest {

	
	
	
	public static void main(String[] args) throws UnAssignedValueException{
		
		Element e1 = new Element("a0");
		Element e2 = new Element("a1");
		
		Element e3 = new Element(e1,e2,"*");
		
		
		Element e4 = new Element("a4");
		Element e5= new Element("a5");
		
		Element e6 = new Element(e4,e5,"*");
		
		
		Element e8 = new Element(e3,e6,"+");
		
		
		Map a = new HashMap();
		a.put("a0", new Integer(10));
		a.put("a1", new Integer(2));
		
		a.put("a4", new Integer(10));
		a.put("a5", new Integer(9));
		
		Integer a1 = e8.evaluate(a);
		System.out.println("A is:"+a1);
	
	}
	
	
	@Test
	public  void doTest1() throws UnAssignedValueException{
		
		
		Element e1 = new Element("a0");
		Element e2 = new Element("a1");
		
		Element e3 = new Element(e1,e2,"*");
		
		Map a = new HashMap();
		a.put("a0", new Integer(10));
		a.put("a1", new Integer(2));
		
		Integer a1 = e3.evaluate(a);
		
		assertEquals(a1,new Integer(20));
	}
	
	
	@Test
	public  void doTest2() throws UnAssignedValueException{
		
		
		Element e1 = new Element("a0");
		Element e2 = new Element("a1");
		
		Element e3 = new Element(e1,e2,"*");
		
		
		Element e4 = new Element("a4");
		Element e5= new Element("a5");
		
		Element e6 = new Element(e4,e5,"*");
		
		
		Element e8 = new Element(e3,e6,"+");
		
		
		Map a = new HashMap();
		a.put("a0", new Integer(10));
		a.put("a1", new Integer(2));
		
		a.put("a4", new Integer(10));
		a.put("a5", new Integer(9));
		
		Integer a1 = e8.evaluate(a);
		System.out.println("A is:"+a);
		assertEquals(a1,new Integer(110));
	}
	
	
	
	@Test
	public  void doTest3() throws UnAssignedValueException{
		
		
		Element e1 = new Element("a0");
		Element e2 = new Element("a1");
		
		Element e3 = new Element(e1,e2,"*");
		
		
		Element e4 = new Element("a4");
		Element e5= new Element("a5");
		
		Element e6 = new Element(e4,e5,"*");
		
		
		Element e8 = new Element(e3,e6,"+");
		
		Element e9 = new Element("a2");
		
		Element e10 = new Element(e8,e9,"+");
		
		Map a = new HashMap();
		a.put("a0", new Integer(10));
		a.put("a1", new Integer(2));
		a.put("a2", new Integer(10));
		
		a.put("a4", new Integer(10));
		a.put("a5", new Integer(9));
		
		Integer a1 = e10.evaluate(a);
		System.out.println("A is:"+a);
		assertEquals(a1,new Integer(120));
	}
	
	
	@Test
	public  void doTest4() throws UnAssignedValueException{
		
		
		Element e1 = new Element("a0");
		Element e2 = new Element("a1");
		
		Element e3 = new Element(e1,e2,"*");
		
		
		Element e4 = new Element("a4");
		Element e5= new Element("a5");
		
		Element e6 = new Element(e4,e5,"*");
		
		
		Element e8 = new Element(e3,e6,"+");
		
		Element e9 = new Element("a2");
		
		Element e10 = new Element(e8,e9,"+");
		
		
		Element e11 = new Element(e10,new Element("a3"),"*");
		
		Map a = new HashMap();
		a.put("a0", new Integer(10));
		a.put("a1", new Integer(2));
		a.put("a2", new Integer(10));
		a.put("a3", new Integer(10));
		
		
		a.put("a4", new Integer(10));
		a.put("a5", new Integer(9));
		
		Integer a1 = e11.evaluate(a);
		System.out.println("A is:"+a);
		assertEquals(a1,new Integer(1200));
	}
	
	
	
}
