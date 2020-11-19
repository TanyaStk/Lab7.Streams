package com.project;

import java.util.Comparator;

public class CompareByLength implements Comparator<Integer> {
    public int compare(Integer num1, Integer num2) {
        return num1.toString().length() - num2.toString().length();
    }
}
