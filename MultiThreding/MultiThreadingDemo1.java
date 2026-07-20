package MultiThreding;
class MyThread extends Thread{
    public void run(){
        System.out.println("My tread class");
        
    }
}

public class MultiThreadingDemo1 {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
        System.out.println("My main");
        
    }
    
}
// JVM Process
// │
// ├── Main Thread
// └── Child Thread

// MyThread t = new MyThread();

//         ↓

// Thread Object Created

//         ↓

// t.start();

//         ↓

// JVM creates a new thread

//         ↓

// run() executes



//-------------------------------
// t.start()
//       │
//       ▼
// JVM requests the OS to create a new thread
//       │
//       ▼
// New thread is created
//       │
//       ▼
// That new thread executes run()

// Difference Between start() and run()
// start()	                                    run()
// Creates a new thread	Does                    not create a new thread
// Executed by a new thread	                    Executed by the calling thread
// Calls run() internally	                    Just a normal method call
// Enables multithreading	                    No multithreading