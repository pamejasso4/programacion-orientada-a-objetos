package unidireccional;

import java.util.ArrayList;

public class Teacher {
    private String name;
    private ArrayList<Course> courses;

    public Teacher(String name) {
        this.name = name;
        courses = new ArrayList<>();
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void showCourses() {
        for(Course course : courses) {
           course.showInfo();
        }
    }

public String getName() {
    return name;
}
}