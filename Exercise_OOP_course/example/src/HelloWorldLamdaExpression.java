
public class HelloWorldLamdaExpression {
	 
	 public void sayHello() {
		 
		 HelloWorld anonymousSpanishGreeting = new HelloWorld() {    
	            public boolean greetSomeone(String someone,  String sometwo ) {
	                System.out.println("Hola, " + someone);
	                return false;
	            }
	        };
	        anonymousSpanishGreeting.greetSomeone("Mundo", "test1");
		  
//	      HelloWorld lamdaSpanishGreeting = (someone, sometwo) -> {
//	    	  System.out.println("Hola, " + someone);
//		  };
//	        
//		  lamdaSpanishGreeting.greetSomeone("Fernandes");
		 
	 }
	  
	 
	interface HelloWorld {
		public boolean greetSomeone(String someone, String sometwo);
	}

	public static void main(String... args) {
		HelloWorld lamdaSpanishGreeting = (someone, aa) -> {
			System.out.println("Hola, " + someone + " -- " +aa);
			return true;
		};
		lamdaSpanishGreeting.greetSomeone("Nicolas", "test");
		HelloWorldLamdaExpression t = new HelloWorldLamdaExpression();
		t.sayHello();
	}    

}
