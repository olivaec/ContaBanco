import java.util.Locale;
import java.util.Scanner;
        
        public class ContaTerminal {
            public static void main(String[] args) throws Exception {
                
                double saldo = 237.5;
                             
                    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
                    System.out.println("Por favor, digite o seu nome: ");
                    String nome = scanner.next();
        
                    System.out.println("Por favor, digite o número da agência: ");
                    String agencia = scanner.next();
        
                    System.out.println("Por favor, digite o número da conta: ");
                    int numConta = scanner.nextInt();
        
                    //Imprimindo:
                    System.out.println("Olá, " + nome +"!" + " Obrigado por criar uma conta em nosso banco! Sua conta " + numConta + ", agência " + agencia + ", está com saldo de R$ " + saldo +" disponível para saque!"); 
    }
}
