
// Encapsulation 
/*
  Encapsulation is a process of wrapping code and data together
  into a single unit.

  We can create a fully encapsulated class in java by making all 
  the data members of class private.Now we can use setter and getter
  methods to set and get the data in it.
*/

// Advantages
/*
  By providing only a setter or getter method,we can make a class 
  read-only or write-only.

  It provides control over the data.

  It is a way to achieve data hiding beacause other class will not be
  able to access the data through the private data member.
*/


class Demo{

  private int value1,value2;

  int getValue1(){
    return this.value1;
  }

  int getValue2(){
    return this.value2;
  }

  void setValue1(int value){
    this.value1 = value;
  }

  void setValue2(int value){
    this.value2 = value;
  }

}

// instanceof operator
/*
  The instanceof operator is used to test whether the object is an 
  instance of specified type (class or subclass or interface)

  Also known as type comparison operator because it compares the 
  instance with type.It returns either true or false.If we apply
  instanceof operator with any variable that has null value,it
  returns false.

  if we apply instance of operator with variable that have null value
  it returns false.

*/


public class Chapter21{

  public static void main(String[] args){

    System.out.println("Encapsulation");
    Demo demo = new Demo();
    demo.setValue1(10);
    demo.setValue2(11);
    System.out.println("value1 : "+demo.getValue1());
    System.out.println("value2 : "+demo.getValue2());

    System.out.println();

    System.out.println("instanceof operator");
    Demo demo2 = null;
    System.out.println("demo instanceof Demo "+(demo instanceof Demo));
    System.out.println("value of demo2 "+demo2);
    System.out.println("demo2 instanceof DemoTest "+(demo2 instanceof Demo));


  }

}

