
class College {
    private String colName;
    private String colLoc;

    College(String colName, String colLoc) {
        this.colName = colName;
        this.colLoc = colLoc;
    }

    String getColName() {
        return colName;
    }

    String getColLoc() {
        return colLoc;
    }
}

class Student {
    private int studentId;
    private String studentName;
    private College college;

    Student(int studentId, String studentName, College college) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.college = college;
    }

    void displayStudentInfo() {
        System.out.println("Student ID: "+studentId);
        System.out.println("Student Name: "+studentName);
        System.out.println("College Name: "+college.getColName());
        System.out.println("College Location: "+college.getColLoc());
        System.out.println();
    }
}

public class AQ5 {
    public static void main(String[] args) {
        College college1 = new College("Ouat", "Bbsr");
        College college2 = new College("ITER", "Bbsr");

        Student student1 = new Student(354, "Ayushi", college1);
        Student student2 = new Student(2442, "Smruti", college2);

        System.out.println("College Info");
        System.out.println("College 1 : "+college1.getColName()+" "+college1.getColLoc());
        System.out.println("College 2 : " + college2.getColName()+" "+college2.getColLoc());
        System.out.printl

        System.out.println("Student Information:-");
        System.out.println("Student 1 info:- ");
        student1.displayStudentInfo();
        System.out.println("Student 2 Info :- ");
        student2.displayStudentInfo();
    }
}
