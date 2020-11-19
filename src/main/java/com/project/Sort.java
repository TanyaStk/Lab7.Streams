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
    private final SortingType sortingType;

    public Sort(SortingType sortingType) {
        this.sortingType = sortingType;
    }

    public void run(List<Integer> array) {
        switch (sortingType) {
            case INCREASING_BY_VALUE -> Collections.sort(array);
            case DECREASING_BY_VALUE -> array.sort(Comparator.reverseOrder());
            case INCREASING_BY_LENGTH -> array.sort(new CompareByLength());
            case DECREASING_BY_LENGTH -> array.sort(new CompareByLength().reversed());
        }
    }
}
