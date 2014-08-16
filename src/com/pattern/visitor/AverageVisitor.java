package com.pattern.visitor;


/**
 * @author Anupam Gangotia
 * Profile::http://en.gravatar.com/gangotia
 * github::https://github.com/agangotia
 */
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
