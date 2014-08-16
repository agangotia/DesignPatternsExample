package com.pattern.visitor;
/**
 * @author Anupam Gangotia
 * Profile::http://en.gravatar.com/gangotia
 * github::https://github.com/agangotia
 */
public class StudentGirl extends Student{
	private String name;
	private float marks; 
	
	public StudentGirl(String s, int mrk)
	{
		name=s;
		marks=mrk;
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
	
	@Override
	public void accept(Visitor visitor) {
		 visitor.visit(this);
		
	}
}
