import java.util.*;  
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class assignment1
{
  public assignment1() {
      // This constructor has one parameter, name.
     
   }
  
   public static void main(String []args) {
      
      heap h = new heap();
      String fileName = "/home/gd/IIITD/OOPD/codes/assignment1/data.txt";
      try (Scanner scanner = new Scanner(new File(fileName))) {

      while (scanner.hasNext()){
        String line = scanner.nextLine();
        //System.out.println(line);
        String [] part = line.split(" ");
        student s1 = new student();
        switch(part[0])
        {
          case "INSERT":
          s1.update_from_file(line);
          //insert at the last node
          h.insert_student(s1);
          //heapify nlogn times
          break;
          case "MAXIMUM":
          break;
          case "EXTRACT-MAX":
          break;
          case "DELETE":
          break;
          case "SHOW":
          break;
                   
          default:
          System.out.println("error");
          break;
        }
        
       System.out.println(h.get_length_heap());
      
      }

    } catch (IOException e) {
      e.printStackTrace();
    }

        
      //System.out.println(h.get_student(0).first_name);
      
   }
}