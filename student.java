public class student
{
  public String first_name;
  public String last_name;
  public String []subjects; 
  public student() {
      // This constructor has one parameter, name.
  	  //System.out.println("in constructor");
     // System.out.println("Passed last Name is :" + last_name );
   }
  public void m_first_name(String input)
  {
  	first_name=input;
  }
  public void m_last_name(String input)
  {
  	last_name=input;
  }
   
}