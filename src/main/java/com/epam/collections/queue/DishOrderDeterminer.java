package com.epam.collections.queue;

import java.util.*;

public class DishOrderDeterminer {


    public  List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {

        List<Integer> integers = new LinkedList<>();

        Queue<Integer> res = new LinkedList<>();


        for (int i = 1; i <= numberOfDishes; i++) {
            integers.add(i);
        }

        int c = 0;

        int i = -1;

        while (!integers.isEmpty()) {

            i++;
            c++;

            if (c % everyDishNumberToEat == 0) {

                res.add(integers.get(i));
                integers.remove(i);
                c = 0;
                i--;
            }
            
            if (i == integers.size() - 1)
                i = -1;
        }


        return (List<Integer>) res;
    }
}
