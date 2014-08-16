package com.pattern.visitor;



public class AverageVisitor extends Visitor {
	
	double sum;
	
	@Override
	public void visit(StudentBoy studentBoy) {
		sum += studentBoy.getMarks(); 
		
	}

	public double getSum()
	{
		return sum;
	}

	@Override
	public void visit(StudentGirl studentGirl) {
		sum += studentGirl.getMarks(); 
		
	}
	

}
