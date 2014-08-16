package com.pattern.visitor;

public class StudentBoy extends Student{

	private String name;
	private int marks; 
	
	public StudentBoy(String s, int mrk)
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
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	@Override
	public void accept(Visitor visitor) {
		 visitor.visit(this);
		
	}
	
}
