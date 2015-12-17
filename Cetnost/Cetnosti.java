public class Cetnosti {
	Zaznam[] pole = new Zaznam[2];
	int[] pocet = 0;
	public Cetnosti();


	public void zapocitej(int cislo) {
            	boolean nasel = false;
            	for (int i = 0; i < pocet; i++) {
                	if (pole[i].cislo == cislo) {
                		pole[i].pocet++;
                    		nasel = true;
                    		break;
	                }
        	}

        	if (!nasel) {
                	pole[pocet] = new Zaznam(cislo);
                    	pocet++;
			if (pocet == pole.length) {
                		pole = zvetsi(pole, pole.length * 2);
           		}
            	}
	}

	public int[] seznamCisel();
	public int cetnost(int cislo);


	public static int[] zvetsi(int[] soucasne, int novaVelikost) {
        	int[] nove = new int[novaVelikost];
        	for (int i = 0; i < soucasne.length; i++) {
        	    nove[i] = soucasne[i];
        	}
        	return nove;
    	}
}