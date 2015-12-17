public class Revers {
    public static void main(String args[]) {
        int pole[] = new int[5];
        System.out.printf("Zadejte 5 cisel: ");
        java.util.Scanner sc = new java.util.Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            pole[i] = sc.nextInt();
        }
        for (int i = pole.length - 1; i >= 0; i--) {
            System.out.printf(" %d", pole[i]);
        }
        System.out.println();
    }
}