package iostream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class rewr {

	public static void main(String[] args) {
		
		String b ="how are you"; 
	// TODO Auto-generated method stub
		try
		{
		//FileOutputStream out=new FileOutputStream("D:\\io.txt");
		FileInputStream in=new FileInputStream("D:\\io.txt");
			//out.write(65);
			//out.close();
			//System.out.println("Success....");
			int charachter;
			
			while((charachter=in.read())!=-1) {
				System.out.print((char)charachter);
				//byte[] a=b.getBytes();
			}
			
			in.close();
		
			
		}
		catch(Exception e) {
			System.out.println(e);
			}
		

	}

}
