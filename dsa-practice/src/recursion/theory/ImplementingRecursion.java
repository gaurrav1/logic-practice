package recursion.theory;

public class ImplementingRecursion {
    public static void main(String[] args) {
        printNum(1);
    }
    public static void printNum(int num) {
        System.out.println(num);
        if (num == 5) {
            return;
        }
        // Fallback condition to return on parent function chain, breaking the recursively calling the function.
        // If base condition is not provided to exit the recursion, then StackOverflow exception will be thrown.
        // Not that Why StackOverflowError will be thrown instead of OutOfMemoryError (Heap memory full) because Stack memory are smaller in size to take too many recursive call of function depends on JVM settings.
        printNum(num + 1);
        // It is tail recursion.
    }
    /*
        Why Recursion?
        - It helps us in solving bigger/ complex problems in a simple wey.
        - You can convert recursion solution into iteration & vice versa.
        - Space complexity is not constant because of recursive calls.
    */
}

// 1. Identify if you can break down the problem with smaller problem.
// 2. Write the recurrence relation if needed.
// 3. Draw the recursion tree.
// 4. About the tree:
//    i. See the flow of function, how they are getting in the stack.
//    ii. Identify & focus on left tree calls and right tree calls. -> All extra recursive call from 1 function.
//    iii. Draw the tree and pointer again and again using pen & paper, use the debugger to see the flow.
// 5. See how the values & what types of values are returned at each step. See where the function call is coming out of. In the end you will come out of the main function.
// 6. Subscribed to Kunal channellll!!!

// Key area to be focused on for recursion
// 1. Nature of recursion.
// 2. Variety of variable used in recursion program.
//      i.   Argument, - Requires parent call reference.
//      ii.  Return type, - Type of question.
//      iii. Body of the function) - Specific to particular call.

//  Types of recurrence relations:
// 1. Linear (Ex. Fibonacci)
// 2. Divide & Conquer (Ex. Binary Search)