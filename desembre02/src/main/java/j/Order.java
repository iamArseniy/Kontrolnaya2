package j;

public class Order {
    private Client client;
    private Cook cook;
    private Pizza pizza;
    private OrderStatus orderstatus;
    private int ordernumber;
    private String date;

    public Order(Client client, Cook cook, Pizza pizza, OrderStatus orderstatus, int ordernumber, String date){
        this.client = client;
        this.cook = cook;
        this.pizza = pizza;
        this.orderstatus = orderstatus;
        this.ordernumber = ordernumber;
        this.date = date;
    }
    public String toString(){
        System.out.println("Man: " + client.toString() + ", Cook " + cook.toString() + ", pizza " + pizza+ ", status " + orderstatus+", numb order " + ordernumber + ", date " + date);
        return null;
    }

}
