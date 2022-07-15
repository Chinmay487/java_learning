// Exception handling
/*
  Exception handling in java is one of the most effective means to
  handle the runtime errors so that the regular flow of the application
  can be preserved.Java exception handling is a mechanism to handle runtime
  erros such as ClassNotFound,IOException,SQLException,RemoteException,etc

  Exception is unwanted or unexpected event,which occurs during the execution
  of a program,i.e. run time,that disrupts the normal flow of program's instructions.
  Exceptions can be caught and handled by the program.When an exception occurs
  within a method,it creates an object.This object is called exception object.
  It contains information about the exception,such as the name and description
  of the exception and the state of the program when the exception occured.
*/

// Major reasons why Exception occurs
/*
  1. Invalid user input
  2. Device failure
  3. Loss of network connection
  4. Physical limitations
  5. Code errors
  6. Opening an unavailable file
*/

/*
  Errors represent irrecoverable conditions such as java virtual machine running
  out of memory,memory leaks,stack overflow errors,library incompatibility,infinite
  recursion,etc.Errors are usually beyond the control of the programmer,and we should 
  not try to handle errors.
*/

// difference between errors and exceptions
/*
  An error indicates a serious problem that a reasonable application should
  not try to catch.

  Exception indecates condition that a reasonable application might try to 
  catch.
*/

// Exception hierarchy
/*
  All exceptions and error types are subclass of class Throwable,which is the
  base class of the hierarchy.One branch is headed by Exception.This class is 
  used for exceptional conditions that user programs should catch.Another branch,
  Error is used by java run-time system (JVM) to indicate errors having to do
  with the runtime environment itself (JRE).
*/

// Types of exception
/*
  1. Built-in exceptions
    1.1 Checked exceptions
    1.2 Unchecked exceptions
  
  2. user defined exceptions
*/


// Built in exceptions
/*
  Built-in exceptions are the exceptions that are available in java
  libraries.These exceptions are suitable to explain certain error 
  situations.

  1. Checked Exceptions : These are called compile time exceptions because 
  these exceptions are checked at compile time by the compiler.

  2. Unchecked Exceptions : These are just opposite to the checked exceptions.
  The compiler will not check these exceptions at compile time.In simple words,
  if a program throws n unchecked exception,and even if we didn't handle or 
  declare it,the program would not give a compilation error.
*/

// User defined exceptions
/*
  Sometimes,the built in exceptions are not able to describe certain
  situation.In such cases user can also create exceptions,which are 
  called user-defined exceptions.

  Advantages : 
  1. Provision to complete program execution.
  2. Easy identification of program code and error handling code.
  3. Propogation of errors.
  4. Meaningful error reporting.
  5. Identifying error types.

*/

// Exception Keywords

/*
  1. try : 
  The try keyword is used to specify a bloc where we should place an exception 
  code.It means we can't use try block alone.The try block must be followed by 
  either catch or finally.

  2. catch :
  The catch block is used to handle the exception.It must be preceded by try
  block which means we can't use catch block alone.It can be followed ny finally
  block later.

  3. finally :
  The finally block is used to execute the necessary code of the program.It is
  executed whether an exception is handled or not.

  4. throw :
  The trow keyword is used to throw an exception.

  5. throws :
  The throws keyword is used to declare exceptions.It specifier that there may
  occur an exception in the method.It does't throus exception.It is always used
  with method signature.

*/


class AgeLimitException extends Exception{

  public AgeLimitException(String message){
    super(message);
  }

}


class Chapter23 {

  static void tryCatchDemo1(int number){

    try{
      double result = 1/number;
      System.out.println("No exception occured");
      System.out.println("result is "+result);
    } catch (Exception e){
      System.out.println("Error occured");
      System.out.println(e.toString());
    } finally {
      System.out.println("This part well always exevute");
    }

  }

  /*
    NOTE : we need to add throws Custom-Exception-Class-Name to function
    which is going to throw that custom exception.
  */

  static void throwAgeExceptionDemo(int age) throws AgeLimitException {

    if(age<20){
      throw new AgeLimitException("age less than 18");
    }
    System.out.println("Age is "+age);

  }

  static void exceptionDemo2(int age){

    try{
      throwAgeExceptionDemo(age);
    } catch(Exception e) {
      System.out.println(e.toString());
    } finally {
      System.out.println("Execution done");
    }

  }

  public static void main(String[] args){

    System.out.println("Executing without exception");
    tryCatchDemo1(2);

    System.out.println("Executing with exception");
    tryCatchDemo1(0);

    System.out.println();

    System.out.println("executing without custom exception");
    exceptionDemo2(21);
    System.out.println("executing with custon exception");
    exceptionDemo2(12);

  }

}

