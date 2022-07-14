
// abstract class 

/*
  A class which is declared with the abstract keyword is known as
  an abstract class.It can have abstract and non abstract methods.
*/

// Abstraction
/*
  Abstraction is a process of hiding the implementation details and
  showing only functionality to the user.

  It shows only essentials things to user and hides the internal details.

  Abstraction lets you focus on what object does instead of how it 
  does it.
*/

// ways to achieve abtraction.
/*
  1. Absrtact class
  2. Interface
*/

// Abstract class
/*
  A class which is declared as abstract is known as an abstract class.It
  can have abstract and non abstract methods.It needs to be extended and its
  method implemented.It cannot be instantiated.
*/

// Points to remember
/*
  1. An abstract class must be declared with an abstract keyword.
  2. It can have abstract and non-abstract methods.
  3. It cannot be instantiated.
  4. It can have constructors and static methods also.
  5. It can have final methods which will force the subclass not to
  change the body of the metod.
*/

// Abstract metod
/*
  A method is declared as abstract and does not have implementation is
  known as an abstract method.
*/


abstract class Bike{

  Bike(){
    System.out.println("Bike created");
  }

  abstract void run();

  final void changeGear(){
    System.out.println("Bike changing gears");
  }

}

class Honda4 extends Bike{

  Honda4(){
    System.out.println("Honda created");
  }

  void run(){
    System.out.println("Honda4 running");
  }

}




public class Chapter19{

  public static void main(String[] args){

    Bike honda = new Honda4();
    honda.run();
    honda.changeGear();

  }

}


