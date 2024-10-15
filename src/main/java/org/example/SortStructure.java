package org.example;

import java.util.List;
import java.util.NoSuchElementException;

public class SortStructure {
    private final List<SortStrategy> sortStrategies;

    public SortStructure(List<SortStrategy> sortStrategies) {
        this.sortStrategies=sortStrategies;
    }
    public List<Integer> sort(List<Integer> arr, SortStrategy sortStrategy){
        boolean foundSort=false;
        for(SortStrategy strategy: sortStrategies){
            if (strategy.type().equals(sortStrategy.type())){
                foundSort=true;
                try {
                    return sortStrategy.Sort(arr);
                }
                catch (IllegalArgumentException e){
                    throw e;
                }
                catch (IllegalStateException e){
                    //keep going
                }
            }
        }
        if (foundSort){
            throw new IllegalStateException("List size " + arr.size() + " is too large");
        }
        else{
            throw new NoSuchElementException(sortStrategy.type()+" is not found");
        }
    }
}

