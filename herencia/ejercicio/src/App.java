import people.Director;
import people.Student;

public class App {
    public static void main(String[] args) {
        Student emilio = new Student("Emilio", 23017372, "LIS", 3);
        Director helena = new Director("Helena", 1010);

        System.out.println("Estudiante:");
        System.out.println(emilio.getName() + "\t" + emilio.getId() + "\t" + emilio.getSemester());
        emilio.learn();

        System.out.println("Directora:");
        System.out.println(helena.getName() + "\t" + helena.getId());
        helena.manage();
    }
}
