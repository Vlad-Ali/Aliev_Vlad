package org.example;

import java.util.List;

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
                catch (NullPointerException e){
                    throw e;
                }
                catch (IllegalStateException e){
                }
            }
        }
        if (foundSort){
            throw new IllegalStateException("List size " + arr.size() + " is too large");
        }
        else{
            throw new NoClassDefFoundError(sortStrategy.type()+" is not found");
        }
    }
}

