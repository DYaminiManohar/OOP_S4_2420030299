package Wrapperclasses;
import java.util.*;
public class UnboxingProgram {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int input = sc.nextInt();
	        Integer obj = Integer.valueOf(input);
	        int num = obj.intValue();
	        System.out.println("Unboxed int: " + num);
	    }
}
