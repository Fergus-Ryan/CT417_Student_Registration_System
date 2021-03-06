/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softEng.assignment1.fergusR;

import java.util.ArrayList;

/**
 *
 * @author F
 */
public class Module {
    
    private String name;
    private int id;
    private ArrayList<Student> students = new ArrayList<Student>();
    private ArrayList<Course> courses = new ArrayList<Course>();
    
    public Module(String name,int id){
        this.name = name;
        this.id = id;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public void addStudent(Student s){
        this.students.add(s);
    }
    
    public void removeStudent(Student s){
        this.students.remove(s);
    }
    
    public ArrayList<Student> getStudents(){
        return this.students;
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
    
    @Override public String toString(){
        String coursesString = new String();
        for(int i=0; i<this.getCourses().size(); i++){
                    coursesString += this.getCourses().get(i).getName() + "\n\t\t";
        }
        String studentsString = new String();
        for(int i=0; i<this.getStudents().size(); i++){
                    studentsString += this.getStudents().get(i).getName() + "\n\t\t";
        }
        return "Module: " + this.name + "\n\tID: " + Integer.toString(this.id) +
                "\n\tCourses:\n\t\t" +  coursesString +
                "\n\tStudents:\n\t\t" + studentsString;
    }
}   
    
    
    
    

