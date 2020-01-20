package ru.otus.homework.hw02;

import ru.otus.homework.hw02.containers.DIYarrayList;

import java.util.*;

public class Demo {

    public static void main(String[] args) {

        List<Integer> listNumbers = List.of(0, 1, 2, 3, 5, 6, 7, 8, 9, 10);

        List<Integer> newlist = new DIYarrayList<>();
        System.out.println(newlist.size());
        newlist.addAll(listNumbers);
        newlist.addAll(listNumbers);
        System.out.println(newlist.size());

        List<Integer> destlist = new DIYarrayList<>();
        Collections.addAll(destlist, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
        Collections.addAll(destlist, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
        System.out.println(destlist.size());
        Collections.copy(destlist, newlist);
        System.out.println(destlist);
    }

}
