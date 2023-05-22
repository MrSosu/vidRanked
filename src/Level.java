public enum Level {

    SUPER_EASY(1),
    EASY(2),
    AVERAGE(3),
    HARD(4),
    IMPOSSIBLE(5);

    private double level;

    Level(double level) {
        this.level = level;
    }

    public double getLevel() {
        return level;
    }
}
