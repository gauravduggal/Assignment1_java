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
    if (index==-1)
      return new student();
    else
    return this.student_list.get(index);
   }
   void heapify_every_level()
   {
    if(this.length>=3)
    {
    for(int i=this.length/2-1;i>=0;i--)
      heapify(i);
    }
   }
   int heapify(int i)
   {
    if (i>=length && i>0)
      {
        return 1;
      }
    int left_child_index = get_left_child(i);
    int right_child_index = get_right_child(i);
    int lexical_first = i;
    
    //if root node then both left and right child will be -1
      if(right_child_index==-1 && left_child_index == -1)
        return 1;
      if(compare_heap_indexes(left_child_index,lexical_first)>=0)
      {
        lexical_first = left_child_index; 
      }
      if(compare_heap_indexes(right_child_index,lexical_first)>=0)
      {
        lexical_first = right_child_index; 
      }

      if(lexical_first != i)
      {
        swap(i,lexical_first);
        heapify(lexical_first);
      }
    return 0;
   }

   //if student i comes before student j then return 1 else return -1
   int compare_heap_indexes(int i, int j)
   {
    if (get_student(i).cmp(get_student(j)) >= 0)
    {
      return 1;
    }
    else
      return -1;
   }

  int swap(int i, int j)
  {
    //swapping not required
    if (i== -1 | j== -1)
      return 1;
    student temp = get_student(i);
    student_list.set(i,get_student(j));
    student_list.set(j,temp);
    return 1;
  }
   
   int get_left_child(int i)
   {
    if ((2*i+1) < (this.length))
      //return this.student_list.get(2*i+1);
      return (2*i+1);
    else
      return -1;
   }


   int get_right_child(int i)
   {
    if ((2*i+2) < (this.length))
      //return this.student_list.get(2*i+2);
      return (2*i+2);
    else
      return -1;
   }

   int get_parent(int i)
   {
    // System.out.println((i-1)/2);
    if (i%2==0 && ((i-2)/2>=0)&& i<length)
      //return this.student_list.get((i-2)/2);
      return ((i-2)/2);
    else if(i%2==1 && ((i-1)/2>=0) && i<length)
      //return this.student_list.get((i-1)/2); 
      return  ((i-1)/2);
    else
      //return new student();
      return -1;
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
          //heapify
         // heapify_every_level();
          break;
          case "MAXIMUM":
          //System.out.println(this.student_list.get(0).first_name+" "+this.student_list.get(0).last_name);
          break;
          case "EXTRACT-MAX":
          break;
          case "DELETE":
          break;
          case "SHOW":
          this.show();
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
   void show()
   {
    student s1;
    System.out.println("Current List");
          for(int i=0;i<this.length;i++)
          {
            s1=this.student_list.get(i);
            System.out.println((i)+". "+s1.first_name+" "+s1.last_name);
          }
          System.out.println();
          
   }
   int get_length_heap()
   {
    return length;
   }
}