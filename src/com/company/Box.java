package com.company;

public class Box <T, V> {

    private T object1;
    private V object2;
    
    public Box(T obj1, V obj2){
        object1 = obj1;
        object2 = obj2;
    }

    public void showTAndV(){
        System.out.println("Type T: " + object1.getClass().getName());
        System.out.println("Type V: " + object2.getClass().getName());
    }

    public T getObject1() {
        return object1;
    }

    public void setObject1(T object1) {
        this.object1 = object1;
    }

    public V getObject2() {
        return object2;
    }

    public void setObject2(V object2) {
        this.object2 = object2;
    }

    @Override
    public String toString() {
        return "Box{" +
                "object1=" + object1 +
                ", object2=" + object2 +
                '}';
    }
}