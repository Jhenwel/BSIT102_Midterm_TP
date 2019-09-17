import java.io.File;
import java.io.IOException
import java.io.Writer;
import java.io.FileWriter;
import java.util.Scanner;

public class fin{

    public static void main(String[] args)throws IOException {
    	
    	
    
     	Scanner Findfile = new Scanner(System.in);
    	
    	System.out.println("Type Your InfoFile Name:");
    	
    	FileWriter file = new FileWriter(Findfile.next()+".fldr");
    	
    	System.out.println("Write Folder Name Below:");
    	
    	file.write(Findfile.next());
    	file.close();
    	
    	
    	
    }
    
    
}