package Java_homework.Java_homework.version_2;

public class Plate {
    private int foodCount;

    public Plate(int foodCount) {
        this.foodCount = foodCount;
    }

    public void printInfo() {
        System.out.println("Количество еды в миске: " + foodCount);
    }

    public void descreaseFood(int catEatFoodCount) {
        foodCount -= catEatFoodCount;
    }

    public int getFoodCount() {
        return foodCount;
    }

    public void addFoodCount(int foodCount) {
        this.foodCount += foodCount;
    }
}
