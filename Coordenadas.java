import java.util.Scanner;

public class Coordenadas {
	
	public static void main(String[] args) {
		float x = 0;
		float y = 0;
		
		Scanner input = new Scanner(System.in);
		
		x = input.nextFloat();
		y = input.nextFloat();
		
		input.close();
		
		String result = "";
		
		if(x != 0 && y != 0) {
			if(x > 0 && y > 0) {
				result = "Q1";
			}
			else if(x > 0 && y < 0) {
				result = "Q4";
			}
			else if(x < 0 && y > 0) {
				result = "Q2";
			}
			else{
				result = "Q3";
			}
		}
		else if(x == 0 && y == 0) {
			result = "Origem";
		}
		else {
			if(x == 0) {
				result = "Eixo Y";
			}
			else {
				result = "Eixo X";
			}
		}
		
		System.out.println(result);
	}
}
