package com.company.Lesson_5;

public class Main {
    private static final int EMPLOYEES_QUANTITY = 5;

    public static void main(String[] args) {
        Employee[] employeesArray = new Employee[EMPLOYEES_QUANTITY];
        employeesArray[0] = new Employee("Иванов Иван Иванович", "Ведущий инженер",
                "vanka@mail.com", 5465544, 40000, 45);
        employeesArray[1] = new Employee("Дмитриев Двмитрий Дмитриевич ", "Главный инженер",
                "dimka@mail.com", 5112544, 45000, 38);
        employeesArray[2] = new Employee("Сергеев Сергей Сергеевич ", "Начальник участка",
                "serega@mail.com", 1112543, 55000, 52);
        employeesArray[3] = new Employee("Никитин Николай Николаевич ", "Младший слесарь",
                "nikitka123@mail.com", 8314544, 28000, 23);
        employeesArray[4] = new Employee("Викторов Виктор Викторович ", "Старший слесарь",
                "vitka@mail.com", 236659, 31000, 58);
        for (int i = 0; i < EMPLOYEES_QUANTITY; i++) {
                if (employeesArray[i].getAge() > 40) {
                    employeesArray[i].showEmployeeInformation();
                }
        }
    }
}
