import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Animal> animals = new ArrayList<>();
        
        animals.add(new Pajaro());
        animals.add(new Rana());
        animals.add(new Pez());
        animals.add(new Iguana());

        for(Animal animal: animals) {
            animal.mover();
        }   
    }
}