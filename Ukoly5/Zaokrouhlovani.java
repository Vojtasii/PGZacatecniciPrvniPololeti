public class Zaokrouhlovani {
    public static void main(String[] args) {
        /*
         * Zm��te n�sleduj�c� na 2, 4 nebo 5 a pozorujte rozd�ly.
         * A hlavn�: JE NEZAPOME�TE!
         */
        int kroku = 5;
        double zdibec = 1. / kroku;
        double cislo = 0.;
        for (int i = 0; i < 25 * kroku; i++) {
            if ((i % kroku) == 0) {
                double ocekavam = i / kroku;
                if (cislo == ocekavam) {
                    System.out.printf("==> %.0f je ok\n", cislo);
                } else {
                    System.out.printf("%20.16f != %20.16f\n", ocekavam, cislo);
                }
            }
            cislo += zdibec;
        }
    }
}