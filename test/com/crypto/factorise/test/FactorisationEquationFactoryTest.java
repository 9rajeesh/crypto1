package com.crypto.factorise.test;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.crypto.factorise.Element;
import com.crypto.factorise.exceptions.UnAssignedValueException;
import com.crypto.factorise.solver.FactorisationEquationFactory;

public class FactorisationEquationFactoryTest {
	
	
	
	@Test
	public void doTest1() throws UnAssignedValueException{
		
		FactorisationEquationFactory FactorisationEquationFactoryTest = new FactorisationEquationFactory();
		
		Element e0 =  new Element(FactorisationEquationFactoryTest.generateVerticalAndHorizontal(0),"k0");
		Element e1 =  new Element(FactorisationEquationFactoryTest.generateVerticalAndHorizontal(1),"k1");
		Element e2 =  new Element(FactorisationEquationFactoryTest.generateVerticalAndHorizontal(2),"k2");
		
		
		Map a = new HashMap();
		a.put("a0", 1);
		a.put("b0", 1);
		a.put("a1", 1);
		a.put("b1", 1);
		a.put("a2", 1);
		a.put("b2", 1);
		
		Integer a5 = e2.evaluate(a);
		System.out.println("Value is:"+a5);
		
		
		assertEquals(a5,new Integer(0));
	}
	
	
	@Test
	public void doTest2() throws UnAssignedValueException{
	
	FactorisationEquationFactory FactorisationEquationFactoryTest = new FactorisationEquationFactory();
		
	Element e0 =  new Element(FactorisationEquationFactoryTest.generateVerticalAndHorizontal(0),"k0");
	Element e1 =  new Element(FactorisationEquationFactoryTest.generateVerticalAndHorizontal(1),"k1");
	Element e2 =  new Element(FactorisationEquationFactoryTest.generateVerticalAndHorizontal(2),"k2");
	Element e3 =  new Element(FactorisationEquationFactoryTest.generateVerticalAndHorizontal(3),"k3");
	Element e4 =  new Element(FactorisationEquationFactoryTest.generateVerticalAndHorizontal(4),"k4");
	Element e5 =  new Element(FactorisationEquationFactoryTest.generateVerticalAndHorizontal(5),"k5");
	Element e6 =  new Element(FactorisationEquationFactoryTest.generateVerticalAndHorizontal(6),"k6");
	Element e7 =  new Element(FactorisationEquationFactoryTest.generateVerticalAndHorizontal(7),"k7");
	Element e8 =  new Element(FactorisationEquationFactoryTest.generateVerticalAndHorizontal(8),"k8");
	Element e9 =  new Element(FactorisationEquationFactoryTest.generateVerticalAndHorizontal(9),"k9");
	Element e10 = new Element(FactorisationEquationFactoryTest.generateVerticalAndHorizontal(10),"k10");
	Element e11 = new Element(FactorisationEquationFactoryTest.generateVerticalAndHorizontal(11),"k11");
	Element e12 = new Element(FactorisationEquationFactoryTest.generateVerticalAndHorizontal(12),"k12");
	Element e13 = new Element(FactorisationEquationFactoryTest.generateVerticalAndHorizontal(13),"k13");
	Element e14 = new Element(FactorisationEquationFactoryTest.generateVerticalAndHorizontal(14),"k14");
	Element e15 = new Element(FactorisationEquationFactoryTest.generateVerticalAndHorizontal(15),"k15");
	
	Map a = new HashMap();
	
	a.put("a7", 1);
	a.put("a6", 1);
	a.put("a5", 1);
	a.put("a4", 1);
	a.put("a3", 1);
	a.put("a2", 1);
	a.put("a1", 1);
	a.put("a0", 1);
	
	
	a.put("b7", 1);
	a.put("b6", 1);
	a.put("b5", 1);
	a.put("b4", 1);
	a.put("b3", 1);
	a.put("b2", 1);
	a.put("b1", 1);
	a.put("b0", 1);
	
	Integer a0 = e0.evaluate(a);
	Integer a1 = e1.evaluate(a);
	Integer a2 = e2.evaluate(a);
	Integer a3 = e3.evaluate(a);
	Integer a4 = e4.evaluate(a);
	Integer a5 = e5.evaluate(a);
	Integer a6 = e6.evaluate(a);
	Integer a7 = e7.evaluate(a);
	Integer a8 = e8.evaluate(a);
	Integer a9 = e9.evaluate(a);
	Integer a10 = e10.evaluate(a);
	
	Integer a11 = e11.evaluate(a);
	Integer a12 = e12.evaluate(a);
	Integer a13 = e13.evaluate(a);
	Integer a14 = e14.evaluate(a);
	Integer a15 = e15.evaluate(a);
	
	assertEquals(a0,new Integer(1));
	assertEquals(a1,new Integer(0));
	assertEquals(a2,new Integer(0));
	assertEquals(a3,new Integer(0));
	assertEquals(a4,new Integer(0));
	assertEquals(a5,new Integer(0));
	assertEquals(a6,new Integer(0));
	assertEquals(a7,new Integer(0));
	assertEquals(a8,new Integer(0));
	assertEquals(a9,new Integer(1));
	assertEquals(a10,new Integer(1));
	
	assertEquals(a11,new Integer(1));
	assertEquals(a12,new Integer(1));
	assertEquals(a13,new Integer(1));
	assertEquals(a14,new Integer(1));
	assertEquals(a15,new Integer(1));
	
	}
	
	@Test
	public void doTest3() throws UnAssignedValueException{
	
	FactorisationEquationFactory FactorisationEquationFactoryTest = new FactorisationEquationFactory();
		
	Element e0 =  new Element(FactorisationEquationFactoryTest.generateVerticalAndHorizontal(0),"k0");
	Element e1 =  new Element(FactorisationEquationFactoryTest.generateVerticalAndHorizontal(1),"k1");
	Element e2 =  new Element(FactorisationEquationFactoryTest.generateVerticalAndHorizontal(2),"k2");
	Element e3 =  new Element(FactorisationEquationFactoryTest.generateVerticalAndHorizontal(3),"k3");
	Element e4 =  new Element(FactorisationEquationFactoryTest.generateVerticalAndHorizontal(4),"k4");
	Element e5 =  new Element(FactorisationEquationFactoryTest.generateVerticalAndHorizontal(5),"k5");
	Element e6 =  new Element(FactorisationEquationFactoryTest.generateVerticalAndHorizontal(6),"k6");
	Element e7 =  new Element(FactorisationEquationFactoryTest.generateVerticalAndHorizontal(7),"k7");
	Element e8 =  new Element(FactorisationEquationFactoryTest.generateVerticalAndHorizontal(8),"k8");
	Element e9 =  new Element(FactorisationEquationFactoryTest.generateVerticalAndHorizontal(9),"k9");
	Element e10 = new Element(FactorisationEquationFactoryTest.generateVerticalAndHorizontal(10),"k10");
	Element e11 = new Element(FactorisationEquationFactoryTest.generateVerticalAndHorizontal(11),"k11");
	Element e12 = new Element(FactorisationEquationFactoryTest.generateVerticalAndHorizontal(12),"k12");
	Element e13 = new Element(FactorisationEquationFactoryTest.generateVerticalAndHorizontal(13),"k13");
	Element e14 = new Element(FactorisationEquationFactoryTest.generateVerticalAndHorizontal(14),"k14");
	Element e15 = new Element(FactorisationEquationFactoryTest.generateVerticalAndHorizontal(15),"k15");
	
	Map a = new HashMap();
	
	a.put("a7", 1);
	a.put("a6", 0);
	a.put("a5", 0);
	a.put("a4", 0);
	a.put("a3", 0);
	a.put("a2", 0);
	a.put("a1", 0);
	a.put("a0", 0);
	
	
	a.put("b7", 1);
	a.put("b6", 1);
	a.put("b5", 1);
	a.put("b4", 1);
	a.put("b3", 1);
	a.put("b2", 1);
	a.put("b1", 1);
	a.put("b0", 1);
	
	Integer a0 = e0.evaluate(a);
	Integer a1 = e1.evaluate(a);
	Integer a2 = e2.evaluate(a);
	Integer a3 = e3.evaluate(a);
	Integer a4 = e4.evaluate(a);
	Integer a5 = e5.evaluate(a);
	Integer a6 = e6.evaluate(a);
	Integer a7 = e7.evaluate(a);
	Integer a8 = e8.evaluate(a);
	Integer a9 = e9.evaluate(a);
	Integer a10 = e10.evaluate(a);
	
	Integer a11 = e11.evaluate(a);
	Integer a12 = e12.evaluate(a);
	Integer a13 = e13.evaluate(a);
	Integer a14 = e14.evaluate(a);
	Integer a15 = e15.evaluate(a);
	//0111 1111 1000 0000
	
	assertEquals(a0,new Integer(0));
	assertEquals(a1,new Integer(0));
	assertEquals(a2,new Integer(0));
	assertEquals(a3,new Integer(0));
	
	assertEquals(a4,new Integer(0));
	assertEquals(a5,new Integer(0));
	assertEquals(a6,new Integer(0));
	assertEquals(a7,new Integer(1));
	
	assertEquals(a8,new Integer(1));
	assertEquals(a9,new Integer(1));
	assertEquals(a10,new Integer(1));
	assertEquals(a11,new Integer(1));
	
	assertEquals(a12,new Integer(1));
	assertEquals(a13,new Integer(1));
	assertEquals(a14,new Integer(1));
	assertEquals(a15,new Integer(0));
	
	}
	
	@Test
	public void doTest4() throws UnAssignedValueException{
	
	FactorisationEquationFactory FactorisationEquationFactoryTest = new FactorisationEquationFactory();
		
	Element e0 =  new Element(FactorisationEquationFactoryTest.generateVerticalAndHorizontal(0),"k0");
	Element e1 =  new Element(FactorisationEquationFactoryTest.generateVerticalAndHorizontal(1),"k1");
	Element e2 =  new Element(FactorisationEquationFactoryTest.generateVerticalAndHorizontal(2),"k2");
	Element e3 =  new Element(FactorisationEquationFactoryTest.generateVerticalAndHorizontal(3),"k3");
	Element e4 =  new Element(FactorisationEquationFactoryTest.generateVerticalAndHorizontal(4),"k4");
	Element e5 =  new Element(FactorisationEquationFactoryTest.generateVerticalAndHorizontal(5),"k5");
	Element e6 =  new Element(FactorisationEquationFactoryTest.generateVerticalAndHorizontal(6),"k6");
	Element e7 =  new Element(FactorisationEquationFactoryTest.generateVerticalAndHorizontal(7),"k7");
	Element e8 =  new Element(FactorisationEquationFactoryTest.generateVerticalAndHorizontal(8),"k8");
	Element e9 =  new Element(FactorisationEquationFactoryTest.generateVerticalAndHorizontal(9),"k9");
	Element e10 = new Element(FactorisationEquationFactoryTest.generateVerticalAndHorizontal(10),"k10");
	Element e11 = new Element(FactorisationEquationFactoryTest.generateVerticalAndHorizontal(11),"k11");
	Element e12 = new Element(FactorisationEquationFactoryTest.generateVerticalAndHorizontal(12),"k12");
	Element e13 = new Element(FactorisationEquationFactoryTest.generateVerticalAndHorizontal(13),"k13");
	Element e14 = new Element(FactorisationEquationFactoryTest.generateVerticalAndHorizontal(14),"k14");
	Element e15 = new Element(FactorisationEquationFactoryTest.generateVerticalAndHorizontal(15),"k15");
	
	Map a = new HashMap();
	
	a.put("a7", 1);
	a.put("a6", 0);
	a.put("a5", 0);
	a.put("a4", 1);
	a.put("a3", 1);
	a.put("a2", 1);
	a.put("a1", 0);
	a.put("a0", 0);
	
	
	a.put("b7", 1);
	a.put("b6", 1);
	a.put("b5", 0);
	a.put("b4", 1);
	a.put("b3", 0);
	a.put("b2", 0);
	a.put("b1", 1);
	a.put("b0", 0);
	
	Integer a0 = e0.evaluate(a);
	Integer a1 = e1.evaluate(a);
	Integer a2 = e2.evaluate(a);
	Integer a3 = e3.evaluate(a);
	Integer a4 = e4.evaluate(a);
	Integer a5 = e5.evaluate(a);
	Integer a6 = e6.evaluate(a);
	Integer a7 = e7.evaluate(a);
	Integer a8 = e8.evaluate(a);
	Integer a9 = e9.evaluate(a);
	Integer a10 = e10.evaluate(a);
	
	Integer a11 = e11.evaluate(a);
	Integer a12 = e12.evaluate(a);
	Integer a13 = e13.evaluate(a);
	Integer a14 = e14.evaluate(a);
	Integer a15 = e15.evaluate(a);
	//0111 1111 1111 1000
	
	assertEquals(a0,new Integer(0));
	assertEquals(a1,new Integer(0));
	assertEquals(a2,new Integer(0));
	assertEquals(a3,new Integer(1));
	
	assertEquals(a4,new Integer(1));
	assertEquals(a5,new Integer(1));
	assertEquals(a6,new Integer(1));
	assertEquals(a7,new Integer(1));
	
	assertEquals(a8,new Integer(1));
	assertEquals(a9,new Integer(1));
	assertEquals(a10,new Integer(1));
	assertEquals(a11,new Integer(1));
	
	assertEquals(a12,new Integer(1));
	assertEquals(a13,new Integer(1));
	assertEquals(a14,new Integer(1));
	assertEquals(a15,new Integer(0));
	
	}
	
	

}
