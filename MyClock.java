
/** Joud Hatem Alharbi 
ID Number: 442010694 
Group : 1 
*/
package clock;
import java.time.*;
public class MyClock {
	public static void main(String[] args) {
		
    	   
 	   
		   try {
			   boolean clock= true;
				while(clock)       
				{
			   
	    	   LocalTime timeObject; 
	    	   timeObject = LocalTime.now();
	
				
	    	   System.out.print(" Current Time : " + timeObject.getHour()); // will display the current time in format HH:MM:SS
	    	   System.out.print(" : "+  timeObject.getMinute());
	    	   System.out.println(" : "+ timeObject.getSecond());
	           
	    	   
	    	   Thread.sleep(1000);
	    	   
	    	   
	    		   System.out.print("\b");  //it does clear the screen
	    		   
	               /* Also i have tried these ways to Clear the Screen:
	                System.out.print("\033\143");
	                System.out.print("\033[H\033[2J");
	                System.out.flush();
	                final String ESC = "\033[";
	                System.out.print(ESC + "2J")
	    	        for (int i = 0; i < 50; ++i) System.out.println("\b"); */
	    	  
	    	   
				}
				
	           } 
	       catch (InterruptedException ie) {
	       	   Thread.currentThread().interrupt();
	         } 
	       
	} 
	       
}
