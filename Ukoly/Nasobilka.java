public class Nasobilka {
    public static void main(String[] args) {
        for (int r = 1; r * 10 <= 100; r++) {
	    for (int s = 1; s <= 10; s++) {
//	    	if (r * s < 10) {System.out.printf("  "); }
//		else if (r * s < 100) {System.out.printf(" "); }
		System.out.printf("%3d ", r * s);
            }    
	System.out.println();
        }
    }
}
