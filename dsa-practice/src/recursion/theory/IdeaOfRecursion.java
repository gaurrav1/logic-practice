package recursion.theory;

public class IdeaOfRecursion {

    // Here noticing thing is all function share same logic.
    // All function calls go to the stack memory.
    // While function is not finished executing, it will remain in the stack.
    // main() ~~~~~> main() is calling printNum(1)
    // main() -> printNum(1) ~~~~~> printNum(1) is calling printNum2(2)
    // main() -> printNum(1) ->  printNum2(2) ~~~~~> printNum(1) is calling printNum2(2)
    // main() -> printNum(1) ->  printNum2(2) -> printNum3(3) ~~~~~> printNum(1) is calling printNum2(2)
    // main() -> printNum(1) ->  printNum2(2) -> printNum3(3) -> printNum4(4) ~~~~~> printNum(1) is calling printNum2(2)
    // main() -> printNum(1) ->  printNum2(2) -> printNum3(3) -> printNum4(4) -> printNum5(5) ~~~~~ Executing logic
    // main() -> printNum(1) ->  printNum2(2) -> printNum3(3) -> printNum4(4) <- printNum5(5) <~~~~~ Execution of printNum5(5) fully completed returning to parent function
    // main() -> printNum(1) ->  printNum2(2) -> printNum3(3) <- printNum4(4) <~~~~~ Execution of printNum4(4) fully completed returning to parent function
    // main() -> printNum(1) ->  printNum2(2) <- printNum3(3) <~~~~~ Execution of printNum3(3) fully completed returning to parent function
    // main() -> printNum(1) <-  printNum2(2) <~~~~~ Execution of printNum2(2) fully completed returning to parent function
    // main() <- printNum(1) <~~~~~ Execution of printNum1(1) fully completed returning to parent function
    // main() <~~~~~ Execution of printNum1(1) fully completed, doing rest of the logic or else return the processed data.

    // Why to make separate function when their logic are same, just call function itself and make it return for your condition.
    public static void main(String[] args) {
        // Let say I want to print 1, 2, 3, 4, 5 number but want to call only 1 function.
        printNum(1);
    }
    static void printNum(int num) {
        System.out.println(num);
        printNum2(2);
    }
    static void printNum2(int num) {
        System.out.println(num);
        printNum3(3);
    }
    static void printNum3(int num) {
        System.out.println(num);
        printNum4(4);
    }
    static void printNum4(int num) {
        System.out.println(num);
        printNum5(5);
    }
    static void printNum5(int num) {
        System.out.println(num);
    }
}
