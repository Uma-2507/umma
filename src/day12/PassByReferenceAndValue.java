package day12;

import java.util.ArrayList;
import java.util.List;

public class PassByReferenceAndValue {
    public static void checkAndAddBoyNames(List<String> uniques, List<String> boys){
        for(String name:boys){
            if(uniques.contains(name)){
                uniques.add(name);
            }
        }
    }

    public static void checkAndAddGirlNames(List<String> uniques, List<String> girls){
         for(String name:girls){
             if(uniques.contains(name)){
                 uniques.add(name);
             }
         }

    }
    public static void main(String[] args){
        List<String> uniqueNames=new ArrayList<>();
        uniqueNames.add("krish");
        uniqueNames.add("manoj");
        uniqueNames.add("uma");
        List<String> boysNames =List.of("krish", "manoj", "uma");
        List<String> girlsNames =List.of("tanivi","dharani","aadhya","depptak");
        System.out.println("before adding names"+uniqueNames);
        checkAndAddBoyNames(uniqueNames,boysNames);
        checkAndAddGirlNames(uniqueNames,girlsNames);
        System.out.println("after adding names"+uniqueNames);
    }
}
