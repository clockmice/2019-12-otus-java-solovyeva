package ru.otus.homework.hw01;

import com.google.common.base.Optional;

public class HelloOtus {
    public static void main(String args[]) {
        HelloOtus guavaTester = new HelloOtus();

        Optional<Integer> a =  Optional.of(5);
        Optional<Integer> b =  Optional.of(10);
        System.out.println(guavaTester.sum(a,b));
    }

    public Integer sum(Optional<Integer> a, Optional<Integer> b) {
        return a.get() + b.get();
    }
}
