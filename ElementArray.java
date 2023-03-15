package homework07_Q2;

public class ElementArray {
    public static void main(String[] args) {
        Element[] elements = new Element[5];
        elements[0] = new MetalElement("Ga", 31, 69.723);
        elements[1] = new NonMetalElement("Ar", 18, 39.95);
        elements[2] = new MetalElement("Sn", 50, 118.710);
        elements[3] = new NonMetalElement("Xe", 54, 131.29);
        elements[4] = new MetalElement("Pb", 82, 207.2);
        for (Element element : elements) element.describeElement();
    }
}
