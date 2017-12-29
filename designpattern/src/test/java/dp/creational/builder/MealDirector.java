package dp.creational.builder;

public class MealDirector {
    private MealBuilder mealBuilder = null;

    public MealDirector(MealBuilder mealBuilder) {
        this.mealBuilder = mealBuilder;
    }

    public void constructMeal() {
        mealBuilder.buildMainCourse();
    }

    public Meal getMeal() {
        return mealBuilder.getMeal();
    }

}
