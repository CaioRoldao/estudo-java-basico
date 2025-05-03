package sistemaBancario;

public class Conta {

    private int numero;

    private double saldo;

    private Pessoa pessoa;

    public Conta() {

    }

    public Conta(int Conta, double saldo, Pessoa pessoa){
        this.numero = numero;
        this.saldo = saldo;
        this.pessoa = pessoa;
    }

    public int getNumero(){
        return numero;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public double getSaldo(){
        return saldo;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
}
