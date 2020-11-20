package com.project;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

enum SortingType {
    INCREASING_BY_VALUE,
    DECREASING_BY_VALUE,
    INCREASING_BY_LENGTH,
    DECREASING_BY_LENGTH
}

public class Sort extends Thread {
    private SortingType sortingType;
    private final List<Integer> array;

    public Sort(int sortingType, List<Integer> array) {
        switch (sortingType) {
            case 1 -> this.sortingType = SortingType.INCREASING_BY_VALUE;
            case 2 -> this.sortingType = SortingType.DECREASING_BY_VALUE;
            case 3 -> this.sortingType = SortingType.INCREASING_BY_LENGTH;
            case 4 -> this.sortingType = SortingType.DECREASING_BY_LENGTH;
        }
        this.array = array;
    }

    @Override
    public synchronized void start() {
        switch (sortingType) {
            case INCREASING_BY_VALUE -> Collections.sort(array);
            case DECREASING_BY_VALUE -> array.sort(Comparator.reverseOrder());
            case INCREASING_BY_LENGTH -> array.sort((Comparator.comparingInt(o -> o.toString().length())));
            case DECREASING_BY_LENGTH -> array.sort(((o1, o2) -> o2.toString().length() - o1.toString().length()));
        }
    }
}
