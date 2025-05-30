public class Ingredient {
    private String name;
    private double quantity;
    private String unit;

    public Ingredient() {
        // empty constructor
    }

    public Ingredient(String name, double quantity, String unit) {
        this.name = name;
        this.quantity = quantity;
        this.unit = unit;
    }

    @Override
    public String toString() {
        return formatQuantity(quantity) + " " + unit + " " + name;
    }

    private String formatQuantity(double quantity) {
        // display doubles without trailing 0
        if (quantity % 1 == 0) {
            return String.format("%.0f", quantity);
        } else {
            return String.format("%s", quantity);
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(int quantity, String unit) {
        // always set quantity and unit together, a quantity without a unit makes no sense
        this.quantity = quantity;
        this.unit = unit;
    }

    public String getName() {
        return name;
    }

    public double getQuantity() {
        return quantity;
    }

    public String getUnit() {
        return unit;
    }
}
