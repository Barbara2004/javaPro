package lesson05;

public class Sweets {
    private String flavour;
    private double weight;
    private Object visitor;
    private String brand;

    public String getFlavour() {
        return flavour;
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Object getVisitor() {
        return visitor;
    }

    public void setVisitor(Object visitor) {
        this.visitor = visitor;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Sweets() {
    }

    public Sweets(String flavour, double weight, Object visitor, String brand) {
        this.flavour = flavour;
        this.weight = weight;
        this.visitor = visitor;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Sweets{" +
                "flavour='" + flavour + '\'' +
                ", weight=" + weight +
                ", brand='" + brand + '\'' +
                '}';
    }
}
