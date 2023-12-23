package j;

public class Main {
    public static void main(String[] args){
        NextNumberImpl queue = new NextNumberImpl();
        Client cl1 =new Client("Peter", Gender.MAN,Skidka.NEWCLIENT);
        Client cl2 =new Client("Gloria", Gender.WOMAN,Skidka.FIRSTORDER);
        Client cl3 =new Client("Dude", Gender.MAN,Skidka.NEWCLIENT);

        Cook cook1 = new Cook("Vasya", Gender.MAN);
        Cook cook2 = new Cook("lola", Gender.WOMAN);

        Order order1 = new Order(cl1, cook1,Pizza.GRIBNAYA, OrderStatus.RECEIVED, queue.next(), "16.12.2023");
        order1.toString();

    }
}
