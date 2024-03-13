package Session_9;
public class Main {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        Palindrome palindrome_finder = new Palindrome();

        stack.push("A");
        stack.push("B");
        stack.push("C");
        System.out.println(stack.toString());
        
        System.out.println(palindrome_finder.isPalidrome("RACECAR"));
    }
}

