package Multithreading_Example;
import java.util.Arrays;
import java.util.List;

public class MultiThreadEx{
	
	public static void main(String args[]) throws InterruptedException{
		//Lets create 2 Threads t1 & t2
		Thread t1 = new Thread(new Runnable() {
			public void run()
			{
				new ServiceNew().printweekdays();
			}
		});
		Thread t2 = new Thread(new Runnable() {
			public void run()
			{
				new ServiceNew().printMonths();
			}
		});
		
		//Call a thread using start()
		t1.start();
		t2.start();
	}

}
class ServiceNew{
	void printweekdays() {
	List<String> weekdayslist = Arrays.asList("Sunday","Monday","Tuesday","Wednesday");
	for(int i=0;i<100;i++) {
	System.out.println(weekdayslist);
	}
	}
	void printMonths() {
		List<String> monthlist = Arrays.asList("Jan","Feb","March","April");
		for(int i=0;i<100;i++) {
		System.out.println(monthlist);
		}
		}
}