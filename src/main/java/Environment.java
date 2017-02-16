import java.util.ArrayList;

public class Environment {
    private static final int LINES = 5;
    private ArrayList<GridLine> grid = new ArrayList<>(LINES);

    public Environment(ArrayList<ArrayList<Boolean>> statuses) {
        int i = 0;
        for (; i < statuses.size(); i++) {
            ArrayList<Boolean> line = statuses.get(i);
            grid.add(new GridLine(line));
        }
        for (; i < LINES; i++) {
            grid.add(new GridLine(new ArrayList<>()));
        }
    }

    public boolean isCellAliveAt(Coordinate coordinate) {
        Ordinate ordinate = coordinate.ordinate;
        Absciss absciss = coordinate.absciss;
        GridLine gridLine = grid.get(ordinate.y);
        return gridLine.isCellAliveAt(absciss);
    }
}