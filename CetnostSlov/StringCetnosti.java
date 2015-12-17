public class StringCetnosti {
	private int slova[];
	private int pocet[];
	private int nUniqSlov;
	public StringCetnosti() {
		slova[] = new int[2];
		pocet[] = new int[slova.length]; 
		nUniqSlov = 0;
	}		

	public void zapocitej(string slovo) {
            	boolean nasel = false;
            	for (int i = 0; i < n; i++) {
                	if (slova[i].equals(slovo)) {
                		pocet[i]++;
                    		nasel = true;
                    		break;
	                }
        	}

        	if (!nasel) {
                	slova[n] = slovo;
			pocet[n]++;
                    	n++;
			if (n == slova.length) {
                		slova = zvetsi(pole, pole.length * 2);
				pocet = zvetsi(pocet, pocet.length * 2);
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


	private static int[] zvetsi(int[] soucasne, int novaVelikost) {
        	int[] nove = new int[novaVelikost];
        	for (int i = 0; i < soucasne.length; i++) {
        	    nove[i] = soucasne[i];
        	}
        	return nove;
    	}
}