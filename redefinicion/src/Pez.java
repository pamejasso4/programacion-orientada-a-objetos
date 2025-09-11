public class Pez extends Animal {
    Pez(String name) {
        super(name);
    }
    
    public void mover() {
        System.out.println(getNombre() + " Nadando");
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return getNombre();
    }
}