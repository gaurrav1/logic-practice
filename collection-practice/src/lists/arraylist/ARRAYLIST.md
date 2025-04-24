#  ArrayList
> 📖 [Official JavaDocs for ArrayList (Java 21)](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/ArrayList.html)


```java
public class ArrayList<E>
extends AbstractList<E>
implements List<E>, RandomAccess, Cloneable, Serializable
```
1. Resizable-array implementation of the List interface. Implements all optional list operations, and permits all elements, including null. In addition to implementing the List interface, this class provides methods to manipulate the size of the array that is used internally to store the list. (This class is roughly equivalent to Vector, except that it is unsynchronized.)
The size, isEmpty, get, set, iterator, and listIterator operations run in constant time. The add operation runs in amortized constant time, that is, adding n elements requires O(n) time. All of the other operations run in linear time (roughly speaking). The constant factor is low compared to that for the LinkedList implementation.

2. Each ArrayList instance has a capacity. The capacity is the size of the array used to store the elements in the list. It is always at least as large as the list size. As elements are added to an ArrayList, its capacity grows automatically. The details of the growth policy are not specified beyond the fact that adding an element has constant amortized time cost.

3. An application can increase the capacity of an ArrayList instance before adding a large number of elements using the ensureCapacity operation. This may reduce the amount of incremental reallocation.

4. Note that this implementation is not synchronized. If multiple threads access an ArrayList instance concurrently, and at least one of the threads modifies the list structurally, it must be synchronized externally. (A structural modification is any operation that adds or deletes one or more elements, or explicitly resizes the backing array; merely setting the value of an element is not a structural modification.) This is typically accomplished by synchronizing on some object that naturally encapsulates the list. If no such object exists, the list should be "wrapped" using the Collections.synchronizedList method. This is best done at creation time, to prevent accidental unsynchronized access to the list:

5. ```java
   List list = Collections.synchronizedList(new ArrayList(...));
   ```
   The iterators returned by this class's iterator and listIterator methods are fail-fast: if the list is structurally modified at any time after the iterator is created, in any way except through the iterator's own remove or add methods, the iterator will throw a ConcurrentModificationException. Thus, in the face of concurrent modification, the iterator fails quickly and cleanly, rather than risking arbitrary, non-deterministic behavior at an undetermined time in the future.

6. Note that the fail-fast behavior of an iterator cannot be guaranteed as it is, generally speaking, impossible to make any hard guarantees in the presence of unsynchronized concurrent modification. Fail-fast iterators throw ConcurrentModificationException on a best-effort basis. Therefore, it would be wrong to write a program that depended on this exception for its correctness: the fail-fast behavior of iterators should be used only to detect bugs.

---

## Basic Operations (from `Main.java`)

### Creation and Initialization
```java
ArrayList<Integer> arrayList = new ArrayList<>();
ArrayList<Integer> withCapacity = new ArrayList<>(1000);
```


### Add, Access, Modify
```java
arrayList.add(10);        // Add
arrayList.get(0);         // Access
arrayList.set(0, 20);     // Modify
arrayList.remove(0);      // Remove by index
```

### Check Containment
```java
arrayList.contains(10);   // true or false
```


### Iteration
```java
for (int element : arrayList) {
    System.out.print(element + " ");
}
```

### Trim Capacity
```java 
arrayList.trimToSize(); // Reduces capacity to size
```

---

## Advanced Initialization

### Arrays.asList - Fixed-size list
```java
List<String> list = Arrays.asList("A", "B", "C"); // Not modifiable 
```

### Convert to Modifiable
```java 
List<String> modifiable = new ArrayList<>(list);
```

### Immutable List
```java 
List<String> immutable = List.of("A", "B", "C");
```

---

## Conversion
```java
Object[] arr = arrayList.toArray(); // Returns Object[]
Integer[] arr2 = arrayList.toArray(new Integer[0]); // Returns Integer[]
```

---

## Sorting (from `Sorting.java`)

### Simple List Sorting
```java
Collections.sort(list); // Ascending
list.sort(Collections.reverseOrder()); // Descending
```

### Custom Integer Comparator
```java
class IntegerLengthComparator implements Comparator<Integer> {
    public int compare(Integer o1, Integer o2) {
        return o2 - o1; // Descending
    }
}
```

### Custom String Length Comparator
```java
class StringLengthComparator implements Comparator<String> {
    public int compare(String o1, String o2) {
        return o2.length() - o1.length(); // Descending
    }
}
```

---

## Sorting Custom Objects (from `Student.java`)

### Student Class Overview
```java
class Student implements Comparable<Student> {
    String name;
    double gpa;

    // compareTo (by GPA descending)
    public int compareTo(Student o) {
        return Double.compare(o.gpa, this.gpa);
    }
}
```


### Comparator for Complex Sorting
```java
Comparator<Student> comparator = Comparator
.comparing(Student::getGpa).reversed()
.thenComparing(Student::getName);

Collections.sort(students, comparator);
```

---
