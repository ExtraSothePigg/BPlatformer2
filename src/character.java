import java.awt.Color;
import java.awt.Graphics;

public class character extends GameObject {
	float speed;
	boolean left = false;
	boolean right = false;
	boolean jump = false;

	public character(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		speed = 1;
	}

	void update() {
		if (left) {
//			if(speed>0){
//				speed = 0;
//			}
			x -= speed;
			
			for (int i = 0; i < 1000; i++) {
				speed += 0.0001;
			}
		}
		if (right) {
//			if(speed<0){
//				speed = 0;
//			}
			x += speed;
			for (int i = 0; i < 1000; i++) {
				speed += 0.0001;
			}
		}
		if (jump) {
			y -= speed;
		}
		if(right==false){
			speed = 1;
		}
		if(left==false){
			speed = 1;
		}
	}

	void draw(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(x, y, width, height);
	}
}
