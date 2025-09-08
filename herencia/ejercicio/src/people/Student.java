package people;

public class Student extends Person {
    private String major;
    private int semester;

    public Student(String name, int id, String major, int semester) {
        super(name, id);
        this.major = major;
        this.semester = semester;
    }

    public String getMajor() {
        return major;
    }

    public int getSemester() {
        return semester;
    }

    public void setMajor(String major) {
        this.major = major;
    }    

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public void learn() {
        System.out.println(super.getName() + " is learning");
        // System.out.printf("%s is learning\n", super.getName());
    }
}
