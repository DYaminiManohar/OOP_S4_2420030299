package mypack;
import java.util.*;
public class LogicalOperators {
	
	public static void main(String[] args) {
		boolean theory=true;
		boolean practical=false;
		if(theory  && practical)
			System.out.println("Student Passed in both");
		else
			System.out.println("Student didn't Passed in both: So he failed");
	}
}
