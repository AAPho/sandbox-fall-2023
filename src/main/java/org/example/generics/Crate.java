package org.example.generics;

import java.util.ArrayList;
import java.util.List;

public class Crate<T extends Box<?>> {

    protected List<T> containers;

    public Crate(){
        containers = new ArrayList<>();
    }

    public void addBox(T box){
        this.containers.add(box);
    }

    public List<T> getContainers(){
        return containers;
    }

}
