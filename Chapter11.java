// Constructors in java

/*
  In java, a constructor is a block of code similar to the method.
  it is called when an instance of he class is created.At the time 
  of calling constructor,memory for the object is allocated in the
  memory.

  It is a special type of method which is used to initialize the 
  oject.

  Every time an object is created using new keyword,at least one
  constructor is called.

  It calls default constructor if there is not constructor available
  in the class.In such cases,Java compiler provides a default 
  constructor by default.

  Types of constructors :
  1. no-arg constructor (default constructor)
  2. parameterized constructor.

  NOTE : It is called constructor because it constructs the values at the 
  time of object creation.It is not necessary to write a constructor for a 
  class.It is because java compiler creates a default constructor if your
  class doesn't have any
*/

// Rules for creating constructor
/*
  1. Constructor name must be the same as its class name
  2. A constructor must have no explicit return type
  3. Constructor cannot be abstract,static,fial and synchronized
*/

// Parameterized constructor
/*
  A constructor which has a specific number of parameters is called a 
  parameterized constructor.

  Why use parameterized constructor ?
  The parameterized constructor is used to provide different values to
  distinct objects.However,you can provide the same values also.
  
*/


class Bike{

  int numberOfWheels;
  double average;
  String brand;

  Bike(){
    System.out.println("Bike is created");
  }

  void displayInfo(){
    // default value is set by default constructor
    System.out.println("number of wheels "+this.numberOfWheels);
    System.out.println("Average "+this.average);
    System.out.println("brand "+this.brand);
  }


}


class Pizza{

  int price;
  String size,title;

  // parameterized constructor
  Pizza(String title,String size,int price){
    this.title = title;
    this.size = size;
    this.price = price;
  }

  void displayInfo(){
    System.out.println("title "+this.title);
    System.out.println("size "+this.size);
    System.out.println("price "+this.price);
  }


}

// Constructor overloading
/*
  constructor overloading is a technique of having more than one 
  constructor with different parameter lists.They are arranged in a 
  way that each constructor performs a different task.They are 
  differentiated by the compiler by the number of parameters in the
  list and their types.
*/


class Student{

  int age,id;
  String name;

  Student(int id,String name){
    this.id = id;
    this.name = name;
  }

  Student(int id,int age,String name){
    this.name = name;
    this.age = age;
    this.id = id;
  }

  void showDetails(){
    System.out.println("id "+this.id);
    System.out.println("name "+this.name);
    System.out.println("age "+this.age);
  }

}



public class Chapter11{

  public static void main(String[] args){

    System.out.println("Default constructor or no-args constructor");
    Bike bike = new Bike();
    bike.displayInfo();

    System.out.println();

    System.out.println("Parameterized constructor");
    Pizza pizza = new Pizza("cheese pizza","medium",500);
    pizza.displayInfo();

    System.out.println();

    System.out.println("Constructor overloading");
    Student student1 = new Student(1,"Bob");
    Student student2 = new Student(2,2,"Jack");

    student1.showDetails();
    student2.showDetails();


  }

}
