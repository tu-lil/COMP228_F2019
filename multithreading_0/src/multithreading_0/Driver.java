package multithreading_0;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     System.out.println( "Creating threads" );

	      // create each thread with a new targeted runnable
	     
	     PrintTask printTaskd1 = new PrintTask( "task1"  );
	     Thread thread1 = new Thread(printTaskd1);
	      
	      
	      
	      Thread thread2 = new Thread( new PrintTask( "task2" ));
	      Thread thread3 = new Thread( new PrintTask( "task3" ) );

	      System.out.println( "Threads created, starting tasks." );

	      // start threads and place in runnable state
	      thread1.start(); // invokes task1�s run method
	      thread2.start(); // invokes task2�s run method
	      thread3.start(); // invokes task3�s run method

	      System.out.println( "Tasks started, main ends.\n" );
	   } // end main
	} // end class
