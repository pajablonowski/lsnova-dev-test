package task1;

import java.util.*;

public class Task1 {
    public void task1(final List<Integer> integerList) {
        System.out.println(getDistinctListValue(integerList));
        System.out.println("count: "+ getNumberOfElementsInSource(integerList));
        System.out.println("distinct: " + getNumberOfDistinctElements(integerList));
        System.out.println("min: " + getMinimumListValue(integerList));
        System.out.println("max: " + getMaximumListValue(integerList));
    }

    public Set<Integer> getDistinctListValue(final List<Integer> integerList) {
        return new HashSet<>(integerList);
    }

    public int getNumberOfElementsInSource(final List<Integer> integerList) {
        return integerList.size();
    }

    public int getNumberOfDistinctElements(final List<Integer> integerList) {
        return new LinkedList<>(integerList).size();
    }

    public int getMinimumListValue(final List<Integer> integerList) {
        return new LinkedList<>(integerList).getFirst();

    }

    public int getMaximumListValue(final List<Integer> integerList) {
        return new LinkedList<>(integerList).getLast();

    }
}
