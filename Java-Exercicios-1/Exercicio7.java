public class Exercicio7 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            switch (i) {
                case 1:
                    System.out.println("Número: 1 - Mensagem para o número 1");
                    break;
                case 2:
                    System.out.println("Número: 2 - Mensagem para o número 2");
                    break;
                case 3:
                    System.out.println("Número: 3 - Mensagem para o número 3");
                   
                    break;
                case 4:
                    System.out.println("Número: 4 - Mensagem para o número 4");
                    break;
                case 5:
                    System.out.println("Número: 5 - Mensagem para o número 5");
                    break;
                default:
                    System.out.println("Número desconhecido");
            }

            if (i == 3) {
                break;
            }
        }
    }
}
