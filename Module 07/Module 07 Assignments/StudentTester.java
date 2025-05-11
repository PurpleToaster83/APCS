/*
 * Purpose: to test the student class
 * 
 * @author William Van Uitert
 * @version 01/20/25
 */

 import java.util.ArrayList;

public class StudentTester {

    public static void printTable(ArrayList<Student> students) {
        System.out.println("Student Name\tQ1\tQ2\tQ3\tQ4\tQ5");
        for(int i = 0; i < 50; i++) {
            System.out.print("-");
        }
        System.out.println();

        for(Student student : students) {
            System.out.println(student.toString());
        }
        System.out.println();
    }

    public static void replaceName(ArrayList<Student> students, int loc, String newName) {
        if(students.get(loc) != null) {
            students.get(loc).setName(newName);
        }
    }

    public static void replaceQuiz(ArrayList<Student> students, int stuLoc, int quizNum, int newQuiz) {
        if(students.get(stuLoc) != null) {
            students.get(stuLoc).setQuiz(quizNum, newQuiz);
        }
    }

    public static void replaceStudent(ArrayList<Student> students, String nameReplace, String newName, int[] scores) {
        for(Student student : students) {
            if(student != null && student.getName().equals(nameReplace)) {
                student.setName(newName);
                for(int s =  0; s < 5; s++) {
                    student.setQuiz(s, scores[s]);
                }
                break;
            }
        }
    }

    public static void addStudent(ArrayList<Student> students, String nameFind, String newName, int[] scores) {
        for(int i = 0; i < students.size(); i++) {
            if(students.get(i) != null && students.get(i).getName().equals(nameFind)) {
                students.add(i, new Student(newName, scores));
                break;
            }
        }
    }

    public static void deleteStudent(ArrayList<Student> students, String nameDel) {
        for(int i = 0; i < students.size(); i++) {
            if(students.get(i) != null && students.get(i).getName().equals(nameDel)) {
                students.remove(i);
                break;
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student("Student A", new int[] {70, 80, 80, 80, 90}));
        students.add(new Student("Student B", new int[] {80, 85, 90, 85, 80}));
        students.add(new Student("Student C", new int[] {50, 79, 89, 99, 99}));
        students.add(new Student("Student D", new int[] {85, 80, 85, 88, 89}));
        students.add(new Student("Student E", new int[] {70, 70, 90, 70, 80}));

        System.out.println("Starting Gradebook\n");
        printTable(students);
        replaceName(students, 1, "Student Z");
        System.out.println("Replace Student B's Name with Student Z\n");
        printTable(students);
        replaceQuiz(students, 0, 0, 30);
        System.out.println("Make Student A's 1st Score 30\n");
        printTable(students);
        replaceStudent(students, "Student C", "Student X", new int[] {100, 100, 90, 95, 95});
        System.out.println("Replace Student C with Student X\n");
        printTable(students);
        addStudent(students, "Student X", "Student Y", new int[] {50, 60, 70, 80, 90});
        System.out.println("Add Student Y\n");
        printTable(students);
        deleteStudent(students, "Student D");
        System.out.println("Delete Student D\n");
        printTable(students);
    }
}
