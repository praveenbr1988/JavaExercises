package exercises.java;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class interview {

    public static void main(String[] args){
        List<Integer> list =Arrays.asList(2,6,1,4,9);
        List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList);

    }



}
