package org.example.inheritance;

public abstract class Animal implements Huntable {

    private String name;



    public void eat(){
        System.out.println("Animal eats");
    }

    public abstract void makeSound();

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
