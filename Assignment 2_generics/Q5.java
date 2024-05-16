
import java.util.Arrays;

class Student2 implements Comparable<Student2> {
    String name;
    int rn;
    double totalMark;

    Student2(String name, int rn, double totalMark) {
        this.name = name;
        this.rn = rn;
        this.totalMark = totalMark;
    }

    public String getName() {
        return name;
    }

    public int getRn() {
        return rn;
    }

    public double getTotalMark() {
        return totalMark;
    }

    @Override
    public int compareTo(Student2 otherStudent) {
        return this.rn - otherStudent.rn;
    }

    public static void bubbleSort(Student2[] students) {
        int n = students.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (students[j].compareTo(students[j + 1]) > 0) {       
                    Student2 temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
    }
}

public class Q5 {
    public static void main(String[] args) {
        Student2[] students = {
                new Student2("Ayona", 121, 67.5),
                new Student2("Bai", 106, 58.0),
                new Student2("Carl", 110, 72.3),
                new Student2("yusu", 109, 98.5)
        };

        Student2.bubbleSort(students);

        System.out.println("SortedStudent List:-");
        for (Student2 student : students) {
            System.out.println("Name: "+student.getName()+", Roll Number: "+student.getRn()+", Total Marks: "+student.getTotalMark());
        }
    }
}
