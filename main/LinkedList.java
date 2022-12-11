// Import the LinkedList class
import java.util.LinkedList;
public class Act_1 {   
    public static void main(String[] args) {
        //1. Create a java queue named "student"
        LinkedList<String> student = new LinkedList<String>();
        
        //2. Store string Andrew, Gina and Ben
        String names[] = {"Andrew", "Gina", "Ben"};
        for(int i = 0; i < names.length; i++) student.add(names[i]);
        
        //Display queue
        System.out.println("Queue: " + student);
       
        //3. Search the String "Gina" from the queue
        System.out.println("\nQueue has a String \"Gina\"?: " + student.contains("Gina"));
        
        //Remove the String "Ben" from the queue
        //Display queue
        System.out.println("\nQueue: " + student);
        
        student.remove(student.size() - 1);
        //Display queue
        System.out.println("\nUpdated Queue: " + student);
        
       
    }
    
}
