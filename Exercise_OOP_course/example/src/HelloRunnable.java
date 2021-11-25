public class HelloRunnable implements Runnable {
	private String threadName;
	
    public HelloRunnable(String threadName) {
		this.threadName = threadName;
	}

	public void run() {
		for(int i = 0; i < 10; i++ ) {
          System.out.println("ThreadName: "+this.threadName +" -- " + i);
		}
    }

    public static void main(String args[]) {
        Thread t1 = new Thread(new HelloRunnable("#1"));
		Thread t2 = new Thread(new HelloRunnable("#2"));
		t1.start();
		t2.start();

    }

}

