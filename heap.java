import java.util.*;  //For adding ArrayList
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class heap
{
  //Attributes
  public ArrayList<student> student_list; 
  public int length;
  public heap() {
      // This constructor has one parameter, name.
  	  //System.out.println("in constructor");
     // System.out.println("Passed last Name is :" + last_name );
   student_list = new ArrayList<student>();
   length = 0;
   }

  void  insert_student(student s)
   {
    length=length+1;
    this.student_list.add(s);
   }
  student  get_student(int index)
   {
    return this.student_list.get(index);
   }
   void heapify()
   {
    int cur_index=length-1;
    
   }

   student get_left_child(int i)
   {
    if ((2*i+1) < (this.length))
      return this.student_list.get(2*i+1);
    else
      return new student();
   }

   student get_right_child(int i)
   {
    if ((2*i+2) < (this.length))
      return this.student_list.get(2*i+2);
    else
      return new student();
   }

   student get_parent(int i)
   {
    // System.out.println((i-1)/2);
    if (i%2==0 && ((i-2)/2>=0)&& i<length)
      return this.student_list.get((i-2)/2);
    else if(i%2==1 && ((i-1)/2>=0) && i<length)
      return this.student_list.get((i-1)/2);  
    else
      return new student();
   }

   void heap_file(String fileName)
   {
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
          this.insert_student(s1);
          //heapify nlogn times
          break;
          case "MAXIMUM":
          break;
          case "EXTRACT-MAX":
          break;
          case "DELETE":
          break;
          case "SHOW":
          System.out.println("Current List");
          for(int i=0;i<this.length;i++)
          {
            s1=this.student_list.get(i);
            System.out.println((i)+". "+s1.first_name+" "+s1.last_name);
          }
          System.out.println();
          break;
                   
          default:
          System.out.println("error");
          break;
        }
        
        }
      }

        catch (IOException e)
         {
          e.printStackTrace();
          }

      
   }

   int get_length_heap()
   {
    return length;
   }
}