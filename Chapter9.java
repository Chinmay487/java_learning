

// Terms used in inheritance
/*
  1. class : A class is group of obejcts which have common properties.
  It is template or blueprint from which objects are created.

  2. Sub class/Child class : Subclass is a class which inherits the other
  class.It is also called as derieved class,extended class or child class.

  3. Super class/Parent class : Superclass is a class from where a subclass
  inherits the features.It is also called a base class or parent class.

  4. Resuablity : As the name specifies,resusabitily is a mechamisn which 
  facilitates you to reuse the fields and methods of the existing class when
  you create a new class.You can use the same fields and methods already 
  defined in the previous class.
*/

/*
  class subClassName extends superClassName{
    // methods and fields.
  }

  The extends keyword indicates that you are making a new class that derieves
  from an existing class.

*/

// Types of inheritance in java
/*
 1. Single Inheritance
 2. Multilevel Inheritance
 3. Heirarchical Inheritance
 4. Multiple Inheritance
 5. Hybrid Inheritance

  NOTE : multiple inheritance is not supported in java

*/

/*
  Why multiple inheritance is not supported in java

  To reduce complexity and simplify the language,multiple inheritance is not
  supported in java

  Consider a scenario where A,B and C are three class.The class C inherits class
  A and B.If A and B classes have the same method and we call it from child class
  object,there will be ambiguity to call the method of A or B class.

  Since compile-time errors are better than runtime errors,Java renders compile time
  error if you inherit 2 classes.So whethere you have same method or 
  different ,there will be compile time error.

*/


class Animal{
  void eat(){
    System.out.println("Eating...");
  }
}


// Single inheritance
class Dog extends Animal{
  void bark(){
    System.out.println("Barking...");
  }
}

// Multilevel inheritance
class Fish extends Animal{
  void swim(){
    System.out.println("Swimming...");
  }
}

class Shark extends Fish{
  void hunt(){
    System.out.println("Shark is hunting");
  }
}


// Heirarchical inhertance

class Cat extends Animal{
  void jump(){
    System.out.println("Cat jumping");
  }
}

class Lion extends Animal{
  void roar(){
    System.out.println("lion Roar..");
  }
}


public class Chapter9{

  public static void main(String[] args){
    System.out.println("Single Inheritance");
    Dog dog = new Dog();
    dog.bark();
    dog.eat();

    System.out.println("\nMultiple Inheritance");
    Shark shark = new Shark();
    shark.hunt();
    shark.swim();
    shark.eat();

    System.out.println("\nHeirarchical Inheritance");
    Cat cat = new Cat();
    Lion lion = new Lion();
    cat.jump();
    cat.eat();
    lion.roar();
    lion.eat();


  }

}

