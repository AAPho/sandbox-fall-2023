package org.example.generics;

public class GenericsDriver {

    public static void main(String[] args) {
        Box<Integer> box = new Box<>();
        box.setN(1234);
        System.out.println(box.getN());

        Box<String> box2 = new Box<>();
        box2.setN("string test");
        System.out.println(box2.getN());

        Box<Float> box3 = new Box<>();
        box3.setN(12.3f);
        System.out.println(box3.getN());

        Box<Integer> box4 = new Box<>();
        box4.setN(1234);

        Crate<Box<?>> cr = new Crate<>();
        cr.addBox(box);
        cr.addBox(box2);
        cr.addBox(box3);
        cr.addBox(box4);

        for(Box<?> b : cr.getContainers()){
            System.out.println(b.getN());
        }

        System.out.println(StringUtil.concatenate("Hello ", "World!"));
        System.out.println(StringUtil.concatenate("Hello ", new Message("world!")));

    }

}
