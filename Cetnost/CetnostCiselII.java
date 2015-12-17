public class CetnostCiselII {
	public static void main(String args[])
		Cetnosti cisla = new Cetnosti();
		java.util.Scanner sc = new java.util.Scanner(System.in);
		while (scanner.hasNextInt()) {
			int n = scanner.NextInt();
            		cisla.zapocitej(n);
                }
		
		int[] pole = cisla.seznamCisel();
		for (int i = 0; i < pole.length; i++) {
			System.out.printf("%d : %d\n", pole[i], cisla.cetnost(pole[i]));
		}
	}
}
