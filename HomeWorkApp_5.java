package Java_homework.Java_homework;

public class HomeWorkApp_5 {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Ильин", "Антон", "Николаевич", "Тестировщик", "ilin@yndex.ru", 89991112233L, 50000, 32);
        Employee employee2 = new Employee("Иванов", "Иван", "Иванович", "Программист", "ivanov@mail.ru", 89994445566L, 80000, 41);
        Employee employee3 = new Employee("Смирнов", "Семен", "Андреевич", "Аналитик", "smirnov@rambler.com", 89997778899L, 70000, 35);
        Employee employee4 = new Employee("Сидоров", "Степан", "Дмитриевич", "Менеджер", "sidorov@gmail.com", 89992223344L, 70000, 42);
        Employee employee5 = new Employee("Семенов", "Артем", "Сергеевич", "Руководитель", "semenov@outlook.com", 89995556677L, 100000, 44);

        Employee[] employees = {employee1, employee2, employee3, employee4, employee5};

        for (int i = 0; i < employees.length; i++) {
            if(employees[i].getAge() > 40) {
                employees[i].printInfo();
            }
        }

        System.out.println("Всего работников: " + Employee.getEmployeeCount());
    }
}


