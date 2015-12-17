public class Cetnost {
	public static void main(String args[])
		int pole[] = new int[100,];
		java.util.Scanner sc = new java.util.Scanner(System.in);
}

public class Cetnosti {
    protected int[] cisla = new int[16];
    protected int[] pocty = new int[16];

    public Cetnosti(int c, int p){
	for(i = 0; i < cisla.length; i++) {
	    if(cisla[i] == cislo){
		pocty[i]++;
		return;
	    if(cisla[i] == 0){
		cisla[i] = cislo;
		pocty[i]++;
		return;
	    }
	}
	cisla = zvetsi(cisla, cisla.length * 2);
	pocty = zvetsi(pocty, pocty.length * 2);
    }
	
//    public void zapocitej(int cisl){    }
    public int[] seznamCisel(){
    	
    }
    public int cetnost(int cislo);
}

public static int[] zvetsi(int[] soucasne, int novaVelikost) {
        int[] nove = new int[novaVelikost];
        for (int i = 0; i < soucasne.length; i++) {
            nove[i] = soucasne[i];
        }
        return nove;
    }
