public class Ramecek2 {
    public static void main(String[] args) {
	int sirka = Integer.valueOf(args[0]);
        int vyska = Integer.valueOf(args[1]);
	int tloustka = Integer.valueOf(args[2]);
         
        for (int radek = 0; radek < vyska + 2*tloustka; radek++) {
            for (int sloupec = 0; sloupec < sirka + 2*tloustka; sloupec++) {
                if (
                        (radek >= tloustka)
                        && (radek < tloustka + vyska)
                        && (sloupec >= tloustka)
                        && (sloupec < tloustka + sirka)
                    ) {
                    System.out.printf(" ");
                } else {
                    System.out.printf("X");
                }
            }
            System.out.println();
        }
    }
}