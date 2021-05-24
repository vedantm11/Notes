

/*Defining a thread*/

Class Runnablethread implements Runnable 
{
/* job of the thread*/
    public void run(){
    for(int i=0; i<10; i++){
    System.Out.Println("Child Thread");
}
}


Class MainThread
{
/* job of main thread*/
public static void main(String args[ ])
{
   /* main thread created the runnable object*/
	Mythread rt = new Mythread(); 

   /*main thread creates child thread and passed the runnable object*/
	Thread t = new Thread(rt); 
	t.start();

	for(int i=0; i<10; i++)
	System.Out.Print("Main Thread");

}

OUTPUT:
Main Thread
Main Thread
Main Thread
Main Thread
Child Thread
Child Thread
Child Thread
Child Thread
Child Thread
Main Thread
Child Thread
Main Thread
Main Thread
Child Thread
Child Thread
Main Thread
Main Thread
Child Thread
Child Thread
Main Thread

}