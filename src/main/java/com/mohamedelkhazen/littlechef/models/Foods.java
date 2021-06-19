package com.mohamedelkhazen.littlechef.models;

import java.util.ArrayList;

public abstract class Foods {

    private static ArrayList<String> foodsList = new ArrayList<String>();
    private int id;
    private static int nextId = 1;
    private String value;

    public Foods() {
        id = nextId;
        nextId++;
    }

    public Foods(String value) {
        this();
        this.value = value;
    }



    public ArrayList<String> addFoodsToLists(ArrayList<String> foodList, String addToList){

        foodList.add(addToList);

        return foodsList;
    }

    @Override
    public String toString() {
        return "Foods{" +
                "value='" + value + '\'' +
                '}';
    }

    public static ArrayList<String> getFoodsList() {
        return foodsList;
    }

    public static void setFoodsList(ArrayList<String> foodsList) {
        Foods.foodsList = foodsList;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getId() {
        return id;
    }
}
