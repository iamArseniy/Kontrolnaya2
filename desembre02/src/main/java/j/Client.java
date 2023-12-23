package j;

public class Client extends Human{
    Skidka disc;
    public  Client(String name,Gender gndr,Skidka ds){
        super(name, gndr);
        this.disc = ds;

    }

    @Override
    public String toString() {
        return this.name;
    }
}
