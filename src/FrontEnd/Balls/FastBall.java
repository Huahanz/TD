package FrontEnd.Balls;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import FrontEnd.GameInfo;
import Helpers.Config;
import Helpers.ImageHelper;
import Helpers.TestHelper;

public class FastBall extends ActiveBall{
	public int health;
	public int stepLength = 20;
	public int x;
	public int y;
	public FastBall(int x, int y, int XIZE, int YSIZE, int stepLength, String imagePath){
		super(x, y, XIZE, YSIZE, stepLength, imagePath);
	}
	public FastBall(int x, int y){
		this(x, y, 12, 15, 20, "/Users/huahan/Pictures/FastBall.gif");
	}
	public FastBall(){
		this(0, 0);
	}
	public void randomWalk() {
		for(Ball ball : GameInfo.balls){
			if(ball instanceof SlowBall){
				this.move(ball);
				return;
			}
		}
	}
	public void moveToExit(){
		this.move(Config.defaultOneSlotWidth-1, Config.defaultOneSlotHeight-1);
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
}