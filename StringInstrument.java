public class StringInstrument extends Instrument {
    protected int numStrings;

    public StringInstrument(String name, double basePrice, boolean onSale, int numStrings) {
        super(name, basePrice, onSale);
        this.numStrings = numStrings;
    }

    public int getNumStrings() { return numStrings; }
}