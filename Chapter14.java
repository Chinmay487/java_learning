
// method overriding 
/*
  If subclass has the same method as declared in the parent class
  it is known as method overriding.

  If subclass provides the specific implementation of the method that
  has been declared by one of its parent class,it is known as method
  overriding.
*/

// usage
/*

  1. Method overriding is used to provide the specific implementation of a
  method which is already provided by its superclass
  2. Method overriding is used for runtime polymorphism.

*/

// Rules
/*
  1. The method must have the same name as in the parent class.
  2. The method must have the same parameter as in the parent class.
  3. There must be an IS-A relationship (inhiritance).
*/

// Why we can't override static method?
/*
  It is because the static method is bound with class where as instance
  method is bound with an onject.Static belong to class area and instance
  belongs to the heap area.
*/


class One{

  void sayHello(String name){
    System.out.println("Hello "+name+" from One");
  }

}

class Two extends One {
  
  // overridig sayHello method of parent class
  @Override
  void sayHello(String name){
    System.out.println("Hello "+name+" from Two");
  }

}

// Covariant return type
/*
  The convariant return type specifies that the return type may
  vary in the same direction as the subclass.
  
  Before java5,it was not possible to override any method by 
  changing the return type.But now since java5,it is possible 
  to override method by changing the return type if subclass 
  overrides any method whose return type is non-primitive but it
  changes its return type to subclass type.
*/

// Advantages of covariant return type
/*
  1. Convariant return type assists to stay away from the confusing
  type casts in the class heirarchy and makes the code more usable,
  readable and maintainable
  
  2. In the method overriding,the covariant return type provides the 
  liberty to have more to point return type.
  
  3. covariant return type helps in preventing the run-time 
  ClassCastExceptions on returns.
*/

class Three{

  Three get(){
    return this;
  }

  void showMessage(){
    System.out.println("Message from Three");
  }

}

class Four extends Three{

  @Override
  Four get(){
    return this;
  }

  @Override
  void showMessage(){
    System.out.println("Message from Four");
  }

}

class Five extends Four{
  
  @Override
  Five get(){
    return this;
  }

  @Override
  void showMessage(){
    System.out.println("Message from Five");
  }

}


public class Chapter14{

  static public void main(String args[]){

    System.out.println("Method overriding");
    One one = new One();
    Two two = new Two();
    one.sayHello("Bob");
    two.sayHello("Jack");

    System.out.println();

    System.out.println("Convariant return type");      
    new Three().get().showMessage();
    new Four().get().showMessage();
    new Five().get().showMessage();

    /*
  EXPLAINATION : 
    in above code no typecasting is needed as the return type is
    specific.Hence there is no confusion about knowing the type
    of object getting returnsed from the method get().Also even if
    we write cose for 10-15 classes,there would be no confusion 
    regarding the return types of the methods.All this is possible
    because of covariant return type.  
*/

  }

}

