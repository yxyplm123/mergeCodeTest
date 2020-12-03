package sample;

import java.util.ArrayList;
import java.util.List;

public class Test002 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.stream().forEach(x-> System.out.println("打印:"+x));
    }
}
