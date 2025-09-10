public class Rana extends Animal{
    Rana(String name) {
        super(name);
    }

    @Override
    public void mover() {
        // TODO Auto-generated method stub
        System.out.println(getNombre() + " Saltando");
    }
}
