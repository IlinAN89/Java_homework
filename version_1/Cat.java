package Java_homework.Java_homework.version_1;

public class Cat {
    private String name;
    private int appetite;
    private int satietyTime;
    private int satiety;

    public Cat(String name, int appetite, int satietyTime) {
        this.name = name;
        this.appetite = appetite;
        this.satietyTime = satietyTime;
        this.satiety = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public int getSatietyTime() {
        return satietyTime;
    }

    public void setSatietyTime(int satietyTime) {
        this.satietyTime = satietyTime;
    }

    public int getSatiety() {
        return satiety;
    }

    public void setSatiety(int satiety) {
        this.satiety = satiety;
    }

    public void eat(Plate plate) {
        plate.decreaseFood(appetite);
        satiety += satietyTime;
    }
}
