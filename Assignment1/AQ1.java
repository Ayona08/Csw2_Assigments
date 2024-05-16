class Car {
    private String make;
    private String model;

    Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    String getMake() {
        return make;
    }

    void setMake(String make) {
        this.make = make;
    }

    String getModel() {
        return model;
    }

    void setModel(String model) {
        this.model = model;
    }
}

public class AQ1 {
    public static void main(String[] args) {
        Car C1 = new Car("Hyundai", "sportz");    

        Car C2 = new Car(null, null);

        System.out.println("Initial make and model of myCar1 is : "+C1.getMake()+" "+C1.getModel());
        System.out.println("Initial make and model of myCar2 is : "+C2.getMake()+" "+C2.getModel());

        C2.setMake("BMW");
        C2.setModel("M2 coupe");

        System.out.println("Updated make and model of C2 is : "+C2.getMake()+" "+C2.getModel());
    }
}