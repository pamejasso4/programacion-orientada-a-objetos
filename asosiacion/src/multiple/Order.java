package multiple;

public class Order {
    private String date;
    private Client client;

    public Order(String date){
        this.date = date;
    }
    public void setClient(Client c){
        this.client = c;
    }

    public String getClient(){
        return client.getName;
    }

    public String getDate(){
        return this.date;

    }

    public void process(){
        System.out.println("Procesando");
    }
}
