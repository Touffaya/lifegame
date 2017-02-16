public class Absciss {
    public final int x;

    private Absciss(int x) {
        this.x = x;
    }

    public static Absciss of(int x) {
        return new Absciss(x);
    }
}