package com.mohamedelkhazen.littlechef.controllers;

import com.mohamedelkhazen.littlechef.models.Foods;
import com.mohamedelkhazen.littlechef.models.FoodsData;
import com.mohamedelkhazen.littlechef.models.VegetablesList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;

@Controller
@RequestMapping(value = "")
public class FoodsListController {

    FoodsData newVegetablesList = new FoodsData();

    HashMap<String, ArrayList<String>> foods = new HashMap<>();

    public FoodsListController () {

            foods.put("Vegetables List", FoodsData.getFoodsObjectsList().get(0));
            foods.put("Meats List", FoodsData.getFoodsObjectsList().get(1));

    }

    @RequestMapping(value = "")
        public String categoryOfFoods(Model model){
        model.addAttribute("foodsKey", foods);


        return "index";
        }


    @RequestMapping(value = "items")
    public String listFoodsInArrayList(Model model){
        model.addAttribute("foodsKey", foods);
        model.addAttribute("foodsValue", foods);

        return "items";
    }

}
