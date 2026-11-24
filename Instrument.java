public class Instrument {
    protected String name;
    protected double basePrice;
    protected boolean onSale;

    public Instrument(String name, double basePrice, boolean onSale) {
        this.name = name;
        this.basePrice = basePrice;
        this.onSale = onSale;
    }

    public double getPrice() {
        double price = basePrice;
        if (onSale) {
            price = price * 0.85; // 15% lebih murah saat onSale
        }
        return price;
    }

    // Diskon karyawan 25% (75% dari harga saat ini)
    public double getEmployeePrice() {
        return getPrice() * 0.75;
    }

    public String getName() { return name; }
    public boolean isOnSale() { return onSale; }
}