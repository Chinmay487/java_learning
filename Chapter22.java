
// multithreading
/*
  Multithreading is a process of executing multiple threads 
  simultaneously.

  A thread is lightweight sub-process.the smallest unit of 
  processing.Multiprocessing and multithreading are both used
  to achieve multitasking.

  However,we use multithreading than multiprocessing because 
  threads use a shared memory area.They don't allocate memory 
  area so saves memory,and context-switching between the threads
  takes less time than process.
*/

// Advantages of multithreading
/*
  1. It doesn't block the user because threads are independent and
  you can perform multiple operations at the same time.

  2. You can perform many operations together,so it saves time.

  3. Threads are independent,so it doesn't affect other threads of an
  exception occurs in a single thread.
*/

// Multitasking
/*
  Multi threading is a process of executing multiple tasks simultaneously.
  We use multitasking to utilize the CPU.Multitasking can be achieved in
  two ways

  1. Process-based Multitasking (Multiprocessing)
  2. Thread-based Multitasking (Multithreading)

*/

// Multiprocessing
/*
  1. Each process has an address in memory.In other words,each process
  allocates a separate memory area.
  2. A process is heavyweight.
  3. Cost of communication between the process is high.
  4. Switching from one process to another requires some time for saving
  and loading registers,memory maps,updating lists,etc.
*/

//Multithreading
/*
  1. Threads share the same address space
  2. A threade is lightweight
  3. Cost of communication between the thread is low
*/


// What is thread ?
/*
  A thread is lightweight subprocess,the smallest unit of processing.
  It is a separate path of execution.

  Threads are independent.If there occurs exception in one thread,it 
  doesn't affect other threads.It uses shared memory area.
*/

/*
  Threads can be created by using two mechanisms :

  1. Extending the Thread class.
  2. Implementing the Runnable interfce.

*/


// Thread class vs Runnable interface
/*

  1. If we extend the Thread class,our class cannot extend any other
  class because Java doesn't support multiple inheritance.But if we
  implement the runnable interface,our class can still extend other base
  classes.

  2. We can achieve basic functionality of a thread by extending Thread
  class because it provides some inbuil methods like yield().interrupt(),etc.
  That are not available in Runnable interface.

  3. Using Runnable interface will give you an object than can be
  shared amongst multiple threads.

*/

class ThreadDemo1 extends Thread{

  public void run(){

    for(int i=0;i<5;i++){
      System.out.println("haha");
      try{
        Thread.sleep(50);
      }
      catch(Exception e){}
    }

  }

}

class ThreadDemo2 implements Runnable{

  public void run(){

    for(int j=0;j<5;j++){
      System.out.println("hoho");
      try{
        Thread.sleep(500);
      }
      catch(Exception e){}
    }

  }

}


public class Chapter22{

  public static void main(String[] args){

    System.out.println("Start of code");

    ThreadDemo1 thread1 = new ThreadDemo1();
    // if we are extending Thread class

    Thread thread2 = new Thread(new ThreadDemo2());
    // if we are implementing Runnable interface

    thread1.start();
    thread2.start();

    try{
      thread1.join();
      thread2.join();
    }
    catch(Exception e){}

    System.out.println("End of code");

  }

}

