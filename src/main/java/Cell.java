class Cell {
    private CellStatus status = CellStatus.ALIVE;

    public Cell(CellStatus status) {
        this.status = status;
    }

    boolean isAlive() {
        return CellStatus.ALIVE == status;
    }

    void kill() {
        status = CellStatus.DEAD;
    }

    void revive() {
        status = CellStatus.ALIVE;
    }
}