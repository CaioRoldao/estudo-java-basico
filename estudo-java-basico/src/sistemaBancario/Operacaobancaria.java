package sistemaBancario;

public class Operacaobancaria {


    //saque
    public void saquar(double valorSaque,Conta conta){
        System.out.println("realizando saque na conta:" + conta.getNumero());

        var saldoatualConta = conta.getSaldo();

        System.out.println("saldo arual da conta:" + saldoatualConta);

        var novoSaldo = saldoatualConta - valorSaque;
        conta.setSaldo(novoSaldo);

        System.out.println("Saque realizado com sucesso. valor" + valorSaque);
        System.out.println("saldo atualizado é:" + conta.getSaldo());
    }

    //depositar

    public void depositar(double valorDeposito, Conta conta){

        System.out.println("realizando deposito em conta " + conta.getNumero());
        var saldoAtual = conta.getSaldo();
        var novoSaldoConta = saldoAtual + valorDeposito;
        conta.setSaldo(novoSaldoConta);
        System.out.println("Deposito realizado com sucesso." + conta.getSaldo());
        System.out.println("Seu saldo agora é " + conta.getSaldo());

    }

    // tranferencia
    public void transferir(double valorTransferencia, Conta contaOrigem, Conta contaDestino){
        saquar(valorTransferencia, contaOrigem);
        depositar(valorTransferencia, contaDestino);
    }

}
