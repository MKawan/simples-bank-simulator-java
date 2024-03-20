import modules.ContaBankUser;
import java.util.Locale;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        ContaBankUser contaUser1 = new ContaBankUser();

        System.out.println("Vamos abrir uma conta!");

        System.out.println("Digite seu nome.");
        contaUser1.nameUser = scanner.next();

        System.out.println("Digite 8 numeros para a conta.");
        contaUser1.conta = scanner.nextInt();
        
        System.out.println("Digite 5 numeros para a agencia neste modelo ####-#.");
        contaUser1.agencia = scanner.next();

        System.out.println("Nome: " + contaUser1.nameUser + "\nConta: " + contaUser1.conta + "\nAgencia: " + contaUser1.agencia);
        
        System.out.println("Faça um Deposito: ");
        double deposit = scanner.nextDouble();
        contaUser1.DepositValue(deposit);

        System.out.println("Faça um Saue: ");
        double saque = scanner.nextDouble();
        contaUser1.SaqueValue(saque);

        contaUser1.SaldoAtual();
    }
}
