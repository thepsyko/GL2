package models;


public class GameManager {
	
	private static GameManager instance; // singleton
	private Game game;

	/**
	 * Private constructor
	 */
	private GameManager(){
		
	}
	
	/**
	 * Return the GameManagerInstance and create it at first call (singleton)
	 * @param instance
	 */
	public static GameManager getInstance() { 
		if (instance == null){
			instance = new GameManager (); 
		}
		return instance;
	}
}