package app;

public class Ladoo extends Sweet{
    String Name;
    String MainContent;

    public Ladoo(int weight, int price,String Name,String MainContent) {
        super(weight, price);
    }

    @Override
    public String toString() {
        return "Name :" + Name + " MainContent:" + MainContent + " Weight:" + weight + " Price:" +price;
    }

    

}