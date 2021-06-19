package com.mohamedelkhazen.littlechef.models;

public class VegetablesList extends Foods{
    public VegetablesList(String value) {
        super(value);
    }

    public VegetablesList(){
        VegetablesList.getFoodsList().add("tomato");
        VegetablesList.getFoodsList().add("potato");
        VegetablesList.getFoodsList().add("onion");
        VegetablesList.getFoodsList().add("pepper");
        VegetablesList.getFoodsList().add("zucchini");
    }


}
