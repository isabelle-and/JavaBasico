package aula5;

public class Professor extends Pessoa{
    private double salario;
    private String nomeCurso;

    //#region encapsulamento[Getters and Setters]
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public String getNomeCurso() {
        return nomeCurso;
    }
    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }
    //#endregion

    //#region Regras de Negócios

    private double calculaSalario(){
        return Math.round((this.salario * 44) * 4.5);
    }
    public String montaHolerite(){
        String holerite;
        holerite = ("Nome do proefessor: "+ super.getNome() + System.lineSeparator());
        holerite+=("| CPF:" +super.getCpf() + System.lineSeparator());
        holerite+= (" | Valor salario: "+this.calculaSalario() + System.lineSeparator());
        holerite+= (" | Valor Hora: : "+ this.getSalario()+System.lineSeparator());
        holerite+= (" | Curso Referente: "+this.getNomeCurso()+System.lineSeparator());
        holerite += (" | Salario Bruto:  R$ " + this.calculaSalario() + System.lineSeparator());
        holerite += (" | Valor INSS: R$ " + this.caculaINSS() + System.lineSeparator());
        holerite += (" | Valor IRPF: R$ " + this.calculaIRPF() + System.lineSeparator());
        holerite += (" | Valor adicionais: R$ " + this.calculaAdicionais()) + System.lineSeparator();
        holerite += (" | Salario Liquido: R$ " +(this.calculaSalario() + this.calculaAdicionais() - this.caculaINSS() - this.calculaIRPF()));
        return holerite;
    }

    public double calculaINSS(){
        double baseCalc = 0;
        if (calculaSalario() <= 1212) {
            baseCalc = 0.075;
        } else if (calculaSalario() > 1212 && calculaSalario() <= 2427.35) {
            baseCalc = 0.09;
        } else if (calculaSalario() >= 2427.36 && calculaSalario() <= 3641.03) {
            baseCalc = 0.12;
        } else if (calculaSalario() > 3641.03 && calculaSalario() <= 7087.22) {
            baseCalc = 0.14;
        }
        return baseCalc * calculaSalario();
    }

public double calculaIRPF() {
        double baseImposto = 0;
        if (calculaSalario() <= 1903.98) {
             baseImposto= 0;
        } else if (calculaSalario() > 1903.99 && calculaSalario() <= 2826.65) {
            baseImposto = 0.075;
        } else if (calculaSalario() >= 2826.66 && calculaSalario() <= 3751.05) {
            baseImposto = 0.15;
        } else if (calculaSalario() > 3751.06 && calculaSalario() <= 4664.68) {
            baseImposto = 0.225;
        } else if (calculaSalario() > 4664.68) {
            baseImposto = 0.275;
        }
        return baseImposto * calculaSalario();
    }

    public double calculaAdicionais(){
        double addPlan = 0.3 * calculaSalario();
        double addDsr = 0.2 * calculaSalario();
        double adicionais = addDsr + addPlan;
        return adicionais;

    }

    // #endregion
}



    }

//#endregion   



    /*
     * Montar o método que calcula o INSS.
     * https://www.jornalcontabil.com.br/como-calcular-o-desconto-do-inss-nos-salarios-em-2022/#:~:text=At%C3%A9%20R%24%201.100%2C00%20(,e%206.433%2C57%20%E2%80%93%2014%25
     * Montar o método que calcula o IRPF com aliquotas a seguir:
     * https://www.gov.br/receitafederal/pt-br/assuntos/orientacao-tributaria/tributos/irpf-imposto-de-renda-pessoa-fisica
     * Montar o método de adição de planejamento de aula: 0,3 e DSR 0,2.
     */