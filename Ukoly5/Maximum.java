public class Maximum {
    public static void main(String[] args) {
	int max = 0;

	java.util.Scanner vstup = new java.util.Scanner(System.in);

	while (vstup.hasNextInt()) {
	    int i = vstup.nextInt();
	    if(max < i){max = i;}
	}

	System.out.printf("Nejvetsi z techto cisel je %d, \n", max);
    }
}