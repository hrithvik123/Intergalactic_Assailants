import java.awt.Rectangle;

public class Enemy extends Player{

	private boolean enemyMovementRight;

	public Enemy(int x,int y){
		super(x, y);
		this.enemyMovementRight = true;
	}
	public boolean getEnemyMovementRight(){
		return enemyMovementRight;
	}
	public void setEnemyMovementRight(boolean state){
		enemyMovementRight = state;
	}
	public Rectangle getEnemyBoundary(){
		return new Rectangle(getX_Coordinate(), getY_Coordinate(), getWidth(), getHeight());
	}
}