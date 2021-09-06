
import java.util.Scanner;
import java.io.*;

import java.nio.file.*;
import java.util.*;
public class features {
	static String filename;
	 
    String n,ch;

	static String sname;
    static Scanner sc = new Scanner(System.in);
   
	static void create()
	{
	    System.out.println("plz enter name of file to be create");
	    filename=sc.next();
	    Path path = Paths.get("D:/Documents/Infostretch Coorporation/Full Stack Development Training/Phase 2/Project/"+filename+".txt"); 
	   
	    try   
	    {  
	         Path p= Files.createFile(path);   
	         if(p != null)
	         {
	            System.out.println("file created ");  
	         }
	         else{
	            System.out.println("file exist ");
	         }
	    }   
	    catch (IOException e)   
	    {  
	    e.printStackTrace();  
	    } 
	          
	}
	static void delete()
	{
	    try  
	    {   
	        System.out.println("plz enter name of file to be delete");
	        filename=sc.next();      
	        File f= new File("D:/Documents/Infostretch Coorporation/Full Stack Development Training/Phase 2/Project/"+filename);         
	        if(f.delete())                      
	        {  
	            System.out.println(f.getName() + " deleted");    
	        }  
	        else  
	        {  
	            System.out.println("File not found");  
	        }  
	    }  
	    catch(Exception e)  
	    {  
	        e.printStackTrace();  
	    }  
	}
	static void search()
	{
	    System.out.println("enter file name to be search");
	    sname = sc.next();
	    File f = new File("D:/Documents/Infostretch Coorporation/Full Stack Development Training/Phase 2/Project");
	    ArrayList<String> names = new ArrayList<String>(Arrays.asList(f.list())); 
	    String[] item = names.toArray(new String[names.size()]);  
	   
	    Arrays.sort(item);
	  int result=  Arrays.binarySearch(item, 0, item.length, sname);
	    if(result<0) {
	        System.out.println("File not found");
	    }else {
	        System.out.println("File present at position "+result);
	        searchFileOperation();
	      
	    }
	 
	}
	static void searchFileOperation() {
		System.out.println("1. want to see contain of file\n 2. want to add data to the file\n 3.back to menu");
        int yes = sc.nextInt();
       if(yes==1) 
       {
    	   try{
    		   FileInputStream fis = new FileInputStream("D:/Documents/Infostretch Coorporation/Full Stack Development Training/Phase 2/Project/"+sname);        
    		    BufferedInputStream bis = new BufferedInputStream(fis);
	            
	            int ch;
	            while( (ch=bis.read()) != -1){		
	            	 System.out.print((char)ch);  
	            }
	            bis.close();
	        }catch(IOException e){
	            System.out.println(e);
	        }
    	   searchFileOperation();
       }else if(yes==2)
        {
            try{
            	
            DataInputStream dis = new DataInputStream(System.in);
            FileOutputStream fos = new FileOutputStream("D:/Documents/Infostretch Coorporation/Full Stack Development Training/Phase 2/Project/"+sname,true);
 
            System.out.println("enter the data");
            int ch;
            while( (ch=dis.read()) != '\n'){		
                fos.write(ch);
            }
  
            fos.close();
            
            System.out.println("Data added to file "+sname);
        }catch(IOException e){
            System.out.println(e);
        }
            searchFileOperation();
        } else if(yes==3){
        	
           sprints.operation();
        }else {
        	System.out.println("plz enter correct data");
        }
        	
	}

}

