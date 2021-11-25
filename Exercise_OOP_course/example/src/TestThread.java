public class TestThread extends Thread{
	private String threadName;
	
	public TestThread(String threadName) {
		this.threadName = threadName;
	}

	public void run() {
		for(int i = 0; i < 10; i++ ) {
			display(i);
		}
    }
	
	public void display(int i) {
		System.out.println("ThreadName: "+this.threadName +" -- " + i);
	}

    public static void main(String args[]) {
        Thread t1 = new TestThread("#1");
		Thread t2 = new TestThread("#2");
		t1.start();
		t2.start();
		
    }
}
