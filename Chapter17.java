
// Final keyword 
/*
  The final keyword is used to restrict the user.The final keyword
  can be used in many context.

  final can be : 
  1. Variable
  2. method
  3. class

  The final keyword can be applied with the variable,a final variable
  that have no value it is called blank final variable or unintialized
  final variable.It can be initialized in constructor only.The blank 
  final variable can be static also which will be initialized in th static
  block only.We will have details learning of these.
*/

/*
  NOTE : final variable only can be initialized in constructor only.
*/

// What is blank or uninitialized final variable?
/*
  A final variable that is not initialized at the time of declaration is
  known as blank final variable.

  If you want to create a variable that is initialized at the time of 
  creating object and once initialized may not be changed.
*/

// static blank final variable
/*
  A static final variable that is not initialized at the time of 
  declaration is known as static blank final variable.It can be 
  initialized only in static block.
*/

// What is final parameter ?
/*
  If you declare any parameter as final,you cannot change the value
  of it.
*/

/*
  NOTE : We cannot declare constructor final
*/

/*
  NOTE : if we make class final,we cannot extend it.
*/

/*
  NOTE : if we make method final,we cannot override it.
*/

final class Bike{

  static final int value1;

  static{
    // initializing static final variable.
    value1=100;
  }

  final int value2;

  Bike(int value2){
    // initializing fianal instance variable
    this.value2 = value2; 
  }

  final void method(){
    System.out.println("method called");
  }


}


public class Chapter17{

  public static void main(String[] args){

    Bike bike = new Bike(3);

    System.out.println("Static variable "+Bike.value1);
    System.out.println("final instance variable "+bike.value2);
    System.out.println("calling final method");
    bike.method();

  }

}

