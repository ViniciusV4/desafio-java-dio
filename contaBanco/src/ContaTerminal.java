import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        Scanner entradaDados = new Scanner(System.in);

        System.out.println("*******************Bem vindo ao MarkBank*******************");

        System.out.println("Digite seu nome: ");
        nomeCliente = entradaDados.nextLine();

        System.out.println("Digite o numero da agencia: ");
        agencia = entradaDados.nextLine();

        System.out.println("Digite o numero da conta: ");
        numero = entradaDados.nextInt();

        System.out.println("Digite o saldo da conta: ");
        saldo = entradaDados.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +", conta " + numero + "e seu saldo " + saldo + " já está disponível para saque");
    }
}