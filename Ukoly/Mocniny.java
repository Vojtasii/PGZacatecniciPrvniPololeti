public class Mocniny {
    public static void main(String[] args) {
	int a = Integer.valueOf(args[0]);
        for (int i = 1; i * i < a; i = i + 1) {
	    System.out.printf("%d ", i * i); 
        }
    }
}