import java.util.*;  //For adding ArrayList
public class student
{
  //Attributes
  public String first_name;
  public String last_name;
  public ArrayList<String> subjects; 

  public student() {
      // This constructor has one parameter, name.
  	  //System.out.println("in constructor");
     // System.out.println("Passed last Name is :" + last_name );
   subjects = new ArrayList<String>();
   }
  public void m_first_name(String input)
  {
  	first_name=input;
  }
  public void m_last_name(String input)
  {
  	last_name=input;
  }
  public void m_add_subjects(String []a,int l)
  {
    for(int i=3;i<l;i++)
      subjects.add(a[i]);
  }

   
}