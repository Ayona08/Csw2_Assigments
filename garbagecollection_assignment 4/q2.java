package garbagecollection_assignment4;

public class ReassigningReference {
    private String name;

    public ReassigningReference(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        ReassigningReference obj1 = new ReassigningReference("Obj 1");
        ReassigningReference obj2 = new ReassigningReference("Obj 2");

        obj2 = null; 

        System.gc(); 
    }

    @Override
    protected void finalize() {
        System.out.println("Garbage collected: " + name);
    }
}

