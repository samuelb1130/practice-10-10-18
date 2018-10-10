import java.util.Scanner;

public class practice {

	public static void main(String[] args) {

		
		
		//printing
		System.out.println( " I know how to print " );
		
		//print the value of a variable.
		
		int num; //declared
		num = 10; //initialization --> first assignment
		
		double decimal = 3.75; //declared and initialized in one line.
		
		String str = " some string"; //declared and initialized in one line
		
		
		//print the value of each
		
		System.out.println("\n" + num);
		System.out.println(decimal);
		System.out.println(str);
		
		
		//add 30 to num
		//subtract 25 from decimal
		//concatinate "more stuff" to str
		
		System.out.println("\n" + num);
		num += 30;
		decimal = decimal - 25;
		str = str + " more stuff";
		
		System.out.println("\n" + "num: " + num); // num: 40
		System.out.println("\n" + "decimal: " + decimal);
		System.out.println("\n" + "str: " + str +  " <- that was the content of the string");
	
		//create a scanner input
		Scanner Koosha = new Scanner(System.in);
		
		
		System.out.println("\n" + "Please enter your favorite sport:		");
		String Sport;
		Sport = Koosha.nextLine();
		
		System.out.print("\n" + "Your favorite sport is " + Sport + " my is soccer" ); 
		
		
		
	}

}
