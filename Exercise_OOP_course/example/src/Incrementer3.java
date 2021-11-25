public class Incrementer3 extends Thread {
	private String threadName; 
	private int max;
	public Incrementer3(int max, String threadName) {
		this.max = max;
		this.threadName = threadName;
	}
    private int c = 0;
    public void increment() {
      c++;
      try {
		Thread.sleep(400);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    }
    public void run() {
    	while(c <this.max) {
    		
//  		  try{
//  				  Thread.sleep(300);
//  		  }
//  		  catch(InterruptedException e)
//  		  { 
//  			System.out.println(this.threadName + " -- " +e);
//  		  }  
        System.out.println(this.threadName + " -- " +c);
        increment();
  		}
    }

    public static void main(String args[]) throws InterruptedException {
        Thread t1 = new Incrementer3(100, "t1");
		Thread t2 = new Incrementer3(200, "t2");
		t1.start();
		t2.start();
		Thread.sleep(2000);
		t1.interrupt();
    }
}
