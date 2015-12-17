public class Ramecek {
    public static void main(String[] args) {
	int sirka = Integer.valueOf(args[0]);
        int vyska = Integer.valueOf(args[1]);
	int tlous = Integer.valueOf(args[2]);

        for (int y = 0; y <= vyska; y++) {

	    if (y < tlous || y == vyska || y > (vyska - tlous) ) {
                for (int x = 0; x <= sirka; x++) {
		    System.out.print("X");
		}
            }
            else {
		for (int x = 0; x <= sirka; x++) {
		    if (x < tlous || x == sirka || x > (sirka - tlous) ) {System.out.print("X"); }
		    else {System.out.print(" ");}
                }
	    }
	System.out.println();
	}
               
    }
}