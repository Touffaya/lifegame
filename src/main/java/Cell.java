class Cell {
    private Boolean isAlive = Boolean.TRUE;

    public Cell(Boolean isAlive) {
        this.isAlive = isAlive;
    }

    boolean isAlive() {
        return Boolean.TRUE == isAlive;
    }

    void kill() {
        isAlive = Boolean.FALSE;
    }

    void revive() {
        isAlive = Boolean.TRUE;
    }
}