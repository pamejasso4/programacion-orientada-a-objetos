import java.util.ArrayList;
public class Class{

    private String name;
    private ArrayList<Student> students;

    public Class(String name){
        this.name = name;
        students = new ArrayList<>();

    }

    public void addStudent(Student s){
        this.students.add(s);

    }

    public void listStudents(){
        for(Student s: students){
        System.out.println(s.getName());
        }
    }
    
}
