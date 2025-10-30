package multiple;
import java.util.ArrayList;

public class Client {
    private String name;
    private ArrayList<Orders> orders = new ArrayList<>();

    public Client(String name){
        this.name = name;
    }

    public void addOrder(Orders o){
        orders.add(o);
    }

    public void showOrders(){
        for(Order order: orders){
            System.out.println(order.getDate());
            order.getName();
        }

    }

    public String getName(){
        return name;
    }
}
