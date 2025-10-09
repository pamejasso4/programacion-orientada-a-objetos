package bidireccional;

public class Person {
    private String name;
    private Car car;

    public Person(String name) {
        this.name = name;
    }

    public void assignCar(Car car) {
        this.car = car;
    }

    public void drive() {
        System.out.println("Manejando carro con las placas: " + car.getPlates());
    }

    public String getName() {
        return this.name;
    }
}