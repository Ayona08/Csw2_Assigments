package garbagecollection_assignment4;

public class UnreachableObject {
    private String name;

    public UnreachableObject(String name) {
        this.name = name;
    }

    public void show() {
        display();
    }

    private void display() {
        new UnreachableObject("Inside display").finalize(); 
    }

    @Override
    protected void finalize() {
        System.out.println("Garbage collected: " + name);
    }

    public static void main(String[] args) {
        new UnreachableObject("Main object").show();
        System.gc(); 
    }
}
