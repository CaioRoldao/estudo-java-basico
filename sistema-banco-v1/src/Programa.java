import arquivo.CaixaService;
import arquivo.ContaService;
import arquivo.impl.ContaServiceImpl;

import java.util.Scanner;

public class Programa {

    static Scanner sc = new Scanner(System.in);
    static CaixaService caixaService = new CaixaService();
    static ContaService contaService = new ContaServiceImpl();

    public static void main(String[] args) {
        while (true) {

            var opcao = exibirMenu();

            switch (opcao) {
                case 1 -> {
                    System.out.println("Cadastro selecionado");

                    sc.nextLine();

                    System.out.println("Informe o nome:");
                    String nome = sc.nextLine();

                    System.out.println("Informe o documento:");
                    String documento = sc.nextLine();

                    System.out.println("Informe a data de nascimento (dd-MM-yyyy):");
                    String dataNascimento = sc.nextLine();

                    System.out.println("Informe o saldo inicial:");
                    double saldo = sc.nextDouble();

                    try {
                        contaService.cadastrar(nome, documento, dataNascimento, saldo);
                        System.out.println("Conta cadastrada com sucesso!");
                    } catch (RuntimeException e) {
                        System.out.println("Erro ao cadastrar conta: " + e.getMessage());
                    }

                }
                case 2 -> {
                    System.out.println("Informe o numero da conta para o saque:");
                    int conta = sc.nextInt();

                    System.out.println("Informe o valor do saque:");
                    double valor = sc.nextDouble();

                    caixaService.saquar(conta, valor);
                }
                case 3 -> {
                    System.out.println("Informe o numero da conta para o deposito:");
                    int conta = sc.nextInt();

                    System.out.println("Informe o valor do deposito:");
                    double valor = sc.nextDouble();

                    caixaService.depositar(conta, valor);
                }
                case 4 -> {
                    System.out.println("transferencia selecionada");
                }
                case 5 -> {
                    System.out.println("Saindo do sistema");
                    System.exit(0);
                }
            }
        }

    }

    private static int exibirMenu() {
        System.out.println("========================================");
        System.out.println("         SISTEMA BANCÁRIO - CAIXA       ");
        System.out.println("========================================");
        System.out.println("              MENU PRINCIPAL            ");
        System.out.println("----------------------------------------");
        System.out.println("  1 - Cadastrar conta");
        System.out.println("  2 - Saque");
        System.out.println("  3 - Depósito");
        System.out.println("  4 - Transferência");
        System.out.println("  5 - Sair");
        System.out.println("----------------------------------------");
        System.out.print("Informe a opção desejada: ");

        while (!sc.hasNextInt()) {
            System.out.print("Opção inválida. Digite um número: ");
            sc.next();
        }

        return sc.nextInt();
    }

}
