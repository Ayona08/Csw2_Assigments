package garbagecollection;

public class AnonymousObject {
    private String name;

    public AnonymousObject(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        new AnonymousObject("Anonymous").finalize(); // Create anonymous object and invoke finalize
        System.gc(); // Explicitly invoke garbage collector
    }

    @Override
    protected void finalize() {
        System.out.println("Garbage collected: " + name);
    }
}

