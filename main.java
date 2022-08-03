package file;

import java.util.Scanner;
import java.io.*;
class main
{
	public static void main(String[] args)
	{

		try {
			File Obj = new File("myfile.txt");
			if (Obj.createNewFile()) {
				System.out.println("File created: "
								+ Obj.getName());
			}
			else {
				Scanner Reader = new Scanner(Obj);
	            while (Reader.hasNextLine()) {
	                String data = Reader.next();
	                String num=Reader.next();
	                if(num.matches("[7-9] {1}[0-9] {9}"))
	                {
	                	File sc=new File(data+".txt");
	          
	                }       	

	            }
	            Reader.close();
				System.out.println("File already exists.");
			}
		}
		catch (IOException e) {
			System.out.println("An error has occurred.");
			e.printStackTrace();
		}
	}
}

