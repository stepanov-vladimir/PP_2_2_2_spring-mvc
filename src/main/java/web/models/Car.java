package web.models;


public class Car {

    private Long id;

    private String manufacturer;

    private String model;

    private double price;

    public Car() {
    }

    public Car(Long id, String manufacturer, String model, int price) {
        this.id = id;
        this.manufacturer = manufacturer;
        this.model = model;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
               "id=" + id +
               ", manufacturer='" + manufacturer + '\'' +
               ", model='" + model + '\'' +
               ", price=" + price +
               '}';
    }
}
