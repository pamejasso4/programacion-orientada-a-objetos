public class Pajaro extends Animal{
    Pajaro(String name) {
        super(name);
    }

    @Override
    public void mover() {
        System.out.println(super.getNombre() + " Volando");
    }
}
