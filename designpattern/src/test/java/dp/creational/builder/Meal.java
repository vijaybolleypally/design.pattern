package dp.creational.builder;

public class Meal {
    private String mainCourse;

    public String getMainCourse() {
        return mainCourse;
    }

    public void setMainCourse(String mainCourse) {
        this.mainCourse = mainCourse;
    }

    public String toString() {
        return "main course:" + mainCourse + ".";
    }

}
