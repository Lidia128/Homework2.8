package Auto;

public enum Weight {
    N1(0D, 3.5),
    N2(3.5, 12D),
    N3(12D,0D);
    private Double from;
    private Double to;
    Weight(double from, double to) {
        this.from = from;
        this.to = to; }
    public Double getFrom() {
        return from;
    }
    public Double getTo() {
        return to;
    }
}
