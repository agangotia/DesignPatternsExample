package com.pattern.visitor;

import java.util.ArrayList;
/**
 * @author Anupam Gangotia
 * Profile::http://en.gravatar.com/gangotia
 * github::https://github.com/agangotia
 */
public class ClassSchoolBuilder {
	private ArrayList<Student> students;

	public ClassSchoolBuilder(ArrayList<Student> s) {
		students = s;
	}

	public double calculateAverage() {
		// create a visitor

		AverageVisitor visitor = new AverageVisitor();

		// iterate through all items

		for (Student item : students)

		{

			item.accept(visitor);

		}
		System.out.println("sum"+visitor.getSum());
		double average = visitor.getSum() / students.size();

		return average;
	}

	public double calculateMax() {

		MaxVisitor visitor = new MaxVisitor();

		// iterate through all items

		for (Student item : students)

		{

			item.accept(visitor);

		}

		double max = visitor.getMaxValue();

		return max;

	}

	public double calculateMin() {

		MinVisitor visitor = new MinVisitor();

		// iterate through all items

		for (Student item : students)

		{

			item.accept(visitor);

		}

		double max = visitor.getMinValue();

		return max;

	}
}
