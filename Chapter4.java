public class Chapter4{

  public static void main(String[] args){
    
    // Operators in java
    /*
      1. Unary operators
      2. Arithematic operators
      3. Shift operators
      4. Relational operators
      5. Bitwise operators
      6. Logical operators
      7. Ternary operator
      8. Assignment operator


      Operator Precedence
      Unary > Arithematic > Shift > Relational > Bitwise > 
      Bitwise > logical > Ternary > assignment

    */

    // Unary operator
    /*
      The java unary operators only requires only one operand.

      1. incrementing/decrementing value by one
      2. negating an expression
      3. inverting the value of a boolean.
    */

    int value1 = 10;
    System.out.println("Incrementing and decrementing");
    System.out.println("value1++ : "+(value1++));
    System.out.println("value1 : "+value1);
    System.out.println("++value1 : "+(++value1));
    System.out.println("value1-- : "+(value1--));
    System.out.println("value1 : "+value1);
    System.out.println("--value1 : "+(--value1));

    System.out.println();
    
    // ~ and !
    int value2=10,value3=-10;
    boolean value4=true,value5=false;
    System.out.println("! and ~ operators");
    System.out.println("value2 : "+value2);
    System.out.println("value3 : "+value3);
    System.out.println("~value2 : "+~value2);
    System.out.println("~value3 : "+~value3);
    System.out.println("value4 : "+value4);
    System.out.println("value5 : "+value5);
    System.out.println("!value4 : "+(!value4));
    System.out.println("!value5 : "+(!value5));

    System.out.println();

    // Arithematic operators
    System.out.println("Arithematic operator");
    int number1=10,number2=20;
    System.out.println("number1 : "+number1);
    System.out.println("number2 : "+number2);
    System.out.println("number1 + number2 : "+ (number1+number2));      
    System.out.println("number1 - number2 : "+ (number1-number2));
    System.out.println("number1 * number2 : "+ (number1*number2));
    System.out.println("number1 / number2 : "+ (number1/number2));
    System.out.println("number1 % number2 : "+ (number1%number2));

    System.out.println();

    // Left shift operator
    /*
      The java left shift operator << is used to shift the bits of 
      value to the left side of a specied number of times.
    */

    System.out.println("Left shift operator");
    System.out.println("10<<2"+(10<<2));
    // 10*2^2 = 10*4 = 40

    System.out.println("Right shift operator");
    System.out.println("10>>2"+(10>>2));
    // 10/2^2 = 10/4 = 2

    System.out.println();

    // Logical && and bitwise & operator

    /*
      The logical && operator doesn't check the second condition if the
      first condition is false.It checks the second condition only if the
      first one is true.
      
      The bitwise & operator checks both conditions whether first condition
      is true or false.
    */

    int number3=10,number4=5,number5=20;
    System.out.println("Logical & and bitwise && operators");
    System.out.println("number3 : "+number3);
    System.out.println("number4 : "+number4);
    System.out.println("number5 : "+number5);
    System.out.println("number3<number4 && number3<number5 : "+(number3<number4 && number3<number5));
    System.out.println("number3<number4 & number3<number5 : "+(number3<number4 && number3<number5));

    System.out.println();

    // Logical || and bitwise | operator

    /*
      The logical || operator doesn't check the second condition of the first
      condition is true.It checks the second condition only if the first one is 
      false.

      The bitwise | operator always checks both conditions whether first condition
      is true or false.
    */

    System.out.println("Logical || and bitwise | operator");
    System.out.println("number3 : "+number3);
    System.out.println("number4 : "+number4);
    System.out.println("number5 : "+number5);
    System.out.println("number3<number4 || number3<number5 : "+(number3<number4 || number3<number5));
    System.out.println("number3<number4 | number3<number5 : "+(number3<number4 | number3<number5));

    // Ternary operator

    /*
      Java ternary operator is used as one line replacement for if-else statement
      and used a lot in java programming.It is the only conditional operator which 
      takes three operands.
    */

    System.out.println();

    int number6=10,number7=11;
    int result = number6<number7?number6:number7;
    System.out.println("Ternary operator");
    System.out.println("number6 : "+number6);
    System.out.println("number7 : "+number7);
    System.out.println("result = number6<number7?number6:number7 "+result);




  }

}