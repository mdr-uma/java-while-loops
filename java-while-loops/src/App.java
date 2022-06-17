
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
