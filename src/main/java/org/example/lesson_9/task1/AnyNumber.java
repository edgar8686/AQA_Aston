package org.example.lesson_9.task1;

import java.util.stream.IntStream;

public class AnyNumber {
    private int[] arr;
    private long count;

    public AnyNumber(int[] array) {
        this.arr = array;
    }

    public void getCountEvenNumber() {
        count = IntStream.of(arr)
                .filter(k -> k % 2 == 0)
                .count();
        System.out.println("Количество четных чисел: " + count);
    }

    public int[] getArr() {
        return arr;
    }

    public long getCount() {
        return count;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public void setCount(long count) {
        this.count = count;
    }
}
