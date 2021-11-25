public class Incrementer implements Runnable {
	private String name;
	private int max;
	public Incrementer(int max, String name) {
		this.max = max;
		this.name = name;
	}

    public void run() {
		for(int i = 0; i < this.max; i++ ) {
		  try{
			  Thread.sleep(400);
		  }
		  catch(InterruptedException e)
		  { 
			System.out.println("Name: "+ this.name +" --:" +e);
		  }  
          System.out.println("Name: "+ this.name +" --:" +i);
		}
    }

    public static void main(String args[]) throws InterruptedException {
        Thread t1 = new Thread(new Incrementer(10,"Theard1"));
		Thread t2 = new Thread(new Incrementer(10,"Theard2"));
		t1.start();
		t2.start();
		Thread.sleep(2000);
		t1.interrupt();
    }
}
