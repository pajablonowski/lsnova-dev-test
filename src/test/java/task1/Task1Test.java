package task1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {

    private Task1 task1;

    @BeforeEach
    public void setUp() {
        task1 = new Task1();
    }

    @Test
    public void getNumberOfElementsInSourceTest(){
        List<Integer> list = List.of(1,2,3,5,7,8);
        assertEquals(task1.getNumberOfElementsInSource(list),6);
    }
    @Test
    public void getNumberOfElementsInEmptySourceTest(){
        List<Integer> list = new ArrayList<>();
        assertEquals(task1.getNumberOfElementsInSource(list),0);
    }

    @Test
    public void getNumberOfDistinctElementsInEmptyListTest(){
        List<Integer> list = new ArrayList<>();
        assertEquals(task1.getNumberOfDistinctElements(list),0);
    }
    @Test
    public void getMinimumListValueTest(){
        List<Integer> list = List.of(1,1,2,3,3);
        assertEquals(task1.getMinimumListValue(list),1);
    }

    @Test
    public void getMinimumListValueFromEmptyListTest(){
        List<Integer> list = new ArrayList<>();
        assertThrows(NoSuchElementException.class, ()-> {
            task1.getMinimumListValue(list);
        });
    }

    @Test
    public void getMaximumListValueTest(){
        List<Integer> list = List.of(1,1,2,3,3);
        assertEquals(task1.getMaximumListValue(list),3);
    }

    @Test
    public void getMaximumListValueFromEmptyListTest(){
        List<Integer> list = new ArrayList<>();
        assertThrows(NoSuchElementException.class, ()-> {
            task1.getMaximumListValue(list);
        });
    }
    @Test
    public void getDistinctListValue(){
        List<Integer> list = List.of(10,9,10,11);
        Set<Integer> set = Set.of(9,10,11);
        assertEquals(task1.getDistinctListValue(list),set);
    }



}