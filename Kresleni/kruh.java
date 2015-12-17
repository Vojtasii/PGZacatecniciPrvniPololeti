public class kruh extends Tvar {
    private int r;
    public Usecka(int x, int y, int r) {
        super(x, y);
        this.r = r;
    }
    @Override
    public void kresli() {
        System.out.println("usecka");
    }
}