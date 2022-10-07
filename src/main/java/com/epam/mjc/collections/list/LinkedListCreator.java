package com.epam.mjc.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {
        LinkedList<Integer> resultList = new LinkedList<>();
        for (Integer element : sourceList) {
            if(element % 2 == 0) {
                resultList.addLast(element);
            } else {
                resultList.addFirst(element);
            }
        }
        return resultList;
    }
}
