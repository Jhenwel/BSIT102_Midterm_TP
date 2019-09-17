import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class Fout {

    public static void main(String[] args)throws IOException {
    	
    	Scanner file,read;
    	
    	System.out.println("Input InfoFile Name:");
    	file = new Scanner(System.in);
    	File f = new File(file.next()+".fldr");
    	
    	read = new Scanner(f);
    	System.out.print(read.next());
    	
    }
    
    
}