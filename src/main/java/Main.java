import task1.Task1;
import task2.Task2;
import task3.Task3;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println("======================");
        System.out.println("Task1");
        Task1 task1 = new Task1();
        task1.task1(List.of(1, 10, 20, 20, 2, 5));

        System.out.println("======================");
        System.out.println("Task2");
        Task2 task2 = new Task2();
        task2.task2(List.of(1, 2, 10, 7, 5, 3, 6, 6, 13, 0));
        System.out.println("======================");
        System.out.println("Task3");
        Task3 task3 = new Task3();
        List<Integer[]> pairsOfIntegers = new ArrayList<>();
        Integer[] pair1 = {2,3};
        pairsOfIntegers.add(pair1);
        Integer[] pair2 = {1,2};
        pairsOfIntegers.add(pair2);
        Integer[] pair3 = {5,6};
        pairsOfIntegers.add(pair3);
        System.out.println(task3.task3(3, pairsOfIntegers));
    }

}
