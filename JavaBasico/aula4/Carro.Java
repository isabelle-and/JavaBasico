package aula4;

import java.lang.Math;

public class Carro{
    //#region Atributos 
    String marca;
    String modelo;

    int numPassageiro;
    double capCombustivel;
    double consCombustivel; //double variaveis globais
    String tipoCombustivel;

    //#endregion

    //#region Regras de Negocios da Classe(métodos)

    public double calculaAutonomia(){
        return Math.round((this.capCombustivel * this.consCombustivel));
    }
    //#endregion

    public double verificarEcoDesempenho(){
        double eco = this.calculaAutonomia()/this.numPassageiro;
        return Math.round(eco);
    }

    public boolean validaecoDesempenho(double indice){
        if(this.verificarEcoDesempenho()>indice){
            return true;
        }else{
            return false;
        }
    }
    public double verificarCombustivel(double gasolina){
        if(this.tipoCombustivel == "gasolina") {
            retunr this.verificarEcoDesempenho() * 1.6;
        }

    }

}
