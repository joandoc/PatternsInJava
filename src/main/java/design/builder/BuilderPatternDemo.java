package design.builder;

import design.builder.impl.Meal;

/**
 * Created by Joan do Carmo on 10/11/15.
 */
public class BuilderPatternDemo {
    public static void main(String[] args) {

        // Builder pattern builds a complex object using simple objects and using a step by step approach.
        // A Builder class builds the final object step by step. This builder is independent of other objects.

        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost: " + vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("\n\nNon-Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total Cost: " + nonVegMeal.getCost());
    }
}