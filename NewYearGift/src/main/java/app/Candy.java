package app;

public class Candy extends Sweet{
    String name;

    public Candy(int weight, int price, String name) {
        super(weight, price);
        this.name = name;
    }

    @Override
    public String toString() {
        return "Name :" + name + " Weight:" + weight + " Price:" +price;
    }

    

}