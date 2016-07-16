public class FiguringOutVariables
{ 
   public static void main(String[]arg)
   {
      double a = 7;
      System.out.println(a);
      a = a + 3;
      System.out.println(a);
      a = a/2;
      System.out.println(a);
      a = a/2.0;
      System.out.println(a);
      int value = 10;
      System.out.println(value);
      value = value + 2;
      System.out.println(value);
      System.out.println(value + a);
      // Value = 12 a = 2.5
      System.out.println(value % a);
      // Prints out 2.0
      System.out.println(value * a);
      a++;
      System.out.println(a);
   }
}
    