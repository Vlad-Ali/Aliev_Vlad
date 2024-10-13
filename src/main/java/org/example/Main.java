package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> arr= new ArrayList<>(List.of(-2,1,2,100,1,-10,2,10,2,1000,2,-1000,2,2));
        SortStructure sortStructure=new SortStructure(List.of(new MergeSort()));
        List<Integer> arr1 = sortStructure.sort(null,new MergeSort());
        System.out.println(arr1.toString());
    }
}