public class Ingredient {
    private String name;
    private double quantity;
    private String unit;

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

    public String getName() {
        return name;
    }

    public void setQuantity(int quantity, String unit) {
        // always set quantity and unit together, a quantity without a unit makes no sense
        this.quantity = quantity;
        this.unit = unit;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getUnit() {
        return unit;
    }
}
