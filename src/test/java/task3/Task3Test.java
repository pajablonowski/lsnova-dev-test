package task3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class Task3Test {

    private Task3 task3;


    @BeforeEach
    public void setUp() {
        task3 = new Task3();
    }

    @Test
    public void task3TestForTwoGraphsFirstExample(){
        List<Set<Integer>> pairsOfIntegers = new ArrayList<>();
        pairsOfIntegers.add(Set.of(2,3));
        pairsOfIntegers.add(Set.of(1,2));
        pairsOfIntegers.add(Set.of(5,6));
        assertEquals(task3.task3(3,pairsOfIntegers),2);
    }
    @Test
    public void task3TestForTwoGraphsSecondExample(){
        List<Set<Integer>> pairsOfIntegers = new ArrayList<>();
        pairsOfIntegers.add(Set.of(1,2));
        pairsOfIntegers.add(Set.of(3,4));
        pairsOfIntegers.add(Set.of(1,3));
        assertEquals(task3.task3(3,pairsOfIntegers),1);
    }

    @Test
    public void task3TestForOneGraphs(){
        List<Set<Integer>> pairsOfIntegers = new ArrayList<>();
        pairsOfIntegers.add(Set.of(1,2));
        pairsOfIntegers.add(Set.of(2,3));
        pairsOfIntegers.add(Set.of(3,4));
        pairsOfIntegers.add(Set.of(4,5));

        assertEquals(task3.task3(4,pairsOfIntegers),1);
    }

    @Test
    public void doesLinesContainsCommonValueForFalseTest(){
        Set<Integer> set1 = new TreeSet();
        set1.addAll(Set.of(1,2,3));
        Set<Integer> set2 = new TreeSet();
        set2.addAll(Set.of(4,5,6));
        assertEquals(task3.doesLinesContainsCommonValue(set1,set2), false);
    }
    @Test
    public void doesLinesContainsCommonValueForTrueTest(){
        Set<Integer> set1 = new TreeSet();
        set1.addAll(Set.of(1,2,3));
        Set<Integer> set2 = new TreeSet();
        set2.addAll(Set.of(3,4,5));
        assertEquals(task3.doesLinesContainsCommonValue(set1,set2), true);
    }
    @Test
    public void doesLinesContainsCommonValueWhenFirstParamIsEmptyTest(){
        Set<Integer> set1 = new TreeSet();
        Set<Integer> set2 = new TreeSet();
        set2.addAll(Set.of(3,4,5));
        assertEquals(task3.doesLinesContainsCommonValue(set1,set2), false);
    }

    @Test
    public void doesLinesContainsCommonValueWhenSecondParamIsEmptyTest(){
        Set<Integer> set1 = new TreeSet();
        set1.addAll(Set.of(1,2,3));
        Set<Integer> set2 = new TreeSet();
        assertEquals(task3.doesLinesContainsCommonValue(set1,set2), false);
    }

}