package org.example.inheritance;

public class Frog extends Amphibian {
    @Override
    public void eat(){
        System.out.println("Frog is eating");
    }

    @Override
    public void makeSound() {
        System.out.println("Frog makes sound");
    }

    @Override
    public void hunt() {
        System.out.println("Frog is being hunted");
    }

    @Override
    public void track() {

    }

    @Override
    public void socialize() {

    }
}
