package threads;

public class Fäden {
	
	public static void main(String[] args) {
	
		
	PongThread pongThread = new PongThread(); 
	pongThread.start();
	
	
	for (int i =0; i < 10; i++)
		System.out.println("Ping!");
		
	}

}

 class PongThread extends Thread{
	
	public void run (){
		for (int i = 0; i <10;i++)
			System.out.println("Pong!");
	}
}
