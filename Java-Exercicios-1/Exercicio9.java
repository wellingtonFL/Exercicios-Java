

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Digite um número (0 para sair): ");
            
           
            if (scanner.hasNextInt()) {
                int numero = scanner.nextInt();

               
                if (numero == 0) {
                    System.out.println("Você digitou 0. Saindo do loop.");
                    break;
                } else {
                    System.out.println("Você digitou: " + numero);
                }
            } else {
               
                System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
                scanner.next();
            }
        }

       
        scanner.close();
    }
}
 
    

