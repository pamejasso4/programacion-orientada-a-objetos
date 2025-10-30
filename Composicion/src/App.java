package Composicion;
public class App {

    public static void main(String[] args) throws Exception{
        House casa = new House("Racncho Alegre");
        casa.addRoom("Comedor", 20);
        casa.addRoom("Cocina", 10);
        casa.addRoom("Baño", 10);
        casa.addRoom("Cuarto de dormir", 50);
        

        casa.showRooms();
    }
    
}