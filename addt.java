import java.util.Scanner;
public class addt
{
	public static void main(String[] args){
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a number :");
		int num1= obj.nextInt();
		
		System.out.println("Enter other number :");
		int num2= obj.nextInt();

		int sum = num1+num2;
		System.out.println("Sum of these number is :"+sum);
}
}