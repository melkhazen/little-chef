package com.mohamedelkhazen.littlechef.controllers;

import com.mohamedelkhazen.littlechef.models.Foods;
import com.mohamedelkhazen.littlechef.models.VegetablesList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;

@Controller
@RequestMapping(value = "")
public class FoodsListController {

    VegetablesList newVegetablesList = new VegetablesList();

    HashMap<String, ArrayList<String>> foods = new HashMap<>();

    public FoodsListController () {
        foods.put("Vegetables", VegetablesList.getFoodsList());
    }

    @RequestMapping(value = "")
    public String listFoodsInArrayList(Model model){
        model.addAttribute("foods", foods);
        return "index";
    }

}
