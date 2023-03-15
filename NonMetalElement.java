package homework07_Q2;

public class NonMetalElement extends Element{
    public NonMetalElement(String symbol, int atomicNumber, double atomicweight) {
        super(symbol, atomicNumber, atomicweight);
    }

    @Override
    public void describeElement() {
        System.out.println("Symbol: "+getSymbol()+" ,Atomic Number: "+getAtomicNumber()+" " +
                ",Atomic Weight: "+getAtomicweight()+" ,Part of Non Metal Element *poor conductor*");

    }
}
