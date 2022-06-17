
public class App {

	public static void main(String[] args) {
		int number = 20;
		
		while(number < 30) {
			System.out.println("Number is:"+" "+ number);
			
			//last line is to prevent from infinity loop 			
			number += 2; 
		}
	}

}

//outputs
//Number is: 20
//Number is: 22
//Number is: 24
//Number is: 26
//Number is: 28
