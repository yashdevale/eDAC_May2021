import java.util.Scanner;


class ArithemeticOpeartions{
	public static void main(String args[]){
		int i,j,k;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the value of i= ");
		i = sc.nextInt();
		System.out.println("Please enter the value of j= ");
		j = sc.nextInt();

		System.out.println("The addition of Entered numbers is " +(k = i+j));
		System.out.println("The subtraction of Entered numbers is " +(k = i-j));
		System.out.println("The multiplication of Entered numbers is " +(k = i*j));
		System.out.println("The division of Entered numbers is " +(k=i/j)+" and remainder is "+(k=i%j));

	}
}