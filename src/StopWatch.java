import java.util.concurrent.TimeUnit;
public class StopWatch {
	public static void main(String[] args) throws InterruptedException
    {
        long startTime = System.nanoTime();
 

       TimeUnit.SECONDS.sleep(5);
 
        long endTime = System.nanoTime();
 
        long timeElapsed = endTime - startTime;
 
        System.out.println("Execution time in nanoseconds: " + timeElapsed);
        System.out.println("Execution time in milliseconds: " + timeElapsed / 1000000);
    }
}