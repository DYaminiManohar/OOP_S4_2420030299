package Wrapperclasses;
import java.util.*;
public class AutoUnboxing {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an Integer value: ");
        int input = sc.nextInt();
        Integer obj = input;
        int num = obj;
        System.out.println("Auto-unboxed int: " + num);
    }
}
