package homework07_Q2;

public abstract class Element {

    private String symbol;
    private int atomicNumber;
    private double atomicweight;

    public Element(String symbol, int atomicNumber, double atomicweight) {
        this.symbol = symbol;
        this.atomicNumber = atomicNumber;
        this.atomicweight = atomicweight;
    }

    public String getSymbol() {
        return symbol;
    }

    public int getAtomicNumber() {
        return atomicNumber;
    }

    public double getAtomicweight() {
        return atomicweight;
    }

    public abstract void describeElement();
    
}
