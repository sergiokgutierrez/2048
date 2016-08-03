// Concrete implementation of a Tile. TwoNTiles merge with each other
// but only if they have the same value.
public class TwoNTile extends Tile {
	int score;
	
  // Create a tile with the given value of n; should be a power of 2
  // though no error checking is done
  public TwoNTile(int n){
	  if(n%2 != 0)		  
		  System.out.println("error occur");
	  		score = n;
  }
  // Returns true if this tile merges with the given tile. "this"
  // (calling tile) is assumed to be the stationary tile while moving
  // is presumed to be the moving tile. TwoNTiles only merge with
  // other TwoNTiles with the same internal value.
  public boolean mergesWith(Tile moving){
	  return moving.getScore() == this.score;
	  
  }
  // Produce a new tile which is the result of merging this tile with
  // the other. For TwoNTiles, the new Tile will be another TwoNTile
  // and will have the sum of the two merged tiles for its value.
  // Throw a runtime exception with a useful error message if this
  // tile and other cannot be merged.
  public Tile merge(Tile moving){
	  Tile newT = new TwoNTile(moving.getScore()*2);
	  return newT;
  }
  // Get the score for this tile. The score for a TwoNTile is its face
  // value.
  public int getScore(){
	  return score;
  }
  public String toString(){
	  String s = new String(" "+score+" ");
	  return s;
  }
}