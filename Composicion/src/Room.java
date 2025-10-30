package Composicion;
public class Room {
    private String name;
    private double area;

    public void Habitacion(String name, double area){
        this.name = name;
        this.area = area;
    }

    public String getName(){
        return name;
    }

    public double getArea(){
        return area;
    }
    
}
