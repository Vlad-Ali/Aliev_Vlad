package org.example;

import CustomArrayList.CustomArrayList;



public class Main {
    public static void main(String[] args) {
        CustomArrayList<Integer> Arr= new CustomArrayList<Integer>();
        Arr.add(1,0);
        Arr.add(0);
        Arr.add(2);
        Arr.add(1);
        Arr.add(0);
        Arr.remove(2);
        Arr.add(4);
        Arr.add(2);
        Arr.remove(1);
        Arr.add(8,2);
        System.out.println(Arr.size()+" "+Arr.get(0));
    }
}