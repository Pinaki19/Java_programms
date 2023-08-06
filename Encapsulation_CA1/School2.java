package Encapsulation_CA1;
import java.util.HashMap;
public class School2 {
    public static void main(String[] args) {
        ClassRoom classRoom1 = new ClassRoom(5);
        classRoom1.addStudent("Pinaki", 100);
        classRoom1.addStudent("Debanjan", 105);
        System.out.println("This class room is for students of class: " + classRoom1.getClassOf());
        System.out.printf("This class has %d students\n", classRoom1.getStudentCount());
        Student s1= classRoom1.getStudentWithId(100);
        Student s2=classRoom1.getStudentWithId(500);
	printDetails(s1);
	printDetails(s2);
    }
    public static void printDetails(Student s){
	if (s == null)
            System.out.println("No student exists with this Student Id.");
        else
            System.out.printf("Student Found: Name: %-15s Id: %-5d\n", s.getName(), s.getId());
    }
}

class ClassRoom {
    private int numberOfStudents;
    private HashMap<Integer,Student> students;
    private int classOf;
    public ClassRoom(int classOf) {
        numberOfStudents = 0;
        this.classOf = classOf;
        students = new HashMap<>();
    }
    public int getClassOf() {
        return classOf;
    }
    public int getStudentCount() {
        return numberOfStudents;
    }
    public void addStudent(String name, int studentId) {
        numberOfStudents++;
        students.put(studentId,new Student(name, studentId));
    }
    public Student getStudentWithId(int id) {
        if(students.containsKey(id)){
            return students.get(id);
        }
        else
            return null;
    }
}

