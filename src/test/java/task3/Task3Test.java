package task3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import task2.Task2;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class Task3Test {

    private Task3 task3;


    @BeforeEach
    public void setUp() {
        task3 = new Task3();
    }

    @Test
    public void indexOfCommonElement() {
        List<Set<Integer>> list = new ArrayList<>();
        list.add(Set.of(1, 2));
        list.add(Set.of(5,6));
        Set<Integer> set = Set.of(2,3);
        assertEquals(task3.indexOfCommonElement(list, set), 0);
    }

    @Test
    public void indexOfCommonElementWhenThereIsNoCommonElementTest() {
        List<Set<Integer>> list = new ArrayList<>();
        list.add(Set.of(1, 2));
        list.add(Set.of(5,6));
        Set<Integer> set = Set.of(7,8);
        assertEquals(task3.indexOfCommonElement(list, set), -1);
    }

    @Test
    public void indexOfCommonElementWhenListIsEmptyElementTest() {
        List<Set<Integer>> list = new ArrayList<>();
        Set<Integer> set = Set.of(7,8);
        assertEquals(task3.indexOfCommonElement(list, set), -1);
    }

    @Test
    public void indexOfCommonElementWhenSetIsEmptyElementTest() {
        List<Set<Integer>> list = new ArrayList<>();
        list.add(Set.of(1, 2));
        list.add(Set.of(5,6));
        Set<Integer> set = new HashSet<>();
        assertEquals(task3.indexOfCommonElement(list, set), -1);
    }

    @Test
    public void task3TestForTwoGraphs(){
        List<Integer[]> pairsOfIntegers = new ArrayList<>();
        Integer[] pair1 = {2,3};
        pairsOfIntegers.add(pair1);
        Integer[] pair2 = {1,2};
        pairsOfIntegers.add(pair2);
        Integer[] pair3 = {5,6};
        pairsOfIntegers.add(pair3);
        assertEquals(task3.task3(3,pairsOfIntegers),2);
    }

    @Test
    public void task3TestForOneGraphs(){
        List<Integer[]> pairsOfIntegers = new ArrayList<>();
        Integer[] pair1 = {1,2};
        pairsOfIntegers.add(pair1);
        Integer[] pair2 = {2,3};
        pairsOfIntegers.add(pair2);
        Integer[] pair3 = {3,4};
        pairsOfIntegers.add(pair3);
        Integer[] pair4 = {4,5};
        pairsOfIntegers.add(pair4);
        assertEquals(task3.task3(4,pairsOfIntegers),1);
    }

}