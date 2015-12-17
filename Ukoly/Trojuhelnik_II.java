public class Trojuhelnik_II {
    public static void main(String[] args) {
	int x = 5;
        for (int i = 1; i <= x; i = i + 1) {
	    for (int z = 0; z < (x - i); z = z + 1) { System.out.printf(" "); }
	    for (int z = 0; z < i; z = z + 1) { System.out.printf("X"); }
            System.out.println();	    
        }
    }
}