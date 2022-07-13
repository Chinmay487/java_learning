
// polymorphism
/*
  There are two types of polymorphysm : compile time polymorphysm
  and runtime polymorphism.
*/

// Runtime polymorphism
/*
  Runtime polymorphism or dynamic method dispatch is a process in which
  a call to an overriden method is resolved at runtime rather than
  compile time.

  In this process,an overriden method is called through the reference variable
  of a superclass.The determination of the method to be called is based on the 
  object being referred to by the reference variable.
*/

// Upcasting
/*
  It the reference variable of parent class refers to the object of
  child class,it is known as upcasting.
*/

// Runtime polymorphism with data member
/*
  A method is overriden,not the data members,so runtime 
  polymorphism can't be achieved by data members.
*/


class ClassParent{

  int value1 = 100;

  void method(){
    System.out.println("parent class method called");
  }


}

class ClassChild extends ClassParent{

  int value1 = 200;

  void method(){
    System.out.println("Child class method called");
  }

}


public class Chapter18{

  public static void main(String[] args){

    ClassParent parent = new ClassParent();
    ClassChild child = new ClassChild();
    ClassParent parent2 = new ClassChild();

    System.out.println("Parent class attribute "+parent.value1);
    System.out.println("Cild class attribure "+child.value1);
    System.out.println("parent2 value "+parent2.value1);

    parent.method();
    child.method();
    parent2.method();

  }

}

