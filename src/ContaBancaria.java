import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        String nome = "João Junior";
        String tipoConta = "Corrente";
        double saldo = 2000;
        int opcao = 0;

        System.out.println("***********************************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo conta: " + tipoConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println(" \n***********************************");

        String menu = """
                ** Digite sua opção **
                1 - Consultar saldo
                2 - Transferir valor
                3 - Receber valor
                4 - Sair
                """;

        Scanner leitura = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.println("Seu saldo é " + saldo);
            } else if (opcao == 2) {
                System.out.println("Digite o valor que quer transferir: ");
                Scanner leituraTransferir = new Scanner(System.in);
             double transferir = leituraTransferir.nextDouble();

                if (transferir > saldo) {
                    System.out.println("Não tem saldo suficiente para realizar esta operação. Seu saldo é de "+ saldo);
                } else {
                    saldo -= transferir;
                    System.out.println("Novo saldo é de " + saldo);
                }
            }
                else if (opcao == 3) {
                System.out.println("Digite o valor que irá receber: ");
                Scanner leituraReceber = new Scanner(System.in);
              double receber = leituraReceber.nextDouble();
                saldo += receber;
                System.out.println("Novo saldo é de " + saldo);
            } else if(opcao != 4) {
                System.out.println("Opção inválida!");
             }
        }
    }
}

