package leetcodePractice;

import java.util.LinkedHashMap;

public class RomanTONumeral {
    public static void main(String[] args) {

        String roman = "MCMXCIV";
        LinkedHashMap<String,Integer> map1= new LinkedHashMap<>();
        map1.put("IV",4);
        map1.put("IX",9);
        map1.put("XL",40);
        map1.put("XC",90);
        map1.put("CD",400);
        map1.put("CM",900);

        LinkedHashMap<String,Integer> map2= new LinkedHashMap<>();
        map2.put("I",1);
        map2.put("V",5);
        map2.put("X",10);
        map2.put("L",50);
        map2.put("C",100);
        map2.put("D",500);
        map2.put("M",1000);

        for(String s : map1.keySet()){
            if(roman.contains(s)){
                roman = roman.replace(s,map1.get(s)+",");
            }
        }

        for(String s : map2.keySet()){
            if(roman.contains(s)){
                roman = roman.replace(s,map2.get(s)+",");
            }
        }

        System.out.println(roman);
        System.out.println(roman.length());
        roman=roman.substring(0,roman.length()-1);
        System.out.println(roman);
        String[] romanarr = roman.split(",");

        int integerNo=0;
        for(String s:romanarr){
            integerNo=integerNo+Integer.parseInt(s);
        }

        System.out.println(integerNo);


    }
}
