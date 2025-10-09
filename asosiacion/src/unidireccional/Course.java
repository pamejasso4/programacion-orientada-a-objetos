package unidireccional;

public class Course {
    private String name;
    private String duration;

    public Course(String name, String duration) {
        this.name = name;
        this.duration = duration;
    }

    public void showInfo() {
        System.out.println(name + "\t" + duration);
    }
}

