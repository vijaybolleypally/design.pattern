package dp.creational.builder;

public class IndianMealBuilder implements MealBuilder {

    Meal meal;

    public IndianMealBuilder() {
        meal = new Meal();
    }

    public void buildMainCourse() {
        meal.setMainCourse("Rice");
    }

    public Meal getMeal() {
        return meal;
    }
}
