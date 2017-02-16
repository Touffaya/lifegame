import java.util.ArrayList;

public class GridLine {
    private static final int COLUMNS = 5;
    private ArrayList<Cell> cells = new ArrayList<>(COLUMNS);

    public GridLine(ArrayList<Boolean> statuses) {
        int i = 0;
        for (; i < statuses.size(); i++) {
            cells.add(new Cell(statuses.get(i)));
        }
        for (; i < COLUMNS; i++) {
            cells.add(new Cell(Boolean.FALSE));
        }
    }

    public boolean isCellAliveAt(Absciss absciss) {
        return getCellAt(absciss).isAlive();
    }

    private Cell getCellAt(Absciss absciss) {
        return cells.get(absciss.x);
    }
}