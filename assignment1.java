import java.util.*;  

public class assignment1
{
  public assignment1() {
      // This constructor has one parameter, name.
     
   }
  
   public static void main(String []args) {
      
      heap h = new heap();
      h.heap_file("/home/gd/IIITD/OOPD/codes/assignment1/data.txt");
      h.heapify_every_level();
      h.show();
      }

    
        
 
      
   
}