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

  public void update_from_file(String line)
  {
    String [] part = line.split(" ");
    this.m_first_name(part[1]);
    this.m_last_name(part[2]);
    this.m_add_subjects(part,part.length);

  } 
  public void m_first_name(String input)
  {
  	this.first_name=input;
  }
  public void m_last_name(String input)
  {
  	this.last_name=input;
  }
  public void m_add_subjects(String []a,int l)
  {
    for(int i=3;i<l;i++)
      this.subjects.add(a[i]);
  }

   
}