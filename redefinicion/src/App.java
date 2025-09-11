import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Animal> animals = new ArrayList<>();
        
        animals.add(new Pajaro("Pajarito"));
        animals.add(new Rana("Ranita"));
        animals.add(new Pez("Nemo"));
        animals.add(new Iguana("Emi"));

        for(Animal animal: animals) {
            animal.mover();
        }   
    }
}
