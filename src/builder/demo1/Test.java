package builder.demo1;

/**
 * @author CookiesEason
 * 2018/12/11 20:59
 */
public class Test {

    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();
        Meal meal = mealBuilder.prepareNonVegMeal();
        meal.showItems();
        System.out.println(meal.getCost());
    }

}
