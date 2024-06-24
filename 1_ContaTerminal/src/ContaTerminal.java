import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
      
        System.out.println("Por favor, digite o número da sua Agência: ");
        String agencia = scanner.next(); 

    
        System.out.println(" Digite o número da sua conta: ");
        int conta = scanner.nextInt();
        scanner.nextLine();


        System.out.println(" Digite seu nome e sobrenome: ");
        String nomeCliente = scanner.nextLine();


        System.out.println(" Informe o saldo da sua conta: ");
        double saldo = scanner.nextDouble();

        

        System.out.print("Olá, " + nomeCliente + ", obrigado por criar uma conta no nosso banco. ");
        System.out.print ("Sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque. ");


        scanner.close();
    }
}
