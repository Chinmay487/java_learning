public class Chapter7{

  public static void main(String[] args){

    // Methods 
    /*
     A method is a block of code or collection of statements or set of
     code grouped together to perform a certain task or operation.It is 
     used to achieve the reusability of code.We write method once and use
     it many times.We do not require to write code again and again.It also
     provides easy modification of code,just by adding or removing a chunk 
     of code.The method is executed only when we call or invoke it.
    */
    /*
     
      Access-specifier return-type method-name (parameter-list){
         method body
      }

      1.Method Signature : Every method has a method signature.It is a part of the
      method declaration.It includes the method name and parameter name.

      2.Access Specifier : Access specifier or modifier is the acces type of the 
      method.It specifies the visibility of the method.Java provides four types
      of access specifier
      
      2.1 Public : The method is accessible by all classes when we use pulic 
      specifier in our application.

      2.2Private : We we use a private acces specifier,the method is accesible 
      only in the classes in which it is defined.

      2.3 Protected : When we use protected access modifier,the method is accessible
      within the same package or subclass in a different package.

      2.4 Default : When we do not use any access specifier in the method declaration,
      java uses default access specifier by default.It is visible only from same 
      package only.

      3. Return type : Return type is a data type that the method returns.It may have
      a primitive data type,object,collection,void,etc.If method does not return 
      anything we use void keyword.

      4. Method name : It is a unique name that is used to define the name of a method.

      5. Parameter list : It is the list of parameters separated by a comma and enclosed
      in he pair of parentheses.It contains the data type and variable name.If the method
      has no parameter,left the parentheses blank.

      6. Method body : It is a part of the method declaration.It contains all the actions
      to be performed.It is enclosed within the pair of curly braces.

    */


    // calling static method
    sayHello("Bob");

    Chapter7 chapter7 = new Chapter7();
    chapter7.sayGoodBye("Jack");

  }


  // creating static method
  public static void sayHello(String userName){
    System.out.println("Hello "+userName);
  }


  private void sayGoodBye(String userName){
    System.out.println("Good Bye "+userName);
  }

}