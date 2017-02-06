import java.util.LinkedList;
public class ScrabbleTest {

	public static void main(String[] args){
		
		Singleton newInstance = Singleton.getInstance();
		
		System.out.println("Instance 1 ID: "+ System.identityHashCode(newInstance));
		
		System.out.println("Tiles: "+ newInstance.getLettersList());
		
		LinkedList<String> playerOneTiles = newInstance.getTiles(7);
		
		System.out.println("Player 1 Tiles: "+ playerOneTiles);
		
		System.out.println("Remaining tiles: "+ newInstance.getLettersList());
		
		Singleton instanceTwo = Singleton.getInstance();
		
		System.out.println("Instance 2 ID: "+ System.identityHashCode(instanceTwo));
		
		System.out.println("Tiles: "+ instanceTwo.getLettersList());
		
		LinkedList<String> playerTwoTiles = instanceTwo.getTiles(7);
		
		System.out.println("Player 2 Tiles: "+ playerTwoTiles);
		
		System.out.println("Remaining tiles: "+ instanceTwo.getLettersList());
	}
}
