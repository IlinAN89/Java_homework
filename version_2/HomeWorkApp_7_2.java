package Java_homework.Java_homework.version_2;

public class HomeWorkApp_7_2 {
    public static void main(String[] args) throws InterruptedException {
        Cat cat1 = new Cat("Мурзик");
        Cat cat2 = new Cat("Барсик");
        Cat cat3 = new Cat("Рыжик");

        Plate plate = new Plate(0);

        Cat[] cats = {cat1, cat2, cat3};

        while (true) {
            plate.addFoodCount(10);
            for (Cat cat : cats) {
                cat.eat(plate);
                System.out.printf("%s поел и его сытость: %s%n", cat.getName(), cat.isSatiety());
            }
            plate.printInfo();
            Thread.sleep(3000);
        }
    }
}
