public class Kombinacni {
    public static void main(String[] args) {
        int k = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        int C = (faktorial(n) / (faktorial(n - k) * faktorial (k)));
        System.out.printf("Kombinacni cislo je %d \n", C);
    }
    
    public static int faktorial(int x) {
	int r = 1;
        for (int i = 0; i < x; i++) {
	    r = r * (i + 1);
        }
        return (r);
    }

}
