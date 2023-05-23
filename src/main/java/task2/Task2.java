package task2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task2 {

    public void task2(final List<Integer> integersList) {
        List<Integer> sortedIntegersList = getSortedIntegersList(integersList);
        List<Integer[]> pairsOfIntegersEquals13Equals13 = findPairsOfIntegersEquals13(sortedIntegersList);
        for (Integer[] integers : pairsOfIntegersEquals13Equals13) {
            System.out.println(integers[0] + " " + integers[1]);
        }

    }

    public List<Integer> getSortedIntegersList(final List<Integer> integersList) {
        return integersList.stream().sorted().collect(Collectors.toList());
    }

    public List<Integer[]> findPairsOfIntegersEquals13(final List<Integer> integersList) {
        List<Integer[]> pairsOfIntegersEquals13 = new ArrayList<>();
        for (int x = 0; x < integersList.size(); x++) {
            Integer integer = 13 - integersList.get(x);
            if (integer > integersList.get(x) && integersList.contains(integer)) {
                Integer[] pair = {integersList.get(x), integer};
                pairsOfIntegersEquals13.add(pair);
            }
        }
        return pairsOfIntegersEquals13;
    }

    public boolean isSumEquals13(Integer var1, Integer var2) {
        return var1 + var2 == 13;
    }

}
