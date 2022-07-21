package aula3;

import java.util.Random;

public class Vetores{

    public static void main(String[] args){
        Random a = new Random();

        double[] valores= {
            a.nextInt(30),
            a.nextInt(70),
            a.nextInt(90),
            a.nextInt(120),
            a.nextInt(150),
            a.nextInt(180),
            a.nextInt(240)

        };

        double[] comparadores = {
            a.nextInt(10),
            a.nextInt(10),
            a.nextInt(10),
            a.nextInt(10),
            a.nextInt(10),
            a.nextInt(10),
            a.nextInt(10)

        };

        
            if (valores.length == comparadores.length){
                for(int i=0; i<valores.length;i++){
                    if(valores[i])
            }
        }
    
    }
}


            if((i*comparadores)%(comparadores)==0 && i!=0){
                System.out.println("multiplo do comparador");
            }
        
/*
 * 1. verifique se os vetores são do mesmo tamanho.
 * 2. compare cada execução de cada referência se ela é multiplo do comparador.
 * 3. faça a exbição na tela.
 */
