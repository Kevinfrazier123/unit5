package org.example;

abstract public class Student {

    // . . .
    String name;
    String id;


    // This is the constructor (All abstract classes got this)
    public Student ( String name , String id) {

        // . . .
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    abstract public void printInvoice();



}