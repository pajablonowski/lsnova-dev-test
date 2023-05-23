package task3;

import java.util.*;

public class Task3 {

    public int task3(final Integer numberOfLines, final List<Set<Integer>> integersList) {
        if (numberOfLines == 0) {
            return 0;
        }
        List<Set<Integer>> integersListTemp = integersList;
        boolean restartLoop;
        do {
            restartLoop = false;
            for (int x = 0; x < integersListTemp.size(); x++) {
                for (int y = 0; y < integersListTemp.size(); y++) {
                    if (x != y) {
                        if (doesLinesContainsCommonValue(integersList.get(x), integersList.get(y))) {
                            Set<Integer> temp = new TreeSet<>();
                            temp.addAll(integersListTemp.get(x));
                            temp.addAll(integersListTemp.get(y));
                            integersListTemp.remove(integersListTemp.get(x));
                            integersListTemp.remove(integersListTemp.get(y - 1));
                            integersListTemp.add(temp);
                            restartLoop = true;
                        }
                    }
                    if (restartLoop){
                        break;
                    }
                }
                if (restartLoop){
                    break;
                }
            }
        } while (restartLoop);
        return integersListTemp.size();
    }

    public boolean doesLinesContainsCommonValue(Set<Integer> set1, Set<Integer> set2) {
        for (Integer integer : set1) {
            if (set2.contains(integer)) {
                return true;
            }
        }
        return false;
    }
}
