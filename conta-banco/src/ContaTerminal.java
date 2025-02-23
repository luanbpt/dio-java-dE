import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);

        System.out.println("Por favor digite o numero da sua conta! ");
        int numero = sc.nextInt();

        sc.nextLine();
        
        System.out.println("Por favor digite o numero da sua Agencia ");
        String agencia = sc.nextLine();
        
        System.out.println("Por favor digite o seu nome ");
        String nomecliente = sc.nextLine();

        System.out.println("Por favor digite o seu saldo ");
        Double saldo = sc.nextDouble();

        System.out.println("Olá " + nomecliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo de " + saldo + " já esta disponivel para saque.");

        sc.close();


    }
}
