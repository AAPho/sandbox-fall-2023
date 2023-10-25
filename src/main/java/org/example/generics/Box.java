package org.example.generics;

public class Box<N>  {

    private N n;

    public Box() {
    }

    public Box(N n) {
        this.n = n;
    }

    public N getN() {
        return this.n;
    }

    public void setN(N n) {
        this.n = n;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Box{");
        sb.append("id=").append(n);
        sb.append('}');
        return sb.toString();
    }



}
