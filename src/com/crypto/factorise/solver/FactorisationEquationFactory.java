package com.crypto.factorise.solver;

import java.util.Map;

import com.crypto.factorise.Element;
import com.crypto.factorise.ValueElement;

public class FactorisationEquationFactory {

	
	private String a = "";
	private String b = "";
	private String product = "";
	
	int max=8;
	
	
	
	public void generate(){
		
		Element e0 =  new Element(generateVerticalAndHorizontal(0),"k0");
		Element e1 =  new Element(generateVerticalAndHorizontal(1),"k1");
		Element e2 =  new Element(generateVerticalAndHorizontal(2),"k2");
		Element e3 =  new Element(generateVerticalAndHorizontal(3),"k3");
		Element e4 =  new Element(generateVerticalAndHorizontal(4),"k4");
		Element e5 =  new Element(generateVerticalAndHorizontal(5),"k5");
		Element e6 =  new Element(generateVerticalAndHorizontal(6),"k6");
		Element e7 =  new Element(generateVerticalAndHorizontal(7),"k7");
		Element e8 =  new Element(generateVerticalAndHorizontal(8),"k8");
		Element e9 =  new Element(generateVerticalAndHorizontal(9),"k9");
		Element e10 = new Element(generateVerticalAndHorizontal(10),"k10");
		Element e11 = new Element(generateVerticalAndHorizontal(11),"k11");
		Element e12 = new Element(generateVerticalAndHorizontal(12),"k12");
		Element e13 = new Element(generateVerticalAndHorizontal(13),"k13");
		Element e14 = new Element(generateVerticalAndHorizontal(14),"k14");
		Element e15 = new Element(generateVerticalAndHorizontal(15),"k15");
		
	}
	
	public Element generateVerticalAndHorizontal(int count) {
		
		Element sumElement = new ValueElement(0);
			
			for(int j=0;j<=count;j++){
			sumElement = new Element(generateOnlyVertical(j),sumElement,"+");
			}
			return sumElement;
   	}
	
	
	public Element generateOnlyVertical(int count) {
			
		Element sumElement = new ValueElement(0);
		Double n = (Math.pow(2,count));
		Integer integer = n.intValue();
		Element power = new ValueElement(integer);
		
		int abegin = 0;
		int bbegin = 0;
		int aend=0;
		int bend=0;
		
		if(count<max){
			abegin = 0;	
			bbegin = count;
			aend=count;
			bend=0;
		}
		else{
			abegin = count-max+1;
			bbegin = max-1;
			aend = max-1;
		}
		
		
		for(int i=abegin,j=bbegin;i<=aend && j>=0;i++,j--){
			
			String a = "a";
			String b = "b";
			a = a + i;
			b = b + j;
			
			Element aElement = new Element(a);
			Element bElement = new Element(b);
			
			Element product = new Element(aElement,bElement,"*");
			
			sumElement = new Element(sumElement,product,"+");
		}
		
		sumElement = new  Element(sumElement,power,"*");
		return sumElement;
	}


	public void generateFirst(){
			
			
	}
	
	public void removeA(int a){
		
		
	}
	
	//calculates conjugate of an Element
	public Element conjugate(Element a){
		
		
	return null;
	}
	
	//calculates conjugate of an Element as an Integer using values specified in a valueMap
	public Integer conjugate(Element a,Map valueMap){
		
		
	return null;
	}
	
	
}
