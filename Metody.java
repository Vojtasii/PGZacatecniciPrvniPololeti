public class Metody {
    public static void main(String[] args) {
	int vyska = 5;

	for (int v = 1; v <= vyska; v++) {
    	opakujZnak(' ', vyska - v);
    	opakujZnak('X', v);
    	System.out.println();
    }
}

    public static void opakujZnak(char znak, int kolikrat) {
        while (kolikrat > 0) {
            System.out.printf("%c", znak);
            kolikrat--;
        }
    }
}