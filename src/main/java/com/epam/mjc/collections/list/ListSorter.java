package com.epam.mjc.collections.list;

import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        sourceList.sort(new ListComparator());
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int x = Integer.parseInt(a);
        int y = Integer.parseInt(b);
        int resultA = 5 * x * x + 3;
        int resultB = 5 * y * y + 3;
        int compareResult = Integer.compare(resultA, resultB);
        return compareResult != 0 ? compareResult : Integer.compare(x, y);
    }
}
