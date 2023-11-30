package Multithreading_Example;
import java.util.Arrays;
import java.util.List;
//Sequential Calling Program
public class ThreadExample {

	public static void main(String[] args) throws InterruptedException
	{
		new service().printweekdays();
		System.out.println("weekdays are completed!!");
		Thread.sleep(10000);//the next line will print after 10 seconds = 10000 milliseconds
		new service().printMonths();
		System.out.println("Months are completed!!");
		
	}
}
class service{
	void printweekdays() {
	List<String> weekdayslist = Arrays.asList("Sunday","Monday","Tuesday","Wednesday");
	System.out.println(weekdayslist);
	}
	void printMonths() {
		List<String> monthlist = Arrays.asList("Jan","Feb","March","April");
		System.out.println(monthlist);
		}
}
