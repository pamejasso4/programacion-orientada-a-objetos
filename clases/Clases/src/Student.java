public class Student {
    private String name;
    private String major;
    private int id;

    Student() {
        this.name = "";
        this.major = "";
        this.id = 0;
    }

    Student(String name, String major, int id) {
        this.name = name;
        this.major = major;
        this.id = id;
    }
    
    public String getName() {
        return this.name;
    }

    public String getMajor() {
        return this.major;
    }

    public String getId() {
        return addSToId(this.id);
    }
    
    private String addSToId(int id) {
        return String.format("S%d", id);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        // return String.format("%s \t %s \t %s", this.name, this.major, this.id);
        return this.name + "\t" + this.major + "\t" + this.id; 
    }
}
