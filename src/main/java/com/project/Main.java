package com.project;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main extends Thread {
    private final int size;
    private SortingType sortingType;

    public Main(int size, int sortingType) {
        this.size = size;
        switch (sortingType) {
            case 1 -> this.sortingType = SortingType.INCREASING_BY_VALUE;
            case 2 -> this.sortingType = SortingType.DECREASING_BY_VALUE;
            case 3 -> this.sortingType = SortingType.INCREASING_BY_LENGTH;
            case 4 -> this.sortingType = SortingType.DECREASING_BY_LENGTH;
        }
    }

    @Override
    public synchronized void start() {
        List<Integer> array = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array.add(random.nextInt(1000));
        }
        System.out.println("Original array:");
        for (int elem : array) {
            System.out.print(elem + " ");
        }
        Sort sort = new Sort(sortingType);
        sort.run(array);
        System.out.println("Sorted array:");
        for (int elem : array) {
            System.out.print(elem + " ");
        }
    }
}
