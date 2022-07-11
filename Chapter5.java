public class Chapter5{

    public static void main(String[] args){
    
      // Control Statements
      /*
        Java Provides three types if control flow statements.

        1. Decision making
          1.1 If statements
            1.1.1 Simple if statement
            1.1.2 if-else statement
            1.1.3 if-else-if ladder
            1.1.4 Nested if statement
          1.2 switch statements
        
        2. Loop statements
          2.1 Do while loop
          2.2 While loop
          2.3 for loop 
          2.4 for-each loop

        3. Jump statements
          3.1 break statement
          3.2 continue statement
      */

      // Simple if statement
      System.out.println("Simple if statement");
      if(10<20){
        System.out.println("10 is smaller than 20");
      }

      System.out.println();
      
      // if-else statement
      System.out.println("if-else statement");

      if(10<9){
        System.out.println("10 is smaller than 9");
      } else {
        System.out.println("10 is greater than 9");
      }

      System.out.println();
    
      // if-else-if ladder
      System.out.println("if-else-if ladder");
      int marks = 40;
      if(marks >= 90){
        System.out.println("Awesone");
      } else if(marks >= 60 && marks < 90){
        System.out.println("Nice");
      } else {
        System.out.println("Fine");
      }

      System.out.println();

      // nested if else
      System.out.println("nested if else");
      int number1=11,number2=22,number3=21;

      if(number1>number2){
        if(number1>number3){
          System.out.println("number1 is bigger");
        } else {
          System.out.println("number3 is bigger");
        }
      } else if(number2>number3){
        System.out.println("number2 is bigger");
      } else {
        System.out.println("number3 is bigger");
      }

      System.out.println();
      // switch statement

      int number4=3;
      System.out.println("Switch case");
      switch(number4){
        case 1: 
          System.out.println("One");
          break;
        case 2:
          System.out.println("Two");
          break;
        case 3:
          System.out.println("Three");
          break;
        case 4:
          System.out.println("Four");
          break;
        default: System.out.println("Out of range");
      }

      System.out.println();

      // for loop
      System.out.println("For loop started");
      for(int i=0;i<6;i++){
        System.out.print(i+" ");
      }
      System.out.println();
      System.out.println("for loop ended");

      System.out.println();
      // while loop
      int j = 0;
      System.out.println("While loop started");
      while(j<6){
        System.out.print(j+" ");
        j+=1;
      }
      System.out.println();
      System.out.println("While loop ended");

      System.out.println();

      System.out.println("do while loop started");
      int k=0;
      // do while loop
      do{
        System.out.print(k+" ");
        k+=1;
      }while(k<6);
      System.out.println();
      System.out.println("do while loop ended");

      System.out.println();

      // for-each loop
      int array[] = {1,2,3,4,5,6};
      System.out.println("for-each loop");
      for(int element:array){
        System.out.print(element + " ");
      }
      System.out.println();
      System.out.println("for-each loop ended");
    }

}