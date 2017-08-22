import java.util.*;  //For adding ArrayList
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
   
   int get_length_heap()
   {
    return length;
   }
}