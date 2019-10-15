import java.util.Scanner;
public class Hut {
	Scanner scanner = new Scanner(System.in);

	
		
	    int triposx ;
	    int triposy ;
	    int triwidth =80;
	    int triheight=80;
	    
		void einlesen(){
			
			System.out.println(" Xpos eingeben:");
			triposx = scanner.nextInt();
			
			System.out.println(" Ypos eingeben:");
			triposy = scanner.nextInt();
		return;
		}
			
		
		void tri(){
		Triangle triangle = new Triangle (triposx,triposy,triwidth+20,triheight,"firGreen");
		triangle.draw();
		}
		
		
		void squ() {
		Square square = new Square (triposx+12,triposy+80,triwidth,"brown");
		square.draw();
		}
	
		


	}

	


