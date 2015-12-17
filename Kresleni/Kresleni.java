public class Kresleni {
    public static void main(String[] args) {
        Tvar[] tvary = new Tvar[3];
        tvary[0] = new Usecka(1, 1, 2, 2);
        tvary[1] = new Kruh(6, 5, 3);
        tvary[2] = new Usecka(2, 2, 3, 2);
 
        for (int i = 0; i < tvary.length; i++) {
            tvary[i].kresli();
        }
    }
}