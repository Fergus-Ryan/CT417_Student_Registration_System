/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softEng.assignment1.fergusR;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author F
 */
public class Student {
    private String name;
    private int age;
    private LocalDate dob;
    private int id;
    private String username;
    private ArrayList<Course> courses = new ArrayList<Course>();
    private ArrayList<Module> modules = new ArrayList<Module>();
    
    public Student(String name, int age, LocalDate dob, int id){
        this.name = name;
        this.age = age;
        this.dob = dob;
        this.id = id;
        setUsername();
    }
    
    private void setUsername(){
        this.username = name + Integer.toString(age);
    }
    
    public String getUsername(){
        return this.username;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getAge(){
        return this.age;
    }
    
    public int getId(){
        return this.id;
    }
    
    public LocalDate getDob(){
        return this.dob;
    }
    
    public void addCourse(Course c){
        this.courses.add(c);
    }
    
    public void removeCourse(Course c){
        this.courses.remove(c);
    }
    
    public ArrayList<Course> getCourses(){
        return this.courses;
    }
    
    public void addModule(Module m){
        this.modules.add(m);
    }
    
    public void removeModule(Module m){
        this.modules.remove(m);
    }
    
    public ArrayList<Module> getModules(){
        return this.modules;
    }
    
}
