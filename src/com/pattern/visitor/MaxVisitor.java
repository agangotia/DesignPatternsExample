package com.pattern.visitor;

public class MaxVisitor extends Visitor{

	double maxValue;
	
	@Override
	public void visit(StudentBoy studentBoy) {
		if(studentBoy.getMarks()>maxValue)
			maxValue=studentBoy.getMarks();
		
	}

	public double getMaxValue()
	{
		return maxValue;
	}

	@Override
	public void visit(StudentGirl studentGirl) {
		if(studentGirl.getMarks()>maxValue)
			maxValue=studentGirl.getMarks();
		
	}
	
}
