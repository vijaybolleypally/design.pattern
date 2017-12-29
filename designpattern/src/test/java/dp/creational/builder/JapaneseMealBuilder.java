package dp.creational.builder;

public class JapaneseMealBuilder implements MealBuilder {
    Meal meal;

    public JapaneseMealBuilder() {
        meal = new Meal();
    }

    public void buildMainCourse() {
        meal.setMainCourse("Noodles");
    }

    public Meal getMeal() {
        return meal;
    }
}
