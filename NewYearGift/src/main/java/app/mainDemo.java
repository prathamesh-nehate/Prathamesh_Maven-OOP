package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class NewYearGift {
    Basket x;
    int maxPrice;
    int minPrice;
    int maxWeight;
    int minWeight;

    void displayMenu() {
        System.out.print("--------------------------------------------------------");
        System.out.println("1.Add GulabJamun");
        System.out.println("2.Add Candy");
        System.out.println("3.Add Ladoo");
        System.out.println("4.Add Chocolate");
        System.out.println("5.DisplayCOntent");
        System.out.println("6.DisplayCandyList");
        System.out.println("7.Press 0 other key to exit");
        System.out.println("Select Operation");
    }

    void menuSwitch(int i, Scanner input) {
        switch (i) {
        case 1:
            System.out.println("Enter Weight between " + this.minWeight + "-" + this.maxWeight);
            int weight = input.nextInt();
            System.out.println("Enter Price between " + this.minPrice + "-" + this.maxPrice);
            int price = input.nextInt();
            System.out.println("Enter Type");
            String type = input.nextLine();

            x.add(new GulabJamun(weight, price, type));
            break;
        case 2:
            System.out.println("Enter Weight between " + this.minWeight + "-" + this.maxWeight);
            weight = input.nextInt();
            System.out.println("Enter Price between " + this.minPrice + "-" + this.maxPrice);
            price = input.nextInt();
            System.out.println("Enter Name of Candy");
            String name = input.nextLine();

            x.add(new Candy(weight, price, name));
            break;
        case 3:
            System.out.println("Enter Weight between " + this.minWeight + "-" + this.maxWeight);
            weight = input.nextInt();
            System.out.println("Enter Price between " + this.minPrice + "-" + this.maxPrice);
            price = input.nextInt();
            System.out.println("Enter Name for Ladoo");
            name = input.nextLine();
            System.out.println("Enter MainContent of Ladoo");
            String MainContent = input.nextLine();
            x.add(new Ladoo(weight,price,name,MainContent));
            break;

        case 4:
            System.out.println("Enter Weight between " + this.minWeight + "-" + this.maxWeight);
            weight = input.nextInt();
            System.out.println("Enter Price between " + this.minPrice + "-" + this.maxPrice);
            price = input.nextInt();
            System.out.println("Enter Name of Chocolate");
            name = input.nextLine();
            System.out.println("Enter Type of Chocolate");
            type = input.nextLine();
            x.add(new Chocolate(weight,price,name,type));
            break;
        case 5:
            x.displayContent();
            break;
        case 6:
            x.getCandies();
            break;
        case 0:
            System.exit(0);
        default:
            System.out.println("Select Valid Operation");
        }
    }

    static List<Object> set(Scanner input) {
        List<Object> x = new ArrayList<Object>();
        // Scanner input = new Scanner(System.in);
        System.out.println("Enter Name for Basket");
        x.add(input.nextLine());
        System.out.println("Enter Minimum and Maximum weight");
        x.add(input.nextInt());
        x.add(input.nextInt());
        System.out.println("Enter Minimum and Maximum price");
        x.add(input.nextInt());
        x.add(input.nextInt());
        // input.close();

        return x;

    }

    public NewYearGift(Basket x, int maxPrice, int minPrice, int maxWeight, int minWeight) {
        this.x = x;
        this.maxPrice = maxPrice;
        this.minPrice = minPrice;
        this.maxWeight = maxWeight;
        this.minWeight = minWeight;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        List<Object> x = new ArrayList<Object>();
        x = set(input);

        NewYearGift obj = new NewYearGift(new Basket((String) x.get(0)), (Integer) x.get(1), (Integer) x.get(2),
                (Integer) x.get(3), (Integer) x.get(4));

        while (true) {
            obj.displayMenu();
            int i = input.nextInt();
            obj.menuSwitch(i, input);
        }

    }

}