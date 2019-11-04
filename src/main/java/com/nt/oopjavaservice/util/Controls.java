package com.nt.oopjavaservice.util;

public class Controls {
    public static void main(String[] args) {
        forEach();
        //iF();
        switcH();
        //whilE();
        //forEach();
            }

    public static void iF() {
        int contador = 2;
        int auxiliar = 4;
        if (contador == 1) {
            System.out.println("Contador 1");
        } else if (contador == 2){
            System.out.println("Contador 2");
        } else if (contador ==3){
            System.out.println("Contador 3");
        }
    }

    public static void switcH(){
        int dato =6;
                //Tipo de  <=int,Strings
        switch (dato){
            case 1:
                System.out.println("Dato es =1");
                break;
            case 2:
                System.out.println("Dato es =2");
                break;

            default:
                System.out.println("Dato " + dato + "es un numero raro");
        }
    }

    public static void whilE(){
        int counter = 0;
        while(counter++ < 10){
            System.out.println("Counter : "+ counter);
        }

    }

    public static void forEach(){
        //1.- Inicializacion de contador
        //2.- Establecer la condicion de cuando se para
        //3.- Incremento o decremento del contador
        //for (int i = 0; i < 10 ;  ) {
          //  System.out.println("Contador en for i=" + i);

            String word = "Happy birthday Erika 27";
            int cont =0;
            for(char letter:word.toCharArray()) {
                //System.out.println(++cont +" \t" + letter);
                System.out.print("\t" + letter);
            }
        }
    }




