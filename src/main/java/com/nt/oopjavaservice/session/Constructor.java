package com.nt.oopjavaservice.session;

public class Constructor {
    private int att1;
    private boolean att2;

    public static void main(String[] args) {
        Constructor obj1 = new Constructor();
        Constructor obj2 = new Constructor(2);
        Constructor obj3 = new Constructor(6, true);

        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);

    }

    public Constructor(){}

    public Constructor(int num){
        this.att1 = num;
    }

    public Constructor(int num, boolean isTrue){
        this.att1 = num;
        this.att2 = isTrue;
    }

    @Override
    public String toString() {
        return "Constructor{" +
                "att1=" + att1 +
                ", att2=" + att2 +
                '}';
    }
}
