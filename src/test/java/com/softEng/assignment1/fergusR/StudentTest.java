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
public class StudentTest extends TestCase {
    
    public StudentTest(String testName) {
        super(testName);
    }

    /**
     * Test of getUsername method, of class Student.
     */
    public void testGetUsername() {
        System.out.println("getUsername");
        Student instance = new Student("testStudent", 21, LocalDate.of(1997,1,1), 1001);
        String expResult = "testStudent21";
        String result = instance.getUsername();
        assertEquals(expResult, result);
    }

    /**
     * Test of getName method, of class Student.
     */
    public void testGetName() {
        System.out.println("getName");
        Student instance = new Student("testStudent", 21, LocalDate.of(1997,1,1), 1001);
        String expResult = "testStudent";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getAge method, of class Student.
     */
    public void testGetAge() {
        System.out.println("getAge");
        Student instance = new Student("testStudent", 21, LocalDate.of(1997,1,1), 1001);
        int expResult = 21;
        int result = instance.getAge();
        assertEquals(expResult, result);
    }

    /**
     * Test of getId method, of class Student.
     */
    public void testGetId() {
        System.out.println("getId");
        Student instance = new Student("testStudent", 21, LocalDate.of(1997,1,1), 1001);
        int expResult = 1001;
        int result = instance.getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDob method, of class Student.
     */
    public void testGetDob() {
        System.out.println("getDob");
        Student instance = new Student("testStudent", 21, LocalDate.of(1997,1,1), 1001);
        LocalDate expResult = LocalDate.of(1997,1,1);
        LocalDate result = instance.getDob();
        assertEquals(expResult, result);
    }

    /**
     * Test of addCourse method, of class Student.
     */
    public void testAddCourse() {
        System.out.println("addCourse");
        Course c = new Course("testCourse", LocalDate.of(2018,9,10), LocalDate.of(2019,5,30));
        Student instance = new Student("testStudent", 21, LocalDate.of(1997,1,1), 1001);
        instance.addCourse(c);
        assertEquals(c, instance.getCourses().get(0));
    }

    /**
     * Test of removeCourse method, of class Student.
     */
    public void testRemoveCourse() {
        System.out.println("removeCourse");
        Course c = new Course("testCourse", LocalDate.of(2018,9,10), LocalDate.of(2019,5,30));
        Student instance = new Student("testStudent", 21, LocalDate.of(1997,1,1), 1001);
        instance.addCourse(c);
        assertEquals(c, instance.getCourses().get(0));
        instance.removeCourse(c);
    }

    /**
     * Test of getCourses method, of class Student.
     */
    public void testGetCourses() {
        System.out.println("getCourses");
        Student instance = new Student("testStudent", 21, LocalDate.of(1997,1,1), 1001);
        ArrayList<Course> expResult = new ArrayList<Course>();
        expResult.add(new Course("testCourse", LocalDate.of(2018,9,10), LocalDate.of(2019,5,30)));
        expResult.add(new Course("testCourse2", LocalDate.of(2017,8,30), LocalDate.of(2018,6,4)));
        expResult.add(new Course("testCourse2", LocalDate.of(2016,9,7), LocalDate.of(2017,5,20)));
        
        instance.addCourse(expResult.get(0));
        instance.addCourse(expResult.get(1));
        instance.addCourse(expResult.get(2));
        
        ArrayList<Course> result = instance.getCourses();
        assertEquals(expResult, result);
    }

    /**
     * Test of addModule method, of class Student.
     */
    public void testAddModule() {
        System.out.println("addModule");
        Module m = new Module("testModule", 1001);
        Student instance = new Student("testStudent", 21, LocalDate.of(1997,1,1), 1001);
        instance.addModule(m);
        assertEquals(m, instance.getModules().get(0));
    }

    /**
     * Test of removeModule method, of class Student.
     */
    public void testRemoveModule() {
        System.out.println("removeModule");
        Module m = new Module("testModule", 1001);
        Student instance = new Student("testStudent", 21, LocalDate.of(1997,1,1), 1001);
        instance.addModule(m);
        assertEquals(m, instance.getModules().get(0));
        instance.removeModule(m);
    }

    /**
     * Test of getModueles method, of class Student.
     */
    public void testGetModules() {
        System.out.println("getModueles");
        Student instance = new Student("testStudent", 21, LocalDate.of(1997,1,1), 1001);
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
    
}
