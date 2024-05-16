class SystemDetails {
    private String modelName;
    private int modelNo;
    private String sim1;
    private String sim2;

    SystemDetails(String sim1, String sim2) {
        this.sim1 = sim1;
        this.sim2 = sim2;
        this.modelName = "Realme";
        this.modelNo = 3;
    }

    void setSim1(String sim1) {
        this.sim1 = sim1;
    }

    void setSim2(String sim2) {
        this.sim2 = sim2;
    }

    String getSim1() {
        return this.sim1;
    }

    String getSim2() {
        return this.sim2;
    }
}

class MobileApp {
    private String name;
    SystemDetails s;

    MobileApp(String name, SystemDetails s) {
        this.name = name;
        this.s = s;
    }

    void getSimDetails() {
        System.out.println("UserName : "+this.name);
        System.out.println("SIM1 : "+s.getSim1()+" "+" & SIM2 : "+s.getSim2());
    }
}

public class Q3 {
    public static void main(String[] args) {
        SystemDetails s = new SystemDetails("JIO", "BSNL");
        MobileApp m1 = new MobileApp("Ayona", s);
        m1.getSimDetails();
    }
}