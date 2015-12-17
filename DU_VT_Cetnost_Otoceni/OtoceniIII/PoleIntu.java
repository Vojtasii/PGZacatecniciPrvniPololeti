public class PoleIntu {	
	int pole[] = new int[2];
	int p = 0;

	public PoleIntu() {};

	public void pridej(int a) {
		pole[p] = a;
		p++;
		if (p == pole.length) {pole = zvetsi(pole, pole.length * 2);}
	}

	public int delka() {return p;}

	public int prvek(int i) {return pole[i]; }

	public static int[] zvetsi(int[] soucasne, int novaVelikost) {
        	int[] nove = new int[novaVelikost];
        	for (int i = 0; i < soucasne.length; i++) {
        	    nove[i] = soucasne[i];
        	}
        	return nove;
    	}
}