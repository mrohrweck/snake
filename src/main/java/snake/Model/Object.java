package snake.Model;

public abstract class Object {

	public static final int SIZE = 20;
	protected int X, Y;
	
	public Object(int x, int y){
		
		this.X = x;
		this.Y = y;
	}

	public int getX() {
		return X;
	}

	public int getY() {
		return Y;
	}

	public void setX(int x) {
		X = x;
	}

	public void setY(int y) {
		Y = y;
	}

}
