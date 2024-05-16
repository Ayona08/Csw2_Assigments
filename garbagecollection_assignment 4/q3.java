package garbagecollection_assignment4;

public class NullifiedReference {
    private String name;

    public NullifiedReference(String name) {
        this.name = name;
    }
    public static void main(String[] args) {
        NullifiedReference obj = new NullifiedReference("Object");

        obj = null; // Nullify object reference

        System.gc(); // Explicitly invoke garbage collector
    }
    @Override
    protected void finalize() {
        System.out.println("Garbage collected: " + name);
    }
}
