import java.io.BufferedReader;
import java.io.IOException;
import java.io.EOFException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
//
public class CheckedException {
	
//	public static void main(String[] args){
////		 BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
////		 String inData;
////		 int a = 0;
////		 
//		 TreeSet<Integer> list = new TreeSet<Integer>();
//		 list.add(2);
//		 list.add(3);
//		 list.add(1);
//		 list.add(3);
//		 list.add(4);
//		 list.add(2);
//		 int max = -1;
//		 for(Integer value : list) {
//			 System.out.println(value);
//		 }
//		 if(max >=  0) {
//			 System.out.println(max);
//		 } 
////		 (xxx) -> System.out.println(xxx);
//	}
	
	public static void main(String[] args)
			throws MYException, Exception
	{
		//  aas
		/*
		 aa
		 sd
		 dff
		 * */
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String inData = null;
		try {
			inData = in.readLine();
			if("aaa".equals(inData)) {
				throw new RuntimeException("Hoan Test");
			}
			System.out.println("Try: " );
		} catch (Exception e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("Exception: " + e.getMessage());
			throw new MYException("Hoan Test" + "Exception: " + e.getMessage());
		} finally {
			System.out.println("finally: " );
		}
		System.out.println("Data: " + inData );
	}
	
}