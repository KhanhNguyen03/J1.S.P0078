/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class Student {
    private String name;
    private String classes;
    private float Mark;

    public Student(String name, String classes, float Mark) {
        this.name = name;
        this.classes = classes;
        this.Mark = Mark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String Class) {
        this.classes = Class;
    }

    public float getMark() {
        return Mark;
    }

    public void setMark(float Mark) {
        this.Mark = Mark;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", Class=" + classes + ", Mark=" + Mark + '}';
    }
    
}
