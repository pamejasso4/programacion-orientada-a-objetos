public class App {
    public static void main(String[] args) throws Exception{
        class poo = new Class("Poo");

        Student student1 = new Student("Estudiante 1", "18");
        Student student2 = new Student("Lupe", "20");
        Student student3 = new Student("mar", "24");


        poo.addStudent(student1);
        poo.addStudent(student2);
        poo.addStudent(student3);
        poo.listStudents();
    }
    
}