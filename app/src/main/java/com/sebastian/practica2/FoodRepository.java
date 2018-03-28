package com.sebastian.practica2;

import java.util.ArrayList;
import java.util.List;

public class FoodRepository {

    private static List<Food> foods = new ArrayList<>();

    static {
        foods.add( new Food("img_pizza", "Pizza","20 - 30 mins", "$ 20"));
        foods.add( new Food("img_hamburguesa", "Hamburguesa","5 - 10 mins", "$ 5"));
        foods.add( new Food("img_pollo", "Pollo a la brasa","15 - 20 mins", "$ 25"));
    }

    public  static List<Food> obtenerComidas(){
        return foods;
    }

}
