public class Chapter8{

  public static void main(String[] args){

    // Strings
    /*
      In java string is basically an object that represents sequence
      of char values.An array of characters works same as java string.
    */

    char ch[] = {'a','b','c','d'};
    String s = new String(ch);
    System.out.println(s);

    // What is String in java?
    /* 
      Generally,String is a sequence of characters.But in java,String is an object that represents
      a sequence of characters.The java.lang.String class is used to create String object.

      How to create a string object?
      1. By String literal
      2. By new keyword

    */ 

    // String literal
    /*
      Java String literal is created using double qoutes.

      Each time you create a string literal,the JVM checks the "String constant pool" first.
      It the strings already exists in the pool,a reference to the pooled instance is returned.
      If the string doesn't exists on the pool,a new string instance is created and placed in the
      pool.
    */

    String string1 = "Welcome";
    String string2 = "Welcome"; // It doens't create a new instance.
    System.out.println(string1 + " " + string2);

    /*
      In the above example only one object will be created.Firstly JVM will not find any 
      string object with the value "Welcome" in the string constant pool that is why it will
      create new object.Aftre that it will find the string with the value "Welcome" in the 
      pool,it will not create a new object but will return the reference to the same instance.
    */

    // Why java uses String literal?
    /*
      To make java more memory efficient (because no new objects are created if it exists already
      in the string constant pool).
    */
    
    // Creating string using new keyword
    String string3 = new String("Welcome");
    // This will create two object and one reference variable.

    /*
      In such cases JVM will create a new string object in normal (non pool) heap memory and
      the literal "welcome" will be placed in the string constant pool.The variable will refer to 
      the object in a heap (non pool)
    */
    System.out.println(string3);

    // Java String methods

    String string4 = "this is an example";
    System.out.println("\nString methods");
    System.out.println("string4"+string4);
    System.out.println("string4.charAt(3) "+string4.charAt(3)); 
    // character at specified index

    System.out.println();
    
    System.out.println("string4.length() "+string4.length()); 
    // length of string

    System.out.println();

    System.out.println("string4.substring(3,10) "+string4.substring(3,10));
    // gives substring string.substring(start-index,end-index)

    System.out.println();

    System.out.println("string4 contains k : "+string4.contains("k"));
    System.out.println("string4 contains e : "+string4.contains("e"));

    System.out.println();
    
    System.out.println("Join function");
    String joinString1 = String.join("-","welcome","to","Nowhere");  
    System.out.println(joinString1);

    System.out.println();

    String string5="hello",string6="Hello",string7="Hello";
    System.out.println("string5 "+string5);
    System.out.println("string6 "+string6);
    System.out.println("string7 "+string7);
    System.out.println("string5.equals(string6) "+string5.equals(string6));
    System.out.println("string7.equals(string6) "+string7.equals(string6));
    // equals checks whether strings are equal or not

    System.out.println();

    String string8="";
    System.out.println("string8.isEmpty() "+string8.isEmpty());
    System.out.println("string7.isEmpty() "+string7.isEmpty());
    // isEmpty checks whether given string is empty or not x

    System.out.println();

    String string9 = "hahahahahaha";
    System.out.println("string9 "+string9);
    System.out.println("before using replace function "+string9);
    String result1 = string9.replace("a","o");
    System.out.println("after using replace function "+result1);
    // replace function replace the existing character or set of characters with
    // given character or character sequence
    System.out.println("replace character sequence");
    System.out.println("before replacing character sequence "+string9);
    String result2 = string9.replace("ha","la");
    System.out.println("after replacing character sequence "+ result2); 

    System.out.println();

    String string10 = "This is another string example";
    System.out.println("string10 "+string10);
    System.out.println("string10.indexOf('example') "+string10.indexOf("example"));
    // this will return index of substring

    System.out.println();

    String string11 = "THIS IS ALL UPPER CASE STRING";  
    System.out.println("string11 "+string11);
    System.out.println("string11.toLowerCase() "+string11.toLowerCase());
    // toLowerCase returns a string in lowercase using specified locale

    System.out.println();

    String string12 = "this is all lower case string";
    System.out.println("string12 "+string12);
    System.out.println("string12.toUpperCase() "+string12.toUpperCase());
    // toUpperCase returns a string in upper case using specifier locale

  }

}