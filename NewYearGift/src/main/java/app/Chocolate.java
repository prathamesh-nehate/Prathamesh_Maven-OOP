package app;

public class Chocolate extends Sweet{
    String name;
    String type;

    public Chocolate(int weight, int price, String name, String type) {
        super(weight, price);
        this.name = name;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Name :" + name + " Type:" + type + " Weight:" + weight + " Price:" +price;
    }

    
    
}