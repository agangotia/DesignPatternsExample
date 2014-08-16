package com.pattern.visitor;
/**
 * @author Anupam Gangotia
 * Profile::http://en.gravatar.com/gangotia
 * github::https://github.com/agangotia
 */
public class MinVisitor extends Visitor{
double minValue;
boolean firstTime=true;
	
	@Override
	public void visit(StudentBoy studentBoy) {
		if(firstTime)
		{
			minValue=studentBoy.getMarks();
			firstTime=false;
		}			
		else
		{
			if(studentBoy.getMarks()<minValue)
				minValue=studentBoy.getMarks();
		}
		
		
	}

	public double getMinValue()
	{
		return minValue;
	}

	@Override
	public void visit(StudentGirl studentGirl) {
		if(firstTime)
		{
			minValue=studentGirl.getMarks();
			firstTime=false;
		}			
		else
		{
			if(studentGirl.getMarks()<minValue)
				minValue=studentGirl.getMarks();
		}
		
		
	}
	
}
