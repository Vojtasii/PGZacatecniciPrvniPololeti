public class CetnostCisel {
    public static void main(String[] args) {
        Zaznam[] cetnosti = new Zaznam[500];
        int pocet = 0;
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        while (scanner.hasNextInt()) {
            int cislo = scanner.nextInt();
            boolean nasel = false;
            for (int i = 0; i < pocet; i++) {
                if (cetnosti[i].cislo == cislo) {
                    cetnosti[i].pocet++;
                    nasel = true;
                    break;
                }
            }
            if (!nasel) {
                if (pocet < cetnosti.length) {
                    cetnosti[pocet] = new Zaznam(cislo);
                    pocet++;
                } else {
                    System.out.printf("Preskakuji %d!\n", cislo);
                }
            }
        }
         
        for (int i = 0; i < pocet; i++) {
            System.out.printf("%3d tam bylo %dx.\n", cetnosti[i].cislo,
                cetnosti[i].pocet);
        }
    }
}