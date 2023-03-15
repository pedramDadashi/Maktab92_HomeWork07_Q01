package homework07_Q2;

public class MetalElement extends Element {


    public MetalElement(String symbol, int atomicNumber, double atomicweight) {
        super(symbol, atomicNumber, atomicweight);
    }

    @Override
    public void describeElement() {
        System.out.println("Symbol: "+getSymbol()+" ,Atomic Number: "+getAtomicNumber()+" " +
                ",Atomic Weight: "+getAtomicweight()+" ,Part of Metal Element *good conductor*");
    }
}
