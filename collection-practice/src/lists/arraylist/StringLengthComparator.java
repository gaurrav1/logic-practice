package lists.arraylist;

import java.util.Comparator;

class StringLengthComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {

        // Ascending
        // return o1.length() - o2.length();

        // Descending
        return o2.length() - o1.length();
    }
}