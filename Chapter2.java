
class One{
  static int number1 = 1; // static variable
  int number3; // instance variable

  One(int number){
    this.number3 = number;
  }

  int method(){
    int number2 = 2; // local variable
    return number2;
  }
}

public class Chapter2{

  public static void main(String[] args){

      // Variables in java
      /*

        A variable is the name of a reserved area allocated in memory.In other words,
        it is a name of the memory location.

      */

      // Types of variables
      /*

        1. Local variables
        2. Instance variables
        3. static variables

      */

      // Local variables
      /*
       
        A variable declared inside the body of the method is called local variable.
        You can use this variable only within that method and the other methods in
        the class aren't even that the variable exists.
        A local variable cannot be defined with static keyword.

      */

      // Instance variable
      /*
        
        A variable declared inside the class but outside the body of the
        method is called an instance variable.It is not declared as static.
        It is called an instance variable because its value is instance
        specific and is not shared among instances.

      */

      // Static variable
      /*
       
        A variable that is declared as static is called a static variable.It
        cannot be local.You cna create a single copy of the static variable
        and share it among all the instances of the class.Memory allocation for 
        static variable happens only once when the class is loaded in the memory.
      */

      One one = new One(3);
      System.out.println("Static variable : "+One.number1);
      System.out.println("Instance variable : "+one.number3);
      System.out.println("Local variable : "+one.method());


      // Widening
      int number1 = 10;
      float number2 = number1;
      System.out.println("Integer : " + number1 + " float : " + number2);

      // Narrowing (typecasting)

      float number3 = 1.22f;
      int number4 = (int)number3;

      System.out.println("Float : "+number3+" Integer : "+number4);

  }

}