package game.command.keyboard;

import java.util.ResourceBundle.Control;
import java.util.Scanner;

public class Test {
		
	static InputHandler inputHandler;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("your input is : ");
		String input = sc.nextLine();
		switch (input) {
		case "a":
			inputHandler = new InputHandler(new AttackCommand());
			inputHandler.setCommand();
			break;
		case "s":
			inputHandler = new InputHandler(new JumpCommand());
			inputHandler.setCommand();
			break;
		case "d":
			inputHandler = new InputHandler(new FireCommand());
			inputHandler.setCommand();
			break;
		
		default:
			break;
		}
	}
}
