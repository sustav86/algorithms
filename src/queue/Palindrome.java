package queue;

import java.util.LinkedList;

public class Palindrome {

    public static void main(String[] args) {
        String str = "abccba";
        System.out.println(checkForPalindrome(str));
    }

    public static boolean checkForPalindrome(String str) {

        LinkedList<Character> stack = new LinkedList<>();
        LinkedList<Character> queue = new LinkedList<>();

        String lowerCase = str.toLowerCase();

        for (int i = 0; i < lowerCase.length(); i++) {
            char c = lowerCase.charAt(i);
            if (c >= 'a' && c <= 'z') {
                queue.addLast(c);
                stack.push(c);
            }
        }

        while (!stack.isEmpty() ) {
            if (!stack.pop().equals(queue.removeFirst())) return false;
        }
        return true;
    }
}
