package string;

public class Comparison {
    public static void main(String[] args) {

        // Both are holding same object address due to String pool.
        String a = "Gaurav";
        String b = "Gaurav";

        // == checks if reference variable is pointing to the same object or not.
        // For primitive types == will check for values are same or not.
        System.out.println("With String pool (==): " + (a == b) + "\n");

        // It will be not stored as String pool, but will be stored in Heap freely.
        String c = new String("Gaurav");
        String d = new String("Gaurav");
        System.out.println("With new keyword (==): " + (c == d));
        // .equals() checks for values are same or not.
        System.out.println(".equals(): " + c.equals(d));
    }
}
