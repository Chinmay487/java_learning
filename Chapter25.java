// File handling
/*
  In java,with the help of File class,we can work with files.This File
  class is inside the java.io package.The file class can be used by creating
  an object of the class and then specifying the name of the file.
*/

// Why file handling required ?
/*
  1. File handling is an integral part of any programming language as file
  handling enables us to store the output of any particular program in a file
  and allows us to perform certain operations on it.

  2. In simple words,file handling means reading and writing data to a file.
*/

// Streams
/*
   In java,the concept of stream is used in order to perform I/O operations on a
   file.

   types of stream : 
   1. Character stream
   2. Byte stream
*/

// Character stream
/*
  Character stream is mainly involved with character data.A file handling process
  with a charcter stream is process which an input is provided and executed with the
  character data.
*/


// Byte stream
/*
  Byte stream is mainly involved with byte data.A file handling process with a byte
  stream is a process in which an input is provided and executed with the byte data.
*/

import java.io.*;
import java.util.Scanner;

public class Chapter25{

  public static void main(String args[]){

    // creating a file
    try{

      File f1 = new File("FileOperationDemo.txt");
      if(f1.createNewFile()){
        System.out.println("File "+f1.getName()+" is created");
      } else {
        System.out.println("File already exists");
      }

    } catch(Exception e){
      System.out.println("Something went wrong");
    }

    // getting file information
    File f2 = new File("FileOperationDemo.txt");
    if(f2.exists()){

      // getting name of file
      System.out.println("file name "+f2.getName());

      // getting path of file
      System.out.println("path "+f2.getAbsolutePath());

      // Checking whether file is writable or not
      System.out.println("is writable "+f2.canWrite());

      //checking whether the file is readable or not
      System.out.println("is readable "+f2.canRead());

      // Getting length of file in bytes
      System.out.println("length of file in bytes"+f2.length());

    } else {
      System.out.println("File does not exists");
    }

    // writing into file

    try{
      FileWriter writer = new FileWriter("FileOperationDemo.txt");
      writer.write("this is going to be added to a file \n lets check it out");
      writer.close();
      System.out.println("Writing to file done");
    } catch (Exception e){
      System.out.println("something went wrong");
    }

    // read from file
    System.out.println("Reading content of file");
    try{
      File f3 = new File("FileOperationDemo.txt");
      Scanner fileContent = new Scanner(f3);

      while(fileContent.hasNextLine()){
        String data = fileContent.nextLine();
        System.out.println(data);
      }
      fileContent.close();
      System.out.println("File reading done");
    } catch(Exception e){
      System.out.println("Something went wrong");
    }
    
    // deleting file
    System.out.println("Deleting a file");

    try{
      File f4 = new File("FileOperationDemo.txt");

      if(f4.delete()){
        System.out.println("file deleted successfuly");
      } else {
        System.out.println("Something went wrong");
      }

    } catch(Exception e){
      System.out.println("Something went wrong");
    }


  }


}

