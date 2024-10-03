import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual seu nome?");
        String nome1 = scanner.nextLine();

        System.out.println("Bom dia , vamos criar sua conta Senhor(a)" + nome1);

        System.out.println("Qual será numero da sua conta?");
        int numero = scanner.nextInt();

        System.out.println("Qual será a agencia de sua conta?");
        int agencia = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Qual seu nome completo?");
        String nome = scanner.nextLine();

        System.out.println("Quanto depositara na conta?");
        int saldo = scanner.nextInt();

        System.out.printf("Ola %s, obrigado por criar uma conta em nosso banco, sua agencia é %s , conta %s  e seu saldo de %s já esta disponivel para saque.", nome, agencia, numero, saldo );
        
        

        
        //TODO: Conhecer e importar classe scanner
        // EXIBIR AS MENSAGENS PARA O NOSSO USUARIO
        //OBTER PELA SCANNER OS VALORES DIGITADOS NO TERMINAL
        //EXIBI A MENSAGEM CONTA CRIADA
    }
}
