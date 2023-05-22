package task3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task3 {

    public int task3(final Integer numberOfLines, final List<Integer[]> integersList) {
        if (numberOfLines == 0) {
            return 0;
        }
        List<Set<Integer>> listOfGraphs = new ArrayList<>();
        listOfGraphs.add(Set.of(integersList.get(0)[0], integersList.get(0)[1]));
        for (int i = 1; i < numberOfLines; i++) {
            Set<Integer> subList = Set.of(integersList.get(i)[0], integersList.get(i)[1]);
            int index = indexOfCommonElement(listOfGraphs, subList);
            if (index == -1) {
                listOfGraphs.add(subList);
            } else {
                Set<Integer> integers = new HashSet<>();
                listOfGraphs.get(index).stream().forEach(x -> integers.add(x));
                subList.stream().forEach(y -> integers.add(y));
                listOfGraphs.remove(index);
                listOfGraphs.add(integers);
            }
        }
        return listOfGraphs.size();
    }

    public int indexOfCommonElement(List<Set<Integer>> list, Set<Integer> set) {
        for (Integer integer : set) {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).contains(integer)) {
                    return i;
                }
            }
        }
        return -1;
    }
}
