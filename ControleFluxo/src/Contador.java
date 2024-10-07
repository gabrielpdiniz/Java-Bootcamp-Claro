import java.util.Scanner;
public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro numero ");
        int paramentroUm = scanner.nextInt();

        System.out.println("Digite o segundo numero ");
        int paramentroDois =  scanner.nextInt();

        try {

            contar(paramentroUm, paramentroDois);
            
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parameto deve ser maior que o primeiro.");
        }
        
    }
    static void contar(int paramentroUm, int paramentroDois ) throws ParametrosInvalidosException {

        if (paramentroUm >= paramentroDois){
            throw new ParametrosInvalidosException("O segundo parametro deve ser maior que o primeiro");
        }

        for(int i = paramentroUm; i <= paramentroDois; i++){
            System.out.println("Imprimindo numero " + i);
        }

    }

}
