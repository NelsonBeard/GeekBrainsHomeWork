package com.company.lesson_10;

import java.util.HashMap;

public class Phonebook {
    private HashMap<String, String> phonebook;

    public Phonebook() {
        this.phonebook = new HashMap<>();
    }

    public void add(String phoneNumber, String surname) {
        if (!phonebook.containsKey(phoneNumber)) {
            phonebook.put(phoneNumber, surname);
        }
    }

    public void get(String surname) {
        for (HashMap.Entry<String, String> searchNumber : phonebook.entrySet()) {
            if (surname.equalsIgnoreCase(searchNumber.getValue())) {
                System.out.println(searchNumber.getValue() + " " + searchNumber.getKey());
            }
        }
    }

    //    Сделал метод для себя, для проверки работы кода. Удалять не стал, вдруг вам тоже понадобится.
//    public void printPhonebook() {
//        for (HashMap.Entry<String, String> print : phonebook.entrySet()) {
//            System.out.println(print.getValue() + " " + print.getKey());
//        }
//    }
}
