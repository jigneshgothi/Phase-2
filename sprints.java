import java.io.File;
import java.util.*;
public class sprints extends features {
	String filename;
	String n;

	static String ch2;
	static int ch1;
	static Scanner sc = new Scanner(System.in);
	static boolean c=true,m = true;
        
		
	static void display()
	{
		File f = null;
		String[] paths;
		System.out.println("Files in Asceding Order : ");     
		try {    
		    
			f = new File("D:/Documents/Infostretch Coorporation/Full Stack Development Training/Phase 2/Project");
		    paths = f.list();
		    for(String path:paths) {
		    	System.out.println(path);
		    }
		       
		} 
		catch(Exception e) {
			e.printStackTrace();
		}
	}
		
	static void operation()
	{
		while(c==true){
			if(c==true){
				System.out.println(" A. Add file \n B. Delete file \n C. Search file \n D. exit");
				System.out.print("\n Enter the file operation action :\n");
				ch2=sc.next();
				switch(ch2){
		        
					case "a" :
						create();
						break;
		      
					case "b":
						delete();
						break;
						
					case "c":
						search();
						break;
						
					case "d":
						c=false;
						break;
		            
					case "A" :
						create();
						break;
		      
					case "B":
						delete();
						break;
						
					case "C":
						search();
						break;
						
					case "D":
						c=false;
						break;
						
					default:
						System.out.println("plz select correct option");
						break;
				}
			}
			else{
				break;
			}
		}
	}

	public static void main(String[] args) {
		while(m == true) {
		if(m==true){
			System.out.println("1. Existing Files in a Directory \n 2. Operation of the files(Add, Delete and Search) \n 3. Closing the Application");
			System.out.print("\n Enter the Action related to files :\n");
			ch1=sc.nextInt();
			switch(ch1){
	        
				case 1:
					display();
					break;
	      
				case 2:
					operation();
					break;
					
				case 3:
					m = false;
					break;
					
				default:
					System.out.println("plz select correct option");
					break;
			}
		}
		else{
			break;
		}
	}
	
	}
}