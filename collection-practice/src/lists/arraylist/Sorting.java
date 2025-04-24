package lists.arraylist;

import java.util.*;

public class Sorting {
    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        list1.add(5);
        list1.add(3);
        list1.add(2);
        list1.add(1);

        // Sorting
        // Method 1:
        // It takes Comparator.
        list1.sort(null); // Sorts in ascending order.
        list1.sort(new IntegerLengthComparator());
        System.out.println();
        for (int element : list1) {
            System.out.print(element + " ");
        }


        // Soring in String
        String[] array1 = {"Apple", "Banana", "Orange", "Watermelon"};
        List<String> list3 = Arrays.asList(array1);
        List<String> list2 = new ArrayList<>(list3);
        list2.add("Mango");
        list2.sort(new StringLengthComparator());
        // Or you can use lambda:
        // list4.sort((o1, o2) -> o1.length() - o2.length());

        // Method 2:
        Collections.sort(list1);

        List<Student> students = new ArrayList<>();
        students.add(new Student("Charlie", 3.5));
        students.add(new Student("Bob", 3.7));
        students.add(new Student("Alice", 3.5));
        students.add(new Student("Akshit", 3.9));

        Comparator<Student> comparator = Comparator.comparing(Student::getGpa).reversed().thenComparing(Student::getName);


        students.sort((o1, o2) -> {
            if (o2.getGpa() - o1.getGpa() > 0) {
                return 1;
            } else if (o2.getGpa() - o1.getGpa() < 0) {
                return -1;
            } else {
                return o1.getName().compareTo(o2.getName());
            }
        });
        for (Student s : students) {
            System.out.println(s.getName() + ": " + s.getGpa());
        }
        Collections.sort(students, comparator);

    }
}
