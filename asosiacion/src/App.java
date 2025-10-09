import java.util.List;

import bidireccional.Car;
import bidireccional.Person;
import unidireccional.Course;
import unidireccional.Teacher;

public class App {
    public static void main(String[] args) throws Exception {
        Teacher vergara = new Teacher("Vergara");

        Course[] courses = {
            new Course("Poo", "15 semanas"),
            new Course("Sistemas Operativos", "15 semanas"),
            new Course("Desarrollo web", "10 semanas")
        };

        for(int i=0; i < 3; i++) {
            vergara.addCourse(courses[i]);
        }
System.out.println("Cursos del Dr. " + vergara.getName());        
        vergara.showCourses();
    }
}
