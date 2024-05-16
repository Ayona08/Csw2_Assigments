package garbagecollection_assignment4;
public class DataClass {
    private int intValue;
    private double doubleValue;

    public void initialize(int intValue, double doubleValue) {
        this.intValue = intValue;
        this.doubleValue = doubleValue;
    }

    public void updateValues(int newIntValue, double newDoubleValue) {
        this.intValue = newIntValue;
        this.doubleValue = newDoubleValue;
    }

    public static void main(String[] args) {
        DataClass obj1 = new DataClass();
        obj1.initialize(10, 3.14);

        DataClass obj2 = new DataClass();
        obj2.initialize(20, 6.28);

        // Calculate memory occupied by objects
        long usedMemoryBeforeGC = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.out.println("Memory used by objects before GC: " + usedMemoryBeforeGC + " bytes");

        // Making objects unreachable
        obj1 = null;
        obj2 = null;

        // Invoke garbage collector
        System.gc();

        // Calculate memory occupied by objects after garbage collection
        long usedMemoryAfterGC = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.out.println("Memory used by objects after GC: " + usedMemoryAfterGC + " bytes");
    }
}

