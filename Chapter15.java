// super keyword

/*
  The super keyword in java is a reference variable which is used
  to refer immediate parent class object.

  Whenever you create the instance of subclass,an instance of parent
  class is created implicitly which is reffered by super reference
  variable.
*/

// Usage
/*
  1. Super can be used to refer immediate parent class instance 
  variable
  2. super can be used to invoke immediate parent class method.
  3. super() can be used to invoke immediate parent class
  constructor.
*/

class ParentClass{

  int value1;

  ParentClass(int value){
    System.out.println("Parent class constructor");
    this.value1 = value;
  }

  void parentClassMethod(){
    System.out.println("called parent class method");
  }

}

class ChildClass extends ParentClass{

  int value2;

  ChildClass(int value1,int value2){
    super(value1);
    this.value2 = value2;
    System.out.println("called parent class constructor");
    System.out.println("Child class constructor");
  }

  void childClassMethod(){
    System.out.println("Child class method called");
    super.parentClassMethod();
    System.out.println("parent class attribute "+super.value1);
    System.out.println("Child class attribute "+this.value2);
  }

}


public class Chapter15{

  public static void main(String[] args){

    System.out.println("Parent class");
    ParentClass parent = new ParentClass(10);
    parent.parentClassMethod();
    System.out.println("parent class attriute "+parent.value1);

    System.out.println();

    System.out.println("Child class");
    ChildClass child = new ChildClass(10,20);
    child.childClassMethod();
    System.out.println("Child class attributes");
    System.out.println(child.value1 + " " + child.value2);
  
  }

}

