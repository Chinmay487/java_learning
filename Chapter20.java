
// Interface
/*
  An interface is a blueprint of a class.It has static constants and
  abstract methods.

  The interface is a mechanism to achieve abstraction.There can e only
  abstract methods in the interface,not method body.It is used to 
  achieve abstraction in multiple inheritance.

  In other words,you can say that interfaces can have abstract methods 
  and variables.It cannot have a method body.

  Interfaces cannot be instantiated like abstract class.

  we can have default and static methods in an interface

  We can have private methods in an interface.
*/

// Why use interface
/*
  1. It is used to achieve abstraction
  2. By interface,we can support the functionality of multiple
  inheritance.
  3. It can be used to achieve loose coupling.
*/

/*
  Interface can have default and static methods.
*/ 

interface Drawable{

  void draw();

  static int cube(int x){
    return x*x*x;
  }

}

class Rectangle implements Drawable{

  public void draw(){
    System.out.println("drawing rectangle");
  }

}

class Circle implements Drawable{

  public void draw(){
    System.out.println("drawing circle");
  }

}


public class Chapter20{

  public static void main(String[] args){

    Drawable shape;
    shape = new Rectangle();
    shape.draw();
    shape = new Circle();
    shape.draw();

    System.out.println("calling static method from interface");
    System.out.println(Drawable.cube(2));
  }

}
