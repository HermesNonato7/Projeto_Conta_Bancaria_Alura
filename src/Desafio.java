import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {

        String nome = "Hermes";
        String tipoConta = "Corrente";
        double saldo = 1599.99;
        int opcao = 0;

        System.out.println("*******************************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo da conta: " + tipoConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("\n*******************************");

        String menu = """
                ** Digite sua opçãoo **
                1 - Consultar saldo
                2 - Depositar valor
                3 - Sacar valor
                4 - Sair
                5 teste
                
                """;

        Scanner leitura = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

        }

    }
}