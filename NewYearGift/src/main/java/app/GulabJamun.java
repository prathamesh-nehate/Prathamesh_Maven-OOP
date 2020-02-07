 package app;

 public class GulabJamun extends Sweet{
     String type;

    @Override
    public String toString() {
        return "Type :" + type + " Weight:" + weight + " Price:" +price;
    }

    public GulabJamun(int weight, int price, String type) {
        super(weight, price);
        this.type = type;
    }
     
 }