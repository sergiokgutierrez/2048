import java.util.Random;

// Represents the internal state of a game of 2048 and allows various
// operations of game moves as methods. Uses TwoNTiles and DenseBoard
// to implement the game.
public class Game2048{
  // Random number generator used in the provided methods
  // getRandomTile() and randomFreeLocation()
  //Global Variables??? 
  private Random random;
  DenseBoard board;
  boolean isGameOver;

  
  
  public Game2048(int x, int y, int z){//rows, columns, seed
	  board= new DenseBoard(x, y);
	  random= new Random();
	  random.setSeed(z);
  }
  // ADD ADDITOINAL FIELDS HERE
  

  public void addRandomTile(){
	  Tile newTile= getRandomTile();
	  int newLocation= randomFreeLocation();
	  if(newLocation >0){
		  board.addTileAtFreeSpace(newLocation, newTile);
	  }else
		  System.out.println("out of free locations");
  }
  public boolean isGameOver(){
	  if(board.getFreeSpaceCount()>0)
		  return false;
	  else return true;

  }
  
  
  // Generate and return a random tile according to the probability
  // distribution. 
  //    70% 2-tile
  //    25% 4-tile
  //     5% 8-tile
  // Use the internal random number generator for the game.
  public Tile getRandomTile(){
	int rand= random.nextInt(100);
    //    System.out.printf("\n\nMY DOUBLE IS %f\n",rand);
    if(rand <= 70){
      return new TwoNTile(2);
    }
    else if(rand >70 && rand<=95){
      return new TwoNTile(4);
    }
    else{
      return  new TwoNTile(8);
    }
  }

  // If the game board has F>0 free spaces, return a random integer
  // between 0 and F-1.  If there are no free spaces, throw an
  // exception.
  public int randomFreeLocation(){
    if(board.getFreeSpaceCount()>0){
    	return random.nextInt(board.getFreeSpaceCount());
    }else System.out.println("out of bounds: there is no freelocations"); 
    	return -1;
  }

  // ADDITIONAL METHODS HERE
  public String boardString(){
	  return board.toString();
  }
  public void shiftLeft(){
    //bring everythingto the top create a new row
	  
  }
 public void shiftRight(){
	  
  }
 public void shiftUp(){
	  
 }
 public void shiftDown(){
	  
 }
 public boolean lastShiftMovedTiles(){
	 return true;
 }
 public int getScore(){
	 return 1;
 }
 
}

