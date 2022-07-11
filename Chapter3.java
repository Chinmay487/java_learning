

public class Chapter3{
    public static void main(String args[]){
    
      // Data types in Java

      /*

        Data types specify the different sizes and values that can be stored
        in the variable.There are two types of data types in java

        1. Primitive data types : The primitive data types include boolean,char
        byte,short,int,long,float and double.

        2. Non-primitive data types : The non-primitive data types include classes
        interfaces and arrays.

      */

      // Boolean data type
      /*
        The boolean data type is used to store only two possible values
        true and false.This data type is used for simple flags that track 
        true/false conditions.

        The boolean data type specifies one bit of information,but its size
        can't be defined precisely
      */

      Boolean trueValue = true;
      Boolean falseValue = false;
      System.out.println("Boolean data types");
      System.out.println(trueValue+" "+falseValue);
    
      // Byte Data type
      /*
        The byte data type is an example of primitive data type.It is an
        8-bit singed who's complement is integer.Its value range-lies 
        between -128 to 127 (inclusive).

        The byte data type is used to save memory in large arrays where the
        memory savings is most required.It saves space because a byte is 4 
        times smaller than an integer.It also can be used in place of int data
        type.
      */

      byte value1 = 10,value2=-11;
      System.out.println("Byte data type");
      System.out.println(value1+" "+value2);

      // Short data type
      /*
        The short data type is a 16 bit singed two's complement integer.
        A short data type can also be used to save memory just like byte 
        data type.A short data type is 2 times smaller than an intefer
      */

      short value3=10000,value4=-1122;
      System.out.println("Short data type");
      System.out.println(value3+" "+value4);

      // Int data type
      /*
        The int data type is 32-bit signer two's complement integer.
        The int data type is generally used as default data type for 
        integral values unless if there is no problem about memory.
      */

      int value5=11,value6=12;
      System.out.println("Integer data type");
      System.out.println(value5+" "+value6);

      // Long Data Type
      /*
        The long data type is a 64-bit two's complement integer.
        The long data type us used when you need a range of values 
        more than those provided by int.
      */

      long value7=1000L,value8=11000L;
      System.out.println("Long Data Type");
      System.out.println(value7+" "+value8);

      // Float data type
      /*
        The float data type is a single pricision 32-bit IEEE 74 floating
        point.Its value range is unlimited.It is recomended to use float
        (instead of double) if you need to save memory in large arrays of 
        floating point numbers.The float data type should never be used for
        precise values,such as currency.Its default value is 0.0F
      */

      float value9=12.4f;
      System.out.println("Float Data Type");
      System.out.println(value9);

      // Double data type
      /*
        The double data type is a double precision 64-bit IEEE 754
        floating point.Its value range is unlimited.The double data
        type is generally used for decimal values just like float.The
        double data type also should never be used for precise values,
        such as currency.Its default value is 0.0d
      */

      double value10 =12.22;
      System.out.println("Doule data type");
      System.out.println(value10);

      // Char data type
      /*
        The char data type is a single 16-bit unicode character.The 
        char data type is used to store characters.
      */

      char value11 = 'C';
      System.out.println("Char data type");
      System.out.println(value11);

  }

}