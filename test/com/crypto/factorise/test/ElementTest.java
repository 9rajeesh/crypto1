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
		
		e11.substitute("a3", "5");
		
		Integer a2 = e11.evaluate(a);
		System.out.println("A2 is:"+a2);
		assertEquals(a2,new Integer(600));
		
	}
	
	@Test
	public  void doTest5() throws UnAssignedValueException, CloneNotSupportedException{
		
		
		Element e1 = new Element("a0");
		Element e2 = new Element("a1");
		
		Element e3 = new Element(e1,e2,"*");
		
		
		Element e4 = new Element("a4");
		Element e5= new Element("a5");
		
		Element e6 = new Element(e4,e5,"*");
		
		
		Element e8 = new Element(e3,e6,"+");
		
		Element e9 = new Element("a2");
		
		Element e10 = new Element(e8,e9,"+");
		
		
		Element e11 = new Element(e10,e3,"*");
		
		Map a = new HashMap();
		a.put("a0", new Integer(10));
		a.put("a1", new Integer(2));
		a.put("a2", new Integer(10));
		a.put("a3", new Integer(10));
		a.put("a3", new Integer(10));
		a.put("a11", new Integer(9));
		a.put("a4", new Integer(10));
		a.put("a5", new Integer(9));
		
		Integer a1 = e11.evaluate(a);
		System.out.println("A is:"+a);
		assertEquals(a1,new Integer(2400));
		
	    Element e44 = e11.clone();
		
		e44.bindTo("a2", e3.clone());
		
		Integer a3 = e44.evaluate(a);
		assertEquals(a3,new Integer(2600));
		
		
        Element e441 = e11.clone();
		
		e441.bindTo("a5", e3.clone());
		
		Integer a2 = e441.evaluate(a);
		assertEquals(a2,new Integer(4600));
		
		
		
	}
	
	@Test
	public  void doTest6() throws UnAssignedValueException, CloneNotSupportedException{
		
		
		Element e1 = new Element("a0");
		Element e2 = new Element("a1");
		
		Element e3 = new Element(e1,e2,"*");
		
		Element e4 = new Element(e3,"k0");
		
		Map a = new HashMap();
		a.put("a0", new Integer(1));
		a.put("a1", new Integer(2));
		
		Integer a4 = e4.evaluate(a);
		assertEquals(a4,new Integer(0));
	}
	
	
	@Test
	public  void doTest7() throws UnAssignedValueException, CloneNotSupportedException{
		
		
		Element e1 = new Element("a0");
		Element e2 = new Element("a1");
		
		Element e3 = new Element(e1,e2,"*");
		
		Element e4 = new Element(e3,"k1");
		
		Map a = new HashMap();
		a.put("a0", new Integer(1));
		a.put("a1", new Integer(2));
		
		Integer a4 = e4.evaluate(a);
		assertEquals(a4,new Integer(1));
	}
	
	
	@Test
	public  void doTest8() throws UnAssignedValueException, CloneNotSupportedException{
		
		
		Element e1 = new Element("a0");
		Element e2 = new Element("a1");
		
		Element e3 = new Element(e1,e2,"*");
		
		Element e4 = new Element(e3,"k2");
		
		Map a = new HashMap();
		a.put("a0", new Integer(10));
		a.put("a1", new Integer(2));
		
		Integer a4 = e4.evaluate(a);
		assertEquals(a4,new Integer(1));
	}
	
	
	@Test
	public  void doTest9() throws UnAssignedValueException, CloneNotSupportedException {
		
		
		Element e1 = new Element("a0");
		Element e2 = new Element("a1");
		
		
		
		Element e3 = new Element(e1,e2,"*");
		
		Element e5 = new Element("a2");
	
		Element e6 = new Element(e5,e3,"+");
		
		
		
		Element e4 = new Element(e6,"k2");
		
		Map a = new HashMap();
		a.put("a0", new Integer(10));
		a.put("a1", new Integer(2));
		a.put("a2", new Integer(5));
		
		System.out.println("Evaluated"+e6.evaluate(a));
		
		Integer a4 = e4.evaluate(a);
		assertEquals(a4,new Integer(0));
	}
	
	@Test
	public  void doTest10() throws UnAssignedValueException, CloneNotSupportedException {
		
		
		Element e1 = new Element("a0");
		Element e2 = new Element("a1");
		
		
		
		Element e3 = new Element(e1,e2,"*");
		
		Element e5 = new Element("a2");
	
		Element e6 = new Element(e5,e3,"+");
		
		
		
		Element e4 = new Element(e6,"k4");
		
		Map a = new HashMap();
		a.put("a0", new Integer(10));
		a.put("a1", new Integer(2));
		a.put("a2", new Integer(5));
		
		System.out.println("Evaluated"+e6.evaluate(a));
		
		Integer a4 = e4.evaluate(a);
		assertEquals(a4,new Integer(1));
	}
	
	
}
