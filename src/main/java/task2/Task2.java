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
            for (int y = 0; y < integersList.size(); y++) {
                if (x != y) {
                    if (integersList.get(x) < integersList.get(y)) {
                        if (isSumEquals13(integersList.get(x), integersList.get(y))) {
                            Integer[] pair = {integersList.get(x), integersList.get(y)};
                            pairsOfIntegersEquals13.add(pair);
                        }
                    }
                }
            }
        }
        return pairsOfIntegersEquals13;
    }

    public boolean isSumEquals13(Integer var1, Integer var2) {
        return var1 + var2 == 13;
    }

}
