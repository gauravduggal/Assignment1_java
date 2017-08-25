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
  //comparess this name with s name. if "this" is lexicographically before "s" then 1 is returned else -1. 
  //0 is returned when both first name and last name are the same
  int cmp(student s)
   {
    if (s==null)
      return 0;
    String s1_fn = this.first_name.toUpperCase();
    String s1_ln = this.last_name.toUpperCase();
    
    String s2_fn = s.first_name.toUpperCase();
    String s2_ln = s.last_name.toUpperCase();
    if (s1_fn.compareTo(s2_fn)==0)
    {
      //System.out.println("same first name "+s1_fn);
      if (s1_ln.compareTo(s2_ln)==0)
        {
          //System.out.println("same last name too" + s2_ln);
          return 0;
        }
      else if (s1_ln.compareTo(s2_ln)>0)
        {
         // System.out.println("s1>s2"+s.last_name);
          //this.name before > s.name 
          return -1;
        }
      else
      {

       // System.out.println("s1<s2 "+this.last_name);
        return 1;
      
      }

    }
    else if(s1_fn.compareTo(s2_fn)>0)
      {
       // System.out.println("s2>s1");
        return -1;
      }
    else
      {
        //System.out.println("s1<s2");
        return 1;
      } 
      
   }
   
}