// Method overloading
/*
  I a class has multiple methods having same name but different in
  parameters,it is known as method overloading.

  If we have to perform only one operation,having same name of the
  methods increases the readability of the program.

  There are 2 ways to overload method in java
  1. By changing number of arguments
  2. By changing the data type

*/

// Why method overloading not possible by changing return type
/*
  In java,method overloading is not possible by changing the return
  type of the method only because of ambiguity.
*/


class OverloadMethod{

  static void method(){
    System.out.println("No arguents passed");
  }

  static void method(int number1){
    System.out.println("One int argument passed");
  }

  static void method(int number1,double number2){
    System.out.println("one int and one double argument passed");
  }

  void method1(){
    System.out.println("Instance method with no arguments");
  }

  void method1(int number1){
    System.out.println("Instance method with one argument");
  }

  void method1(int number1,int number2){
    System.out.println("Instance method with two arguments");
  }

}

public class Chapter13{

  public static void main(String[] args){

    OverloadMethod.method();
    OverloadMethod.method(1);
    OverloadMethod.method(1,1.1);

    System.out.println();

    OverloadMethod overloadMethod = new OverloadMethod();
    overloadMethod.method1();
    overloadMethod.method1(1);
    overloadMethod.method1(1,2);


  }


}


