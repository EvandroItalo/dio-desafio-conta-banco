import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int    numero;
        double saldo;
        String agencia;
        String nomeCliente;
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("-------------------------");
        System.out.println("Banco Innovation Digital");
        System.out.println("-------------------------");
        System.out.print("Por favor, digite seu nome: ");
        nomeCliente = scan.nextLine();
        System.out.print("Digite sua agência: ");
        agencia = scan.next();
        System.out.print("Digite sua Conta: ");
        numero = scan.nextInt();

        //Fiquei na dúvida se por ser um teste digitar o saldo ou iniciar a variável com 0 e imprimir o Zero, de qualquer forma.
        System.out.print("Digite seu saldo: "); //Quem dera pudesse fazer isso na vida real.
        saldo = scan.nextDouble();

        System.out.println(" ");
        System.out.println(" ");

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo de " + saldo + " já está disponível para saque.");

        System.out.println(" ");
        System.out.println("Resumo: ");
        System.out.println("______________________________________");
        System.out.println("| NOME DO CLIENTE | : " + nomeCliente);
        System.out.println("|     AGÊNCIA     | : " + agencia);
        System.out.println("|      CONTA      | : " + numero);
        System.out.println("|      SALDO      | : " + saldo);
        System.out.println("______________________________________");


    }
}