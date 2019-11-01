package com.nt.oopjavaservice.util;

public class Controls {
    public static void main(String[] args) {
        //iF();
        //sWitch();
        //whilE();
        forEach();
    }

    public static void iF(){
        int contador=2;
        int auxiliar=4;

        if(contador == 2 && auxiliar == 4){
            System.out.println("If verdadero");
        }else{
            System.out.println("If falso");
        }
    }

    public static void sWitch(){
        int dato=2;
        switch (dato){
            case 1:
                System.out.println("Dato 1");
                break;
            case 2:
                System.out.println("Dato 2");
                break;
            default:
                System.out.println("No existe esta opción");
        }
    }

    public static void whilE(){
        int cont=0;
        while (++cont < 10){
            System.out.println("C->"+ cont);
        }
    }

    public static  void forEach(){
        for (int i = 0; i < 10; i++) {
            System.out.println(i + "\n");
        }

        String word = "Una palabra";

        for (char letter : word.toCharArray() ) {
            System.out.println(letter);
        }
    }
}
