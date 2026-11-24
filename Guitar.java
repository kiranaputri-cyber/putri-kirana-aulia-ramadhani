public class Guitar extends StringInstrument {
    private String bodyType;

    public Guitar(String name, double basePrice, boolean onSale, int numStrings, String bodyType) {
        super(name, basePrice, onSale, numStrings);
        this.bodyType = bodyType;
    }

    public String getBodyType() { return bodyType; }
}