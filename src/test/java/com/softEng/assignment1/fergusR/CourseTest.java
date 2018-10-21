/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softEng.assignment1.fergusR;

import java.time.LocalDate;
import java.util.ArrayList;
import junit.framework.TestCase;

/**
 *
 * @author F
 */
public class CourseTest extends TestCase {
    
    public CourseTest(String testName) {
        super(testName);
    }

    /**
     * Test of addModule method, of class Course.
     */
    public void testAddModule() {
        System.out.println("addModule test");
        Module m = new Module("testModule", 1001);
        Course instance = new Course("testCourse", LocalDate.of(2018,9,10), LocalDate.of(2019,5,30));
        instance.addModule(m);
        
        System.out.print("\n\n" + m.getName());
        System.out.print(instance.getModules().get(0).getName() + "\n\n");
        assertEquals(m.getName(), instance.getModules().get(0).getName());
    }

    /**
     * Test of addStudent method, of class Course.
     */
    public void testAddStudent() {
        System.out.println("addStudent test");
        Student s = new Student("testStudent", 21, LocalDate.of(1997,1,1), 1001);
        Course instance = new Course("testCourse", LocalDate.of(2018,9,10), LocalDate.of(2019,5,30));
        instance.addStudent(s);
        
        assertEquals(s,instance.getStudents().get(0));
    }

    /**
     * Test of getModules method, of class Course.
     */
    public void testGetModules() {
        System.out.println("getModules");
        Course instance = new Course("testCourse", LocalDate.of(2018,9,10), LocalDate.of(2019,5,30));
        ArrayList<Module> expResult = new ArrayList<Module>();
        expResult.add(new Module("testModule", 1001));
        expResult.add(new Module("testModule2", 1002));
        expResult.add(new Module("testModule3", 1003));
        
        instance.addModule(expResult.get(0));
        instance.addModule(expResult.get(1));
        instance.addModule(expResult.get(2));
        
        ArrayList<Module> result = instance.getModules();
        assertEquals(expResult, result);
    }

    /**
     * Test of getStudents method, of class Course.
     */
    public void testGetStudents() {
        System.out.println("getStudents");
        Course instance = new Course("testCourse", LocalDate.of(2018,9,10), LocalDate.of(2019,5,30));
        ArrayList<Student> expResult = new ArrayList<Student>();
        expResult.add(new Student("testStudent", 21, LocalDate.of(1997,1,1), 1001));
        expResult.add(new Student("testStudent2", 22, LocalDate.of(1996,1,1), 1002));
        expResult.add(new Student("testStudent3", 23, LocalDate.of(1995,1,1), 1003));
        
        instance.addStudent(expResult.get(0));
        instance.addStudent(expResult.get(1));
        instance.addStudent(expResult.get(2));
        
        ArrayList<Student> result = instance.getStudents();
        assertEquals(expResult, result);
    }

    /**
     * Test of getName method, of class Course.
     */
    public void testGetName() {
        System.out.println("getName");
        Course instance = new Course("testCourse", LocalDate.of(2018,9,10), LocalDate.of(2019,5,30));
        String expResult = "testCourse";
        String result = instance.getName();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setName method, of class Course.
     */
    public void testSetName() {
        System.out.println("setName");
        String name = "changedNameTest";
        Course instance = new Course("testCourse", LocalDate.of(2018,9,10), LocalDate.of(2019,5,30));
        instance.setName(name);
        
        assertEquals(name, instance.getName());
    }

    /**
     * Test of getStartDate method, of class Course.
     */
    public void testGetStartDate() {
        System.out.println("getStartDate");
        Course instance = new Course("testCourse", LocalDate.of(2018,9,10), LocalDate.of(2019,5,30));
        LocalDate expResult = LocalDate.of(2018,9,10);
        LocalDate result = instance.getStartDate();
        assertEquals(expResult, result);
    }

    /**
     * Test of setStartDate method, of class Course.
     */
    public void testSetStartDate() {
        System.out.println("setStartDate");
        LocalDate startDate = LocalDate.of(2016,8,31);
        Course instance = new Course("testCourse", LocalDate.of(2018,9,10), LocalDate.of(2019,5,30));
        instance.setStartDate(startDate);
        
        assertEquals(startDate, instance.getStartDate());
    }

    /**
     * Test of getEndDate method, of class Course.
     */
    public void testGetEndDate() {
        System.out.println("getEndDate");
        Course instance = new Course("testCourse", LocalDate.of(2018,9,10), LocalDate.of(2019,5,30));
        LocalDate expResult = LocalDate.of(2019,5,30);
        LocalDate result = instance.getEndDate();
        assertEquals(expResult, result);
    }

    /**
     * Test of setEndDate method, of class Course.
     */
    public void testSetEndDate() {
        System.out.println("setEndDate");
        LocalDate endDate = LocalDate.of(2018,6,3);
        Course instance = new Course("testCourse", LocalDate.of(2018,9,10), LocalDate.of(2019,5,30));
        instance.setEndDate(endDate);
        
        assertEquals(endDate, instance.getEndDate());
    }
    
}
