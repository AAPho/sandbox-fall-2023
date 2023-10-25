package org.example.comparable;

public class Fruit implements Comparable<Fruit> {

    private String name;
    private String description;
    private int quantity;
    private boolean pizzaTopping;

    public Fruit(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    @Override
    public int compareTo(Fruit that) {
        if(this.name.compareTo(that.name) < 0) {
            return 1;
        }else if(this.name.compareTo(that.name) > 0) {
            return -1;
        }else {
            if(this.quantity < that.quantity){
                return -1;
            }else if(this.quantity > that.quantity) {
                return 1;
            }else {
                return 0;
            }
        }
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Fruit{");
        sb.append("name='").append(name).append('\'');
        sb.append(", quantity=").append(quantity);
        sb.append('}');
        return sb.toString();
    }



}
