import java.awt.Rectangle;

public class Enemy {
	private int x_coordinate;
	private int y_coordinate;
	private int width;
	private int height;
	private boolean live;

	public Enemy(int x,int y){
		this.x_coordinate = x;
		this.y_coordinate = y;
		this.width = 5;
		this.height = 5;
		this.live = true;
	}
	public int getX_Coordinate(){
		return x_coordinate;
	}
	public int getY_Coordinate(){
		return y_coordinate;
	}
	public boolean getLive(){
		return live;
	}
	public void moveRight(){
		x_coordinate += 10;
	}
	public void moveLeft(){
		x_coordinate -= 10;
	}
	public void moveDown() {
		y_coordinate -= 5;
	}
	public void setLive(boolean state){
		live = state;
	}
	public Rectangle getEnemyBoundry(){
		return new Rectangle(x_coordinate, y_coordinate, width, height);
	}
}