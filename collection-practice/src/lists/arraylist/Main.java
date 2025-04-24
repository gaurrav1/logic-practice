package lists.arraylist;

import java.util.*;

public class Main {
    // ArrayList can can increase size dynamically.
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        // By default, capacity is 10.
        // If array gets full, it will increase capacity by 1.5x.
        // It takes O(n) for copying new element into new volume array.
        // ArrayList<Integer> arrayList = new ArrayList<>(1000); -> Now it is 1000 capacity arraylist - means no need to increase size until 1000 elements, but size is still 0 because there is noo element stored
        arrayList.add(3);
        arrayList.add(7);
        arrayList.add(10);
        System.out.println("ArrayList element at 2: " + arrayList.get(2));
        System.out.println("Size of the arraylist: " + arrayList.size());

        for (int element : arrayList) {
            System.out.print(element + " ");
        }

        System.out.println();
        System.out.println("Does 10 contains by arraylist? " + arrayList.contains(10));
        System.out.println("Does 15 contains by arraylist? " + arrayList.contains(15));

        // Removing element by index
        arrayList.remove(1); // Remove at index 1.
        arrayList.add(1, 50); // At index 1, add 50.
        arrayList.set(2, 60); // At index 2, set value of 60.

        for (int element : arrayList) {
            System.out.print(element + " ");
        }

        ArrayList<Integer> arrayList2 = new ArrayList<>(5);
        arrayList2.add(1);
        arrayList2.add(2);
        arrayList2.add(3);
        arrayList2.add(4);
        arrayList2.add(5);
        //Now it will increase capacity by 1.5x of current capacity.
        arrayList2.add(6);

        // Removing element will not reset capacity of arraylist.
        arrayList2.remove(3);

        // This will shrink capacity of the arraylist to the size of arraylist.
        arrayList2.trimToSize();

        System.out.println();
        List<String> list1 = new ArrayList<>();
        System.out.println("List 1: " + list1.getClass().getName());

        // Arrays.asList; is nested static private class, means Its not our arraylist.
        // You can't add or remove in this type of list, but you can replace element.
        List<String> list2 = Arrays.asList("1", "2", "3", "4", "5", "6");
        System.out.println("List 2: " + list2.getClass().getName());

        String[] array1 = {"Apple", "Banana", "Orange", "Watermelon"};
        List<String> list3 = Arrays.asList(array1);
        System.out.println("List 3: " + list3.getClass().getName());

        // You can make Arrays.asList() modifiable list using following approach.
        List<String> list4 = new ArrayList<>(list3);
        list4.add("Mango");

        // .addAll()
        list4.addAll(list3);

        // It is unmodified list. You can't even modify element.
        List<String> fruits = List.of("Apple", "Banana", "Orange", "Watermelon");

        // Removing element by element - You need to pass object for removing by element, means use wrapper class.
        arrayList2.remove(Integer.valueOf(5));
        for (int element : arrayList2) {
            System.out.print(element + " ");
        }

        // Converting to array
        List<Integer> list5 = new ArrayList<>();
        list5.add(5);
        list5.add(3);
        list5.add(2);
        list5.add(1);

        Object[] array = list5.toArray();
        list5.toArray(new Integer[0]);
    }
}