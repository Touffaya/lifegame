public class Coordinate {
    public final Absciss absciss;
    public final Ordinate ordinate;

    private Coordinate(Absciss absciss, Ordinate ordinate) {
        this.absciss = absciss;
        this.ordinate = ordinate;
    }

    public static Coordinate of(Absciss absciss, Ordinate ordinate) {
        return new Coordinate(absciss, ordinate);
    }

    public static Coordinate of(int x, int y) {
        return new Coordinate(Absciss.of(x), Ordinate.of(y));
    }
}