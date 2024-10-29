import java.util.Scanner;

public class ContaTerminal {

public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    
    String agencia;
    Integer numConta; 
    String nomeCliente; 
    Double saldo;

    System.out.println("Digite o número da sua agencia: ");
    agencia = scanner.nextLine();

    System.out.println("Digite o número da sua conta: ");
    numConta = Integer.parseInt(scanner.nextLine());

    System.out.println("Digite seu nome completo: ");
    nomeCliente = scanner.nextLine();

    System.out.println("Digite o saldo de sua conta: ");
    saldo = scanner.nextDouble();

    System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agencia é " + agencia + ", conta " + numConta + " e seu saldo " + saldo + " já está disponivel para saque ");



    scanner.close();
}


}