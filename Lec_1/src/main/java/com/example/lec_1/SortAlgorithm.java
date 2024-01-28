package com.example.lec_1;

import java.util.List;

public interface SortAlgorithm<T extends Comparable<T>> {

    void sort(List<T>  list);


}
