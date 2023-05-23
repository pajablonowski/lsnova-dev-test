package task1;

import java.util.*;

public class Task1 {

    List<Integer> list;
    Set<Integer> set;

    LinkedList<Integer> linkedList;


    public Task1(List<Integer> integerList) {
        this.list = integerList;
        this.set = convertListIntoSet(integerList);
        this.linkedList = convertSetIntoLinkedList(set);
    }

    public void task1() {
        System.out.println(set);
        System.out.println("count: "+ list.size());
        System.out.println("distinct: " + set.size());
        System.out.println("min: " + linkedList.getFirst());
        System.out.println("max: " + linkedList.getLast());
    }

    public Set<Integer> convertListIntoSet(List<Integer> list){
        return new TreeSet<>(list);
    }

    public LinkedList<Integer> convertSetIntoLinkedList(Set<Integer> set){
        return new LinkedList<>(set);
    }

}
