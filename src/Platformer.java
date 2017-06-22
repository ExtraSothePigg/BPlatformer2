import javax.swing.JFrame;

public class Platformer {
	JFrame frame;
	int width = 1600;
	int height = 900;
	GamePanel gp;
	public static void main(String[] args){
		Platformer li = new Platformer();
		
	}
	public Platformer(){
		frame = new JFrame();
		frame.setSize(width, height);
		gp = new GamePanel();
		setup();
	}
	void setup(){
		frame.add(gp);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		gp.startGame();
		frame.addKeyListener(gp);
	}
}
