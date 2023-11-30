
    public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteração externa: " + i);

            for (int j = 1; j <= 5; j++) {
                System.out.println("   Iteração interna: " + j);

            
                if (j == 3) {
                    break;
                }
            }
        }
    }
}


