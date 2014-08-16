package com.testing.unit;

import static org.junit.Assert.*;

import java.util.ArrayList;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.pattern.visitor.ClassSchoolBuilder;
import com.pattern.visitor.Student;
import com.pattern.visitor.StudentBoy;
import com.pattern.visitor.StudentGirl;

/**
 * @author Anupam Gangotia
 * Profile::http://en.gravatar.com/gangotia
 * github::https://github.com/agangotia
 */
public class TestVisitor extends TestCase {
	
	ClassSchoolBuilder classSchoolBuilder;
	
	
	public static void main(String[] args) {

		junit.textui.TestRunner.run(TestVisitor.suite());

	}

	private static TestSuite suite() {

		TestSuite suite1 = new TestSuite(
				"Test for com.testing.unit.TestVisitor.java");

		// $JUnit-BEGIN$

		suite1.addTestSuite(TestVisitor.class);

		// $JUnit-END$

		return suite1;

	}


	public TestVisitor(String arg0) {
		super(arg0);

	}

	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void test() {
		ArrayList<Student> items= new ArrayList<Student>();
		items.add(new StudentBoy("a",1));
		items.add(new StudentBoy("b",2));
		items.add(new StudentGirl("e",3));
		items.add(new StudentGirl("e",4));
		
		classSchoolBuilder = new ClassSchoolBuilder(items);
		
		assertEquals(2.5,classSchoolBuilder.calculateAverage());
		assertEquals(4.0,classSchoolBuilder.calculateMax());
		assertEquals(1.0,classSchoolBuilder.calculateMin());
		
		
	}

}
