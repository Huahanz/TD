package swingFrontEnd;

public class Painter{
	
}

class PainterRunnable implements Runnable{
	public void run() {
		while(true){
			GameInfo.swingPanel.repaint();
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}