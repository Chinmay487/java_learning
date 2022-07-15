import java.util.*;
// import java.io.*;


public class Chapter24{

  public static void main(String[] args){

    // input using scanner class

    Scanner sc = new Scanner(System.in);

    System.out.println("Taking different inputs using scanner class");

    System.out.println();

    System.out.print("enter string : ");
    String stringValue1 = sc.nextLine();

    // System.out.println();

    System.out.print("Enter integer number : ");
    int integerNumber1 = sc.nextInt();

    // System.out.println();

    System.out.print("Enter long number : ");
    long longNumber1 = sc.nextLong();

    // System.out.println();

    System.out.print("Enter float number : ");
    float floatNumber1 = sc.nextFloat();

    // System.out.println();

    System.out.print("Enter double number : ");
    double doubleNumber1 = sc.nextDouble();

    // System.out.println();

    System.out.print("Enter boolean value :");
    boolean booleanValue1 = sc.nextBoolean();

    sc.close();
    // close is for resource leak warning for scanner class

    System.out.println();
  

    System.out.println("Inputs using scanner class are :");
    System.out.println("integerNumber1 : "+integerNumber1);
    System.out.println("longNumber1 : "+longNumber1);
    System.out.println("floatNumber1 : "+floatNumber1);
    System.out.println("doubleNumber1 : "+doubleNumber1);
    System.out.println("booleanValue1 : "+booleanValue1);
    System.out.println("stringValue1 : "+stringValue1);

    System.out.println();

    // System.out.println("Taking inputs using buffered reader");

    // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // System.out.print("Enter String : ");
    // String stringValue2 = br.readLine();

  }

}