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
public class ModuleTest extends TestCase {
    
    public ModuleTest(String testName) {
        super(testName);
    }

    /**
     * Test of getName method, of class Module.
     */
    public void testGetName() {
        System.out.println("getName");
        Module instance = new Module("testModule", 1001);
        String expResult = "testModule";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setName method, of class Module.
     */
    public void testSetName() {
        System.out.println("setName");
        String name = "changeNameTest";
        Module instance = new Module("testModule", 1001);
        instance.setName(name);
        assertEquals(name, instance.getName());
    }

    /**
     * Test of getId method, of class Module.
     */
    public void testGetId() {
        System.out.println("getId");
        Module instance = new Module("testModule", 1001);
        int expResult = 1001;
        int result = instance.getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setId method, of class Module.
     */
    public void testSetId() {
        System.out.println("setId");
        int id = 1002;
        Module instance = new Module("testModule", 1001);
        instance.setId(id);
        assertEquals(id, instance.getId());
    }

    /**
     * Test of addStudent method, of class Module.
     */
    public void testAddStudent() {
        System.out.println("addStudent");
        Student s = new Student("testStudent", 21, LocalDate.of(1997,1,1), 1001);
        Module instance = new Module("testModule", 1001);
        instance.addStudent(s);
        assertEquals(s, instance.getStudents().get(0));
    }

    /**
     * Test of removeStudent method, of class Module.
     */
    public void testRemoveStudent() {
        System.out.println("removeStudent");
        Student s = new Student("testStudent", 21, LocalDate.of(1997,1,1), 1001);
        Module instance = new Module("testModule", 1001);
        instance.addStudent(s);
        assertEquals(s, instance.getStudents().get(0));
        
        instance.removeStudent(s);
    }

    /**
     * Test of getStudents method, of class Module.
     */
    public void testGetStudents() {
        System.out.println("getStudents");
        Module instance = new Module("testModule", 1001);
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
     * Test of addCourse method, of class Module.
     */
    public void testAddCourse() {
        System.out.println("addCourse");
        Course c = new Course("testCourse", LocalDate.of(2018,9,10), LocalDate.of(2019,5,30));
        Module instance = new Module("testModule", 1001);
        instance.addCourse(c);
        assertEquals(c, instance.getCourses().get(0));
    }

    /**
     * Test of removeCourse method, of class Module.
     */
    public void testRemoveCourse() {
        System.out.println("removeCourse");
        Course c = new Course("testCourse", LocalDate.of(2018,9,10), LocalDate.of(2019,5,30));
        Module instance = new Module("testModule", 1001);
        instance.addCourse(c);
        assertEquals(c, instance.getCourses().get(0));
        instance.removeCourse(c);
    }

    /**
     * Test of getCourses method, of class Module.
     */
    public void testGetCourses() {
        System.out.println("getCourses");
        Module instance = new Module("testModule", 1001);
        ArrayList<Course> expResult = new ArrayList<Course>();
        expResult.add(new Course("testCourse", LocalDate.of(2018,9,10), LocalDate.of(2019,5,30)));
        expResult.add(new Course("testCourse2", LocalDate.of(2017,8,30), LocalDate.of(2018,6,4)));
        expResult.add(new Course("testCourse2", LocalDate.of(2016,9,6), LocalDate.of(2017,5,25)));
        
        instance.addCourse(expResult.get(0));
        instance.addCourse(expResult.get(1));
        instance.addCourse(expResult.get(2));
        
        ArrayList<Course> result = instance.getCourses();
        assertEquals(expResult, result);
    }
    
}
