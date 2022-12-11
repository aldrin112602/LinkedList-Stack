import java.util.Stack;

class Act_2 {
    public static void main(String[] args) {
        Stack<String> Money = new Stack<>();
        // Add element "Peso" to Stack
        Money.push("Peso");
        // Display the size of stack
        System.out.println("Stack size: " + Money.size());
        // Search the string "Peso" from stack
        // Search an element
        int i = Money.search("Peso");
        System.out.println("Has a \"Peso\" from stack?: " + (i != 0));
         //Pop the String "Peso" from stack
        Money.pop();
        System.out.println(Money);
    }
}
