package lists.arraylist;

import java.util.Comparator;

class IntegerLengthComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        // Ascending order
        // return o1 - o2;

        // Descending order
        return o2 - o1;
    }
}