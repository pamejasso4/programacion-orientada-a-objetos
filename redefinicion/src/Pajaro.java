public class Pajaro extends Animal{
    Pajaro(String name) {
        super(name);
    }

    public void mover() {
        System.out.println(super.getNombre() + " Volando");
    }
}
