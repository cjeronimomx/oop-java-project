package com.nt.oopjavaservice.session;

public class Array_ {

    public static void main(String[] args) {
        String servers[] = new String[4];
        for (int i = 0; i < servers.length; i++) {
            servers[i] = "Server" + i;
            System.out.println("i=" + i + " Dato="+servers[i]);
        }
    }

}
