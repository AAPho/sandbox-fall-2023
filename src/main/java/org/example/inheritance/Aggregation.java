package org.example.inheritance;

import java.util.List;

public class Aggregation {

    private String name;
    private List<String> names;
    private String address;

    public Aggregation() {
        this.address = "blah blah blah";  // composition
    }

    public Aggregation(String aggregation) {
        this.name = aggregation;  // aggregation
    }

    public void setName(String name) {
        names.add(name);  // aggregation
    }
}