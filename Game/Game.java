public class Game {

	private boolean exitSelected;

 	public void start() {
 		exitSelected = false;
 		System.out.println("Game started!");

 		while(!exitSelected) {
 			drawBoard();
 			readInput();
 			updateBoard();
 		}
 		System.out.println("Game terminated. Bye!");
 	}
 }