package task2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import task1.Task1;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Task2Test {

    private Task2 task2;

    @BeforeEach
    public void setUp() {
        task2 = new Task2();
    }

    @Test
    public void getSortedIntegersListTest(){
        List<Integer> integerListToTest = List.of(3,4,2,1);
        List<Integer> integerListExpected = List.of(1,2,3,4);
        assertEquals(task2.getSortedIntegersList(integerListToTest), integerListExpected);
    }

    @Test
    public void getSortedIntegersListForEmptyListTest(){
        List<Integer> integerListToTest = new ArrayList<>();
        List<Integer> integerListExpected = new ArrayList<>();
        assertEquals(task2.getSortedIntegersList(integerListToTest), integerListExpected);
    }

    @Test
    public void isSumEquals13ForTrueTest(){
        assertEquals(task2.isSumEquals13(10,3), true);
    }
    @Test
    public void isSumEquals13ForFalseTest(){
        assertEquals(task2.isSumEquals13(19,3), false);
    }

    @Test
    public void findPairsOfIntegersEquals13Test(){
        List<Integer> integerList = List.of(1,2,10,7,5,3,6,6,13,0);
        List<Integer[]> listOfIntPairs = new ArrayList<>();
        Integer[] pair1 = {0, 13};
        listOfIntPairs.add(pair1);
        Integer[] pair2 = {3, 10};
        listOfIntPairs.add(pair2);
        Integer[] pair3 = {6, 7};
        listOfIntPairs.add(pair3);
        Integer[] pair4 = {6, 7};
        listOfIntPairs.add(pair4);
        List<Integer> sortedIntegersList = task2.getSortedIntegersList(integerList);
        List<Integer[]> pairsOfIntegersEquals13 = task2.findPairsOfIntegersEquals13(sortedIntegersList);
        int indeks = 0;
        for (Integer[] integers : pairsOfIntegersEquals13) {
            assertEquals(integers[0], listOfIntPairs.get(indeks)[0]);
            assertEquals(integers[1], listOfIntPairs.get(indeks)[1]);
            indeks++;
        }
    }

}