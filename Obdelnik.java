public class Obdelnik {
    public static void main(String[] args) {
        for (int y = 0; y < 10; y++) {
            for (int x = 0; x <= 50; x++) {
                if (x == 0 || x == 50) { System.out.print("X"); }
		else { System.out.print(" "); }
            }
            System.out.println();
        }
    }
}