// this keyword
/*
  In java this is a referece variable that refers to the current
  object.
*/

// Usage 
/*
  1. Can be used to refer current class instance variable
  2. can be used to invoke current class method.
  3. this() can be used to invoke current class constructor
  4. this can be passed as an argument in the method call
  5. this can be passed as an argument in the constructor call
  6. This can be used to return current class instance from the
  method.
*/


// Static keyword.
/*
  The static keywor is used for memory management mainly.We can
  apply static keyword with variables,mehtods blocks and nested 
  classes.The static keyword belongs to the class than an instance
  of the class.
*/


// static variable
/*
  1. The static variable can be used to refer to the common property
  of all objects (which is not unique).
  2. The static variable gets memory only once in the class area at
  the time of class loading.

  Advantage : It makes program more memory efficient.
*/

// static method
/*
  1. A static method belongs to the clas rather than the object of a
  class.
  2. A static method can be invoked without the need for creating an 
  instance of a class.
  3. A static method can access static data member and can change the 
  value of it.
*/

// Restrictions of static method
/*
  1. The static method can not use non static data member or
  call non-static method directly
  2. This and super cannot be used in static context
*/


class Human{

  double height,weight;
  String name,gender;

  static String livingOn = "earth";

  static void sleepAtNight(){
    System.out.println("Sleepig at night");
  }
  
  Human(){
    System.out.println("Human created");
  }

  Human(double height,double weight,String name,String gender){
    this();
    this.name = name;
    this.gender = gender;
    this.height = height;
    this.weight = weight;
  }

  void walk(){
    System.out.println("walking");
  }

  void eat(){
    System.out.println("eating");
  }

  void talk(){
    System.out.println("talking");
  }

  void walkAndTalk(){
    this.walk();
    this.talk();
  }

  Human getInfo(){
    return this;
  }

  void showInfo(){    
    System.out.println("name "+this.name);
    System.out.println("gender "+this.gender);
    System.out.println("height "+this.height);
    System.out.println("weight "+this.weight);
  }

}


public class Chapter12{

  public static void main(String[] args){

    Human human = new Human(5.5,70,"bob","male");
    human.walk();
    human.talk();
    human.eat();
    human.walkAndTalk();
    
    System.out.println();

    Human human1 = human.getInfo();
    // human1.walk();
    human1.showInfo();

    System.out.println();

    Human.sleepAtNight();
    System.out.println("Lives on "+ Human.livingOn);

  }

}