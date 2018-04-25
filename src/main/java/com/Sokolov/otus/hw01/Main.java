package com.Sokolov.otus.hw01;
import com.google.common.base.Joiner;
import com.google.common.collect.Lists;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = Lists.newArrayList("Denis", "Dimon", "Alex", "John");
        String result = Joiner.on(',').join(names.toArray());
        System.out.println(result);
        
    }
}