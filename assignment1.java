public class assignment1
{
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
      
      
        switch(args[0])
        {
          case "INSERT":
          s1.m_first_name(args[1]);
          s1.m_last_name(args[2]);
          break;

          default:
          System.out.println("error");
          break;
        }
      
      System.out.print(s1.first_name+" ");
      System.out.println(s1.last_name);
      
   }
}