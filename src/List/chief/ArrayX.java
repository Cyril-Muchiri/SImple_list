package List.chief;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayX {
    public static void main(String[] args){
        ArrayList<ArrayList<String>> foodList=new ArrayList<>();

        ArrayList<String> produceList=new ArrayList<String>();
        produceList.add("Cheese");
        produceList.add("Caviar");
        produceList.add("Pizza");

        ArrayList<String> groceryList=new ArrayList<String>();
        groceryList.add("Lettuce");
        groceryList.add("Onions");
        groceryList.add("Tomatoes");

        ArrayList<String> drinkList=new ArrayList<String>();
        drinkList.add("Cheese");
        drinkList.add("Caviar");
        drinkList.add("Pizza");

        foodList.add(produceList);
        foodList.add(groceryList);
        foodList.add(drinkList);

        System.out.println(foodList.get(0) +"\n"+foodList.get(1)+"\n"+ foodList.get(2));

    }
}
