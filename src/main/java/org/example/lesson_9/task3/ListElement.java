package org.example.lesson_9.task3;

import java.util.Arrays;
import java.util.List;

public class ListElement {
    private List<String> list;

    public ListElement(List list) {
        this.list = list;
    }

    public void getArrSorted() {
        String[] sortedArray = list.stream()
                .sorted()
                .toArray(String[]::new);
        System.out.println(Arrays.toString(sortedArray));
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }
}
