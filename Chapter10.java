// Aggregation in java
/*
  If a class have an entitfy reference,it is known as Aggregation.
  Aggregation represents HAS-A relationship.
*/

// Why ise aggregation?
/*
  1. Code reuse is also best achieved by aggrigation when there is
  no is-a relationship
  2. Inheritace should only used id the relationship is is-a is 
  maintained throughout the lifetime of the object involved.Otherwise
  aggregation is the best choice.
*/

class Address{
  String city,state,country;

  Address(String city,String state,String country){
    this.city = city;
    this.state = state;
    this.country = country;
  }

}

class Employee{

  int id;
  String name;
  Address address;

  Employee(int id,String name,Address address){
    this.id = id;
    this.name = name;
    this.address = address;
  }

  void display(){

    System.out.println(this.id + " " + this.name );
    System.out.println("City : "+this.address.city);
    System.out.println("State : "+this.address.state);
    System.out.println("Country : "+this.address.country);

  }

}

/*
  In this example,Employee has an object of address,address object 
  contains its own informations suct as city,state,country,etc.In 
  such case relationship is Employee HAS-A address.
*/


public class Chapter10{

  public static void main(String[] args){

    Address address1 = new Address("Mumbai","Maharashatra","India");
    Employee employee1 = new Employee(1, "Bob", address1);

    Address address2 = new Address("Delhi","Delhi","India");
    Employee employee2 = new Employee(2, "jack", address2);

    employee1.display();
    System.out.println();
    employee2.display();

  }

}