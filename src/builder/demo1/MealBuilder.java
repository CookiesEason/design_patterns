package builder.demo1;

/**
 * @author CookiesEason
 * 2018/12/11 20:58
 */
public class MealBuilder {


    public Meal prepareNonVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Coke());
        return meal;
    }

}
