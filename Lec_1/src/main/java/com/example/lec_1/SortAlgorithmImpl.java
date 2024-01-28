package com.example.lec_1;

import java.util.Collections;
import java.util.List;

public class SortAlgorithmImpl<T extends Comparable<T>> implements SortAlgorithm<T> {
    @Override
    public void sort(List<T> list) {
        Collections.sort(list);
    }
}
