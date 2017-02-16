public class Ordinate {
    public final int y;

    private Ordinate(int y) {
        this.y = y;
    }

    public static Ordinate of(int y) {
        return new Ordinate(y);
    }
}