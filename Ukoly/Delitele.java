public class Delitele {
    public static void main(String[] args) {
	int a = Integer.valueOf(args[0]);
        for (int i = 1; i <= a; i = i + 1) {
	    if (a % i == 0 && a != i) {System.out.printf("%d ", i); }   
        }
    }
}