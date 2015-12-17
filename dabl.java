public class dabl {
    public static void main(String[] args) {
	int suma = 0;

	java.util.Scanner vstup = new java.util.Scanner(System.in);

	while (vstup.hasNextInt()) {
	    suma += vstup.nextInt();
	}

	System.out.printf("Suma je %d. \n", suma);
    }
}