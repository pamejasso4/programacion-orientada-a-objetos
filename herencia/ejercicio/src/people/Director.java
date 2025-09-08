package people;

public class Director extends Person {
    public Director(String name, int id) {
        super(name, id);
    }

    public void manage() {
        System.out.println(super.getName() + " is \"working\"");
        // System.out.printf("%s is learning\n", super.getName());
    }
}
 