package app;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Basket{
    List<Object>basket = new ArrayList<Object>();
    String Name;


    public void add(Object ...arr){
        for(int i = 0;i<arr.length;i++){
            basket.add(arr[i]);
        }
    }

    public void displayContent(){
        ListIterator<Object> itr = basket.listIterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }

    public void getCandies(){
        ListIterator<Object> itr = basket.listIterator();
        List<Candy>temp = new ArrayList<Candy>();
        while(itr.hasNext()){
            Object temp_object = itr.next();
            if(temp_object instanceof Candy){
                temp.add((Candy)temp_object);
            }
        } 
        System.out.println(temp);
    }

    public Basket(String name) {
        Name = name;
    }

}