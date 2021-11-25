import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStream {
	public static void main(String[] args)
	{
		CharacterStream out = new CharacterStream();
	   try(
			BufferedReader in = new BufferedReader(new FileReader("customersIn.txt"));
		) 
	   {
			String l;
            while ((l = in.readLine()) != null) {
            	out.writeData("c:\\temp\\customersOut.txt", l, true);
            }
	   }
	   catch( IOException e)
	   {
		   System.out.println("Error opening the file out.txt. "
							  + e.getMessage());
		   System.exit(0);
	   }
	}
	
	private void writeData(String fileName, String data, boolean isExpand) throws IOException {
		BufferedWriter out = new BufferedWriter(new FileWriter(fileName, isExpand));
		out.write(data);
    	out.newLine();
    	out.close();
	}
}