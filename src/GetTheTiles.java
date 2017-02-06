import java.util.LinkedList;
public class GetTheTiles implements Runnable {
	
	public void run(){
		
		Singleton newInstance = Singleton.getInstance();
		
		System.out.println("Instance ID: "+ System.identityHashCode(newInstance));
		
		System.out.println("Tiles: "+ newInstance.getLettersList());
		
		LinkedList<String> playerOneTiles = newInstance.getTiles(7);
		
		System.out.println("Player Tiles: "+ playerOneTiles);
		
		System.out.println("Got Tiles");
		
	}
}
