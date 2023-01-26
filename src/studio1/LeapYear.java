package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Value for x?");
		int x = in.nextInt();
		boolean leapYearOne = (x%4) == 0;
		boolean leapYearTwo = (x%100) != 0;
		boolean leapYear = leapYearOne && leapYearTwo;
		System.out.println(leapYear);
	}

}
