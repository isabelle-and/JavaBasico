package aula3;

import java.util.ArrayList;
import java.util.List;

public class Listas {
    public static void main(String[] args) {
        
    List list1 = new ArrayList<Integer>();

    list1.add("arroz");
    list1.add("bolacha");
    list1.add("margarina");
    list1.add("leite");
    list1.add("leite");

    System.out.println("....[Listagem sem alteracoes]...");
        System.out.println(list1);
        System.out.println("....[Listagem com alteracoes]....");
        list1.set(2, "manteiga");
        System.out.println(list1);
        System.out.println("....[Listagem com remocoes]....");
        list1.remove(1);
        System.out.println(list1);
        System.out.println("....[Listagem com adicoes]....");
        list1.add(1, "biscoito");
        System.out.println(list1);


    }   
}
