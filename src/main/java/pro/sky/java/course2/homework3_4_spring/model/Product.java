package pro.sky.java.course2.homework3_4_spring.model;

public class Product {
    private final String name;
    private final int productID;

    public Product(int productID) {
        switch (productID) {
            case 1 -> {
                this.name = "молоко";
                this.productID = productID;
            }
            case 2 -> {
                this.name = "яйца";
                this.productID = productID;
            }
            case 3 -> {
                this.name = "хлеб";
                this.productID = productID;
            }
            case 4 -> {
                this.name = "сыр";
                this.productID = productID;
            }
            default -> throw new IllegalArgumentException();
        }
    }

    public String getName() {
        return name;
    }

    public int getProductID() {
        return productID;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", productID=" + productID +
                '}';
    }
}
