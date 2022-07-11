public class Chapter6{

  public static void main(String[] args){

    // break statement
    /*
        The break statement is used to break the current flow of 
        the program and transfer the control to the next statement
        outside the loop or switch statement.However,it breaks only
        inner loop in case of the nested loop.

        The break statement cannot be used independenlty in java 
        program,i.e.,it can only be written inside the loop or 
        switch statement.
    */

    System.out.println("Using break statement");
    for(int i=1;i<15;i++){
      if(i==11){
        System.out.println("\nbreaking out of loop at : "+i);
        break;
      }
      System.out.print(i+" ");
    }

    System.out.println();

    // Continue statement
    /*
      The continue statement doesn't break the loop,whereas,it
      skips the specific part of the loop and jumps to the next
      iteration of the loop immediately.
    */

    System.out.println("Using continue statement");
    for(int j=0;j<15;j++){
      if(j%2==0){
        continue;
      }
      System.out.print(j+" ");
    }
    System.out.println();


  }

}