package bidireccional;

public class Car {
    private String plates;
    private Person owner;

    public Car(String plates) {
        this.plates = plates;
    }

    public void assignOwner(Person owner) {
        this.owner = owner;
    }

    public void drive() {
        System.out.println(owner.getName() + " esta manejando");
    }    

    public String getPlates() {
        return plates;
    }
}
