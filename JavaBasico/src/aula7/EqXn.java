package aula7;

import java.lang.Math;

public class EqXn extends Equacao {
    private double xn;
    private double xp;

    //#regioninicio do metodo de acesso
    public double calculaXn(Delta delta) {
        xn = (-delta.getB() - Math.sqrt(delta.getDelta())) / 2 * delta.getA();
        return xn;
    }
    
    public double calculaXp(Delta delta) {
        xn = (-delta.getB() + Math.sqrt(delta.getDelta())) / 2 * delta.getA();
        return xp;
    }
    public double getXn() {
        return xn;
    }

    public void setXn(double xn) {
        this.xn = xn;
    }

    public double getXp() {
        return xp;

    public void setXp(double xp) {
        this.xp = xp;
    }
    //#endregion

}

}
