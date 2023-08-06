package Encapsulation_CA1;
import java.util.ArrayList;

public class School {
    public static void main(String[] args){
        ClassRoom classRoom1=new ClassRoom(5);
        classRoom1.addStudent("Pinaki", 100);
        classRoom1.addStudent("Debanjan", 105);
        System.out.println("This class room is for students of class: "+classRoom1.getClassOf());
        System.out.printf("This class has %d students\n",classRoom1.getStudentCount());
        Student s1= classRoom1.getStudentWithId(100);
        printDetails(s1);
        Student s2 = classRoom1.getStudentWithId(500);
        printDetails(s2);
    }
    public static void printDetails(Student s){
        if (s == null)
            System.out.println("No student exists with this Student Id");
        else
            System.out.printf("Student Found: Name: %-15s Id: %-5d\n", s.getName(), s.getId());
    }
}

class ClassRoom{
    private int numberOfStudents;
    private ArrayList<Student> students;
    private int classOf;
    public ClassRoom(int classOf){
        numberOfStudents=0;
        this.classOf=classOf;
        students=new ArrayList<>();
    }
    public int getClassOf(){
        return classOf;
    }
    public int getStudentCount(){
        return numberOfStudents;
    }
    public void addStudent(String name,int studentId){
        numberOfStudents++;
        students.add(new Student(name,studentId));
    }
    public Student getStudentWithId(int id){
        for(Student S:students){
            if(S.getId()==id)
                return S;
        }
        return null;
    }
}

class Student{
    private String name;
    private int studentId;
    public Student(String name,int studentId){
        setName(name);
        setId(studentId);
    }
    public void setName(String name){
        this.name=name;
    }
    public void setId(int id){
        studentId=id;
    }
    public String getName(){
        return name;
    }
    public int getId(){
        return studentId;
    }
}
