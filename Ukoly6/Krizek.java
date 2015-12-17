public class Krizek {

    public static void main(String[] args) {

	int velikost = Integer.valueOf(args[0]);

	for (int y = velikost; y > 0; y--) {
	    for (int x = velikost * 2; x > 0; x--) {
		if ( (x >= velikost / 2 && x < velikost * 1.5 + 1)
		    || (y > velikost / 3 && y < (velikost - (velikost / 3))) ) {
                    System.out.printf("X"); }
                else {
                    System.out.printf(" "); }
	    }
	    System.out.println();	    
	}
    }
}