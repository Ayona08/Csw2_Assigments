
class Laptop {
    private String model;
    private double price;

    void setModel(String model) {
        this.model = model;
    }

    void setPrice(double price) {
        this.price = price;
    }

    String printString() {
        return "Laptop Model : "+model+", Price : "+price;
    }
}


public class Q4 {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        laptop.setModel("Asus vivobook");
        laptop.setPrice(60000);
        System.out.println(laptop.printString());
    }
}
