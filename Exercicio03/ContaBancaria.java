package Exercicio03;

import java.awt.event.ContainerAdapter;
import java.util.*;

class ContaBancaria {

    private int numeroConta;
    private String nomeTitular;
    private float saldo;

    public ContaBancaria(int numeroConta, String nomeTitular, float saldo){
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
    }

    private List<ContaBancaria> allacc;

    public ContaBancaria(){
        allacc = new ArrayList<>();
    }

    public void addconta(ContaBancaria conta){
        allacc.add(conta);
    }

    public void setNovoSaldo(float novoSaldo){
        saldo = novoSaldo;
    }

    public float getSaldo(){
        return saldo;
    }

    public int getacc(){
        return numeroConta;
    }

    public boolean deposito(int contaProcurada, float valor){
        for (ContaBancaria c : allacc){
            if (c.getacc() == contaProcurada){
                c.setNovoSaldo(c.getSaldo() + valor);
                System.out.println("Operação bem sucedida!");
                return true;
            }
        }
        System.err.println("Erro!");
        return false;
    }
    public boolean saque(int contaProcurada, float valor){

        for (ContaBancaria c : allacc){
            if (c.getacc() == contaProcurada){
                c.setNovoSaldo(c.getSaldo() - valor);
                System.out.println("Operação bem sucedida!");
                return true;
            }
        }
        System.err.println("Erro!");
        return false;
    }

    public ContaBancaria buscarconta(int numeroConta) {
        for (ContaBancaria c : allacc) {
            if (c.getacc() == numeroConta) {
                return c;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Titular da conta: " + nomeTitular +
                "\nNumero da conta: " + numeroConta +
                "\nSaldo: " + saldo;
    }


}
