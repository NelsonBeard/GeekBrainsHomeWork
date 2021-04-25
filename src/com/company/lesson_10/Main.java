package com.company.lesson_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        findUniqueAnimals();
    }

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
}
