
// Instance initializer block
/*
  Instance initializer block is used to initialize the instance data
  member.It run each time when object of the class is created.The 
  initialization of the instance variable can be done directly by there
  can be performed extra operations while initializing the instance variable
  in the instance initializer block.
*/

// Rules for instance initializer block
/*
  1. The instance initializer block is created when instance of 
  class is created.
  2. The instance initializer block is invoked after the parent 
  class constructor is invoked.
  3. The instance initializer block comes in the order which they
  appear.
*/

class ClassOne{

  int value1;

  ClassOne(){
    System.out.println("Class one constructor called");
  }

  {
    System.out.println("Instance initializer block called");
    this.value1 = 100;
  }

}

public class Chapter16{

  public static void main(String[] args){

    ClassOne one = new ClassOne();
    System.out.println("value "+one.value1);

  }

}

