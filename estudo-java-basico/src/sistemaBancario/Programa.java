package sistemaBancario;

public class Programa {

    public static void main(String[] args){
          var pessoa = new Pessoa( "Caio", "47.554.854" );
          var conta = new Conta(123, 1000,pessoa);
          var operacao = new Operacaobancaria();


          operacao.saquar( 200.00, conta);
          operacao.depositar(1300, conta);

        var pessoa1 = new Pessoa( "Brenda", "43.456.789" );
        var conta1 = new Conta(1321, 100,pessoa1);

    operacao.transferir(500, conta, conta1);

        System.out.println(conta.getPessoa().getNome() + " " + conta.getSaldo());
        System.out.println(conta1.getPessoa().getNome()+ " " + conta1.getSaldo());
    }
}
