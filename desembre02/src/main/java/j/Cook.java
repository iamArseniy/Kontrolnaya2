package j;

public class Cook extends Human{

    public  Cook(String name,Gender gndr){
        super(name, gndr);


    }
    @Override
    public String toString() {
        return this.name;
    }
}
