public class Den {
    public static void main(String[] args) {
	int rok = Integer.valueOf(args[0]);
	int mesic = Integer.valueOf(args[1]);
	int den = Integer.valueOf(args[2]);
	int[] dnyvm = {31,28,31,30,31,30,31,31,30,31,30,31};
	int celkem = 0;	
	if(jePrestupny(rok)) {dnyvm[1] = 29;}
	if(den > dnyvm[mesic - 1]) {den = dnyvm[mesic - 1];}
	for(int i = 0; i < mesic - 1; i++) {celkem += dnyvm[i];}
	celkem += den;

	System.out.printf("%d\n" , celkem);
    }

    public static boolean jePrestupny(int rok) {
	return ((rok % 4) == 0);
    }
}