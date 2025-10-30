package Composicion;
import java.util.ArrayList;

public class House {

    private String adress;
    private ArrayList<Room> rooms;

    public House(String adress){
        this.adress = adress;
        this.rooms = new ArrayList<>();

    } 

    public void addRoom(String name, double area){
        Room room = new Room();
        rooms.add(room);

    }

    public void showRooms(){
        for(Room room : rooms){
            System.out.println(room.getName());
        }

    }



    
}