import java.util.Objects;

public class Products {
    private String name;
    private String manufacturer;
    private double price;


    public Products(String name, String manufacturer, double price) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Products products = (Products) o;
        return Double.compare(products.price, price) == 0 &&
                Objects.equals(name, products.name) &&
                Objects.equals(manufacturer, products.manufacturer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, manufacturer, price);
    }

    @Override
    public String toString() {
        return "Products{" +
                "name='" + name + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", price=" + price +
                '}';
    }
}



