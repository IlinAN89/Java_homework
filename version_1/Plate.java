package Java_homework.Java_homework.version_1;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public void decreaseFood(int n) {
        food -= n;
    }

    void increaseFood() {
        this.food += 400;
        System.out.println("В миску добавили 400 грамм корма.");
    }

    boolean checkFood(int n) {
        return (food - n) >= 0;
    }
}
