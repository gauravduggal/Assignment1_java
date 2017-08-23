import java.util.*;  

public class assignment1
{
  public assignment1() {
      // This constructor has one parameter, name.
     
   }
  
   public static void main(String []args) {
      if(args.length!=1)
      {
         System.out.println("usage \"assignment1 data.txt\"");
         System.exit(0);
      }
      heap h = new heap();
      h.heap_file(args[0]);
     // h.heapify_every_level();
     // h.show();
      }

    
        
 
      
   
}