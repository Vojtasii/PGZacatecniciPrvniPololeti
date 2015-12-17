public class Graf {
    public static void main(String args[]) {
        int pole[] = new int[100];
        java.util.Scanner sc = new java.util.Scanner(System.in);
	int max = 0;
	int celkem = 0;
        for (int i = 0; i < pole.length; i++){
            if (!sc.hasNextInt()) {
                break;
            }
            pole[i] = sc.nextInt();
            celkem++;
	    if (pole[i] > max) {max = pole[i]; }
        }

	int delitel = 1;
	if (max > 50) {delitel = max / 50; }

        for (int i = 0; i < celkem; i++) {
	    int vstup = pole[i];
	    pole[i] /= delitel;
	    System.out.printf("%2d. ", i);
            for (int y = pole[i]; y > 0; y--) {System.out.printf("#"); }
	    System.out.printf("%10d ", vstup);
	    System.out.println();
        }
    }
}