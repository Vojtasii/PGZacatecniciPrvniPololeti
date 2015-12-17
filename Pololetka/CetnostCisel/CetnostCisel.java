public class CetnostCisel {
	public static void main(String args[]) {
		Cetnosti cisla = new Cetnosti();
		java.util.Scanner sc = new java.util.Scanner(System.in);
		while (sc.hasNextInt()) {
               		cisla.zapocitej(sc.nextInt());
		}
		
		int seznam[] = cisla.seznamCisel();
		
		for (int i = 0; i < seznam.length; i++) {
            		System.out.printf("%3d tam bylo %dx.\n", seznam[i],
			 cisla.cetnost(seznam[i]));
        	}
	}
}
