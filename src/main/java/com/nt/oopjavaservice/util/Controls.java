package com.nt.oopjavaservice.util;

public class Controls {
    public static void main(String[] args){
     //   iF ();
     //   switcH ();
     //   whilE();
        forEach();
    }

    public static void iF(){
        int contador = 2;
        int auxiliar = 4;

        if (contador==1){  //si entonces    //  && -> And  || -> Or
            System.out.println("Contador 1");
        } else
            if (contador ==2){
            System.out.println("Contador 2");
        }else
            if (contador ==3){
                System.out.println("Contador 3");
            }
    }

    public static void switcH(){
        int dato =5;
        //Tipo de dato <=int, String
        switch (dato){
            case 1:
                System.out.println("Dato=1");
                System.out.println("Sigue el caso 1");
            break;

            case 2:
                System.out.println("Dato=2");
            break;

            case 3:
                System.out.println("Dato=3");
                break;

            default:
                System.out.println("Dato es un numero raro");

        }
    }
 public static void whilE(){
        int counter =0;
        while (counter < 10){
            counter++;
            System.out.println("Counter = " + counter);
        }
 }

   public static void forEach(){
       //1.-inicializacion de contador  2.-Condicion   3.-Incremento del contador
       for (int i= 0; i < 10 ; i++) {
        //   System.out.println("Contando en for i= " + i);
       }

        String word = "Happy birthday Erika";
       for (char letter : word.toCharArray()) {
        System.out.println("\t" + letter);
       }
   }

}
