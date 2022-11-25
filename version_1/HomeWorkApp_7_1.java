package Java_homework.Java_homework.version_1;

public class HomeWorkApp_7_1 {
    private static int TIME = 1;

    public static void main(String[] args) {
        Cat cat1 = new Cat("Мурзик", 400, 3);
        Cat cat2 = new Cat("Барсик", 300, 2);
        Cat cat3 = new Cat("Рыжик", 350, 4);

        Plate plate = new Plate(1000);

        Cat[] cats= {cat1, cat2, cat3};

        System.out.println("У Вас есть три кота: " + cats[0].getName() + ", " + cats[1].getName() + " и " + cats[2].getName() + ", которые хотят есть каждые " + cats[0].getSatietyTime() + ", " + cats[1].getSatietyTime() + " и " + cats[2].getSatietyTime() + " час(а) соответственно.");
        System.out.println("Коты имеют разный аппетит. Сейчас в миске " + plate.getFood() + " грамм корма.\nСейчас коты голодны и направляются кушать.\n");
        do {
            for (Cat i : cats) {
                if (i.getSatiety() == 0) {
                    if (!plate.checkFood(i.getAppetite())) {
                        plate.increaseFood();
                    }
                    i.eat(plate);
                    System.out.println("Кот " + i.getName() + " съел " + i.getAppetite() + " граммов корма и проголодается через " + (i.getSatiety()) + " часа(ов).");
                }
                i.setSatiety(i.getSatiety() - 1);
            }
            System.out.println("\nПрошел(ло) " + TIME + " час(а/ов). В миске осталось " + plate.getFood() + " граммов корма.\n");
            TIME++;
        } while (TIME <= 24);
    }
}
