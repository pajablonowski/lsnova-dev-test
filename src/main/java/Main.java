import task1.Task1;
import task2.Task2;
import task3.Task3;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("======================");
        System.out.println("Task1");
        Task1 task1 = new Task1(List.of(1, 10, 20, 20, 2, 5));
        task1.task1();

        System.out.println("======================");
        System.out.println("Task2");
        Task2 task2 = new Task2();
        task2.task2(List.of(1, 2, 10, 7, 5, 3, 6, 6, 13, 0));

        System.out.println("======================");
        System.out.println("Task3");
        Task3 task3 = new Task3();
        List<Set<Integer>> pairsOfIntegers = new ArrayList<>();
        pairsOfIntegers.add(Set.of(2,3));
        pairsOfIntegers.add(Set.of(1,2));
        pairsOfIntegers.add(Set.of(5,6));

        System.out.println(task3.task3(3, pairsOfIntegers));
    }

}
