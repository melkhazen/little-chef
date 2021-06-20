package com.mohamedelkhazen.littlechef.models;

import java.util.ArrayList;

public class FoodsData {

    private static ArrayList<ArrayList<String>> foodsObjectsList = new ArrayList<>();

    public FoodsData(){
        VegetablesList.getFoodsList().add("tomato");
        VegetablesList.getFoodsList().add("potato");
        VegetablesList.getFoodsList().add("onion");
        VegetablesList.getFoodsList().add("pepper");
        VegetablesList.getFoodsList().add("zucchini");

        MeatsList.getFoodsList().add("fish");
        MeatsList.getFoodsList().add("lamb");
        MeatsList.getFoodsList().add("stake");
        MeatsList.getFoodsList().add("ground beef");




        foodsObjectsList.add(VegetablesList.getFoodsList());
        foodsObjectsList.add(MeatsList.getFoodsList());

    }

    public static ArrayList<ArrayList<String>> getFoodsObjectsList() {
        return foodsObjectsList;
    }

    public void setFoodsObjectsList(ArrayList<ArrayList<String>> foodsObjectsList) {
        this.foodsObjectsList = foodsObjectsList;
    }

    @Override
    public String toString() {
        return "FoodsData{" +
                "foodsObjectsList=" + foodsObjectsList +
                '}';
    }
}
