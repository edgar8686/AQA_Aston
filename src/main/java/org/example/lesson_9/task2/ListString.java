package org.example.lesson_9.task2;

import java.util.List;

public class ListString {
    private List<String> list;
    private long count;
    private String str;

    public ListString(List list) {
        this.list = list;
    }

    public void getCountStr() {
        count = list.stream()
                .filter(l -> l.equals("High"))
                .count();
        System.out.println("Слово High встречается в коллекции: " + count);
    }

    public void getFirstElement() {
        str = list.stream()
                .findFirst()
                .orElse("0");
        System.out.println(str);
    }

    public void getLastElement() {
        str = list.stream()
                .reduce((first, second) -> second)
                .orElse("0");
        System.out.println(str);
    }

    public List<String> getList() {
        return list;
    }

    public long getCount() {
        return count;
    }

    public String getStr() {
        return str;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setCount(long count) {
        this.count = count;
    }

    public void setStr(String str) {
        this.str = str;
    }
}
