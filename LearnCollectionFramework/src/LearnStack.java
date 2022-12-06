import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class LearnStack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("satish");
        stack.push("manish");
        stack.push("Abhishek");


        System.out.println(stack);
        stack.push("Kiran");
        System.out.println(stack.peek());
        System.out.println(stack);





    }
}
