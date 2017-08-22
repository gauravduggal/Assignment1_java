import java.util.*;  

public class assignment1
{
  static ArrayList<student> student_list = new ArrayList<student>();
  public assignment1() {
      // This constructor has one parameter, name.
     
   }
  
   public static void main(String []args) {
      if(args.length==0)
      {
        System.out.println("usage is: java assignment1 firstname lastname");
        System.exit(0);
        //constructor doesn't have a return type
        //constructor has same name as class name
      }

      student s1 = new student();
        s1.m_first_name(args[1]);
        switch(args[0])
        {
          case "INSERT":
          s1.m_first_name(args[1]);
          s1.m_last_name(args[2]);
          s1.m_add_subjects(args,args.length);

          //insert at the last node
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
      student_list.add(s1);
      System.out.print(s1.first_name+" ");
      System.out.println(s1.last_name);
      System.out.println(s1.subjects);
   }
}