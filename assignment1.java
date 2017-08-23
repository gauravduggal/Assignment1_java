import java.util.*;  

public class assignment1
{
  public assignment1() {
      // This constructor has one parameter, name.
     
   }
  
   public static void main(String []args) {
      
      heap h = new heap();
      h.heap_file("/home/gd/IIITD/OOPD/codes/assignment1/data.txt");
      //start from 2nd last row - i.e. atleast one node in this row has atleast one child
      h.heapify(h.length/2-1);
      h.show();     
      h.heapify(h.length/2-1-1);
      h.show();
      h.heapify(h.length/2-1-1-1);
      h.show();
      }

    
        
 
      
   
}