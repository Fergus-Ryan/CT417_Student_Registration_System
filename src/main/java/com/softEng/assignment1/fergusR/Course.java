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
public class Course {
    
    private String name;
    private ArrayList<Module> modules = new ArrayList<Module>();
    private ArrayList<Student> students = new ArrayList<Student>();
    private LocalDate startDate;
    private LocalDate endDate;
    
    public Course(String name, LocalDate start, LocalDate end){
        this.name = name;
        this.startDate = start;
        this.endDate = end;
    }
    
    public void addModule(Module m){
        this.modules.add(m);
    }
    
    public void addStudent(Student s){
        students.add(s);
    }

    public ArrayList<Module> getModules() {
        return modules;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
    
    @Override public String toString(){
        String modulesString = new String();
        for(int i=0; i<this.getModules().size(); i++){
                    modulesString += this.getModules().get(i).getName() + "\n";
        }
        String studentsString = new String();
        for(int i=0; i<this.getStudents().size(); i++){
                    studentsString += this.getStudents().get(i).getName() + "\n";
        }
        return "Course: " + this.name + "\n\tStart Date: " + this.startDate + "\n\tEnd Date: " + this.endDate +
                "\n\tCourses:\n\t\t" +  modulesString +
                "\n\tStudents:\n\t\t" + studentsString;
    }
}
