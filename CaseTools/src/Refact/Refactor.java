package Refact;

public class Refactor {

	private static final int FifthNumber = 5;
	private static final int Firstnumber = 1;//select "1" refactor >> extract constant 

	public static void main(String[] args) 
	{
		int Thirdnumber = 3;// select "3" refactor >> extract local variable
		int [] marks = {Firstnumber,2,Thirdnumber,4,FifthNumber};
		printmarks(marks, 0);
	}

	/**
	 * @param marks select for loop >> refactor >>extract method 
	 * @param count TODO select private static void printmarks(int[] marks, int count) {
		for (int mark:marks) >>refactor > change method signature
	 */
	private static void printmarks(int[] marks, int count) {
		for (int mark:marks)
		{
			System.out.println(mark);
		}
	}

}
