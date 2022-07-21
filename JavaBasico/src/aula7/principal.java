package aula7;

import java.util.Scanner;


public class principal extends Equacao {
    public static void main(String[] args) {
        
        Delta delta = new Delta();
        EqXn xnXp = new EqXn();
        Scanner entrada = new Scanner(System.in);


        
        System.out.println("Qual o valor de a?");
        delta.setA(entrada.nextDouble());
       
        System.out.println("Qual o valor de b?");
        delta.setB(entrada.nextDouble());
       
        System.out.println("Qual o valor de c?");
        delta.setC(entrada.nextDouble());

        delta.calculaDelta();
    
        if (delta.getDelta() < 0) {
            System.out.println("a equacao nao possui raizes reais.");
        } else {
            System.out.println("xn :" + xnXp.calculaXn(delta));
            System.out.println("xp :" + xnXp.calculaXp(delta));
        }

    }
}

