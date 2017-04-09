package com.crypto.factorise.solver;

import java.util.ArrayList;
import java.util.List;

import com.crypto.factorise.Element;

public class Normalizer {

	
	int size = 8;
	List<Element> elementList = new ArrayList<Element>();
	
	List<Integer> coeffList = new ArrayList<Integer>();
	
	
	
	public void normalize(){
		
	FactorisationEquationFactory factorisationEquationFactory = new FactorisationEquationFactory("p","b");
		
	for(int i=0;i<size*2;i++){
	Element e0 =  new Element(factorisationEquationFactory.generateVerticalAndHorizontal(i),"k"+i);
	elementList.add(e0);
	}
		
	}
	
	
	
	public void computeDerievedVariables() throws CloneNotSupportedException{
		
		for(int i=0;i<size;i++){
			
			elementList.get(i).clone().substitute("b"+i, "1");	
			
		}
		
	}
	
	
    private void computeCoEfficientsofEachHarmonic(){
		
		
		
	}
	
	
	
	
	
}
