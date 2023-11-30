public class Exercicio10 {
    public static void main(String[] args) {
        int[] numeros = { 2, 8, -5, 10, 3, -7, 1, 4 };

        for (int numero : numeros) {
            
            System.out.println(numero);

       
            if (numero < 0) {
                System.out.println("Encontrou um número negativo. Saindo do loop.");
                break;
            }
        }
    }
}
