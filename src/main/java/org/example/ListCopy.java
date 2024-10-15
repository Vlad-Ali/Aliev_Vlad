package org.example;

import java.util.ArrayList;
import java.util.List;

public class ListCopy {
    public List<Integer> listcopy(List<Integer> list){
        if (list==null){
            throw new IllegalArgumentException("can't copy, because List is null");
        }
        List<Integer> newlist=new ArrayList<>();
        for (int i=0; i<list.size();i++){
            newlist.add(list.get(i));
        }
        return newlist;
    }
}
