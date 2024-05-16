class Employee {
    private String name;
    private int age;
    private int eId;
    private String pos;

    Employee() {
        this.eId = 3228;
        this.pos = "gdr";
    }

    void setName(String name) {
        this.name = name;
    }

    void setAge(int age) {
        this.age = age;
    }

    String getName() {
        return this.name;
    }

    int getAge() {
        return this.age;
    }

    String printToString() {
        return this.name+"'s age is "+this.age+", his Employee ID is "+this.eId+" & assigned in Position "+this.pos;
    }
 }

public class Q2 {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setName("Ayona");
        e1.setAge(21);
        System.out.println(e1.printToString());
    }
}