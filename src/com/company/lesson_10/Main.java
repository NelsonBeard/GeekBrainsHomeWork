package com.company.lesson_10;

import java.util.*;

public class Main {

    public static void findUniqueAnimals() {
        ArrayList<String> animalList = new ArrayList<>(Arrays.asList("Козел", "Кот", "Жираф", "Козел",
                "Собака", "Курица", "Козел", "Жираф", "Кабан", "Собака", "Медведь", "Собака",
                "Лиса", "Козел", "Тигр", "Заяц", "Тигр"));
        HashSet<String> uniqueAnimals = new HashSet<>(animalList);
        System.out.println("Слова без повторений: " + uniqueAnimals);
        System.out.println();
        System.out.println("Повторение слов: ");
        for (String animal : uniqueAnimals) {
            int count = Collections.frequency(animalList, animal);
            System.out.println(animal + " - " + count);
        }
    }

    public static void main(String[] args) {
        findUniqueAnimals();
        System.out.println();

        Phonebook colleagues = new Phonebook();
        colleagues.add("221332", "Иванов");
        colleagues.add("11233", "Иванов");
        colleagues.add("453223", "Петров");
        colleagues.add("896445", "Васечкин");
        colleagues.add("896445", "Фесенко");
        colleagues.add("469556", "Сафин");
        colleagues.add("254487", "Сафин");

//        colleagues.printPhonebook();
//        System.out.println();

        colleagues.get("иванов");
        colleagues.get("Васечкин");
    }
}
