package multiple;
public class App {
    public static void main(String[] args) {
        Client diego = new Client("Diego");
        Client pamela = new Client("Pamela");

        Order o1 = new Order("2025-05-20");
        Order o2 = new Order("2025-06-20");
        Order o3 = new Order("2024-10-20");


        o1.setClient(diego);
        o2.setClient(pamela);
        o3.setClient(diego);

        pamela.addOrder(o2);
        diego.addOrder(o1);
        diego.addOrder(o3);

        System.out.println("Ordenes pamela: ");
        pamela.showOrders();
        System.out.println("Ordenes diego: ");
        diego.showOrders();
        
    }
    
}
