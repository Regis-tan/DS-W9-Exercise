package Session_9;
import java.util.*;

public class Palindrome {
    private static Deque<Character> fillStack(String inputString){
        Deque<Character> charStack = new ArrayDeque<Character>();
        Stack<String> stack = new Stack<String>();
        
        for (int i = 0; i < inputString.length(); i++){
            charStack.push(inputString.charAt(i));
        }

        return charStack;
    }

    private String buildReverse (String inputString) {
        Deque<Character> charStack = fillStack(inputString);
        StringBuilder result = new StringBuilder();
        while (!charStack.isEmpty()) {
            result.append(charStack.pop());
        }
        return result.toString();
    }

    public boolean isPalidrome(String inputString){
        String reverseInput = buildReverse(inputString);
        
        return reverseInput.equals(inputString);
    }
}
