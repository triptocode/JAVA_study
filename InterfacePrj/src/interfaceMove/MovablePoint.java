package interfaceMove;

public class MovablePoint implements Movable{

	private int x, y;
	public MovablePoint(int x, int y) {
		this.x = y;
		this.y =y;
	}
	
	public String toString() {
		return "Point at ("+x+","+y+")";		
	}
	public void moveUp() {y++;}
	public void moveDown() {y--;}
	public void moveRight() {x++;};
	public void moveLeft() {x--;};
}
