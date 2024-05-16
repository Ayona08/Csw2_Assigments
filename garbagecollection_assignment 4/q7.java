package garbagecollection_assignment4;

class Student {
    private int studentId;
    private String name;

    public Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    public static void main(String[] args) {
        Student student1 = new Student(1, "John");
        Student student2 = new Student(2, "Alice");

        student1 = null;
        student2 = null;

        System.gc();
    }
}

