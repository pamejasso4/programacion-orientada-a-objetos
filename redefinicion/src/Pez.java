public class Pez extends Animal {
    Pez(String name) {
        super(name);
    }

    @Override
    public void mover() {
        // TODO Auto-generated method stub
        System.out.println(getNombre() + " Nadando");
    }
}