import java.util.Arrays;

public class Cetnosti {
	int pole[] = new int[2];
	int pocet[] = new int[pole.length];
	int n = 0;
	public Cetnosti() {};


	public void zapocitej(int cislo) {
            	boolean nasel = false;
            	for (int i = 0; i < n; i++) {
                	if (pole[i] == cislo) {
                		pocet[i]++;
                    		nasel = true;
                    		break;
	                }
        	}

        	if (!nasel) {
                	pole[n] = cislo;
			pocet[n]++;
                    	n++;
			if (n == pole.length) {
                		pole = Arrays.copyOf(pole, pole.length * 2);
				pocet = Arrays.copyOf(pocet, pocet.length * 2);
           		}
            	}
	}

	public int[] seznamCisel() {
		int seznam[] = new int[n];
		for (int i = 0; i < n; i++) {
			seznam[i] = pole[i];
		}
		return seznam;
	}

	

	public int cetnost(int cislo){
		for (int i = 0; i < n; i++) {
                	if (pole[i] == cislo) {
                		return pocet[i];
	                }
        	}
		return 0;
	}

}