package Project1;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;
import java.io.IOException;
public class ProjectProgram {

	 static char ch;
	 
	public static void main(String[] args) {
		

		Scanner ss = new Scanner (System.in);
		int userid ;
		System.out.println("=====================================");
		System.out.println("Welcome to LockedMe.com Application");
		System.out.println("===================================== \n" );
		
		System.out.println("This application is developed by Company Lockers Pvt. Ltd. \n");

		System.out.println("This application allows the user to  sort files, add new file, delete file and search for any file the user want \n");
		
		
		
		System.out.println("Enter  User's Full Name: \n " );
		String username = ss.nextLine();
	
		
		System.out.println("Enter  User's ID: \n"  );
		 userid = ss.nextInt();
		  System.out.println("\n");
		  
		 System.out.println("The user is " +username +" with ID = " +userid );
		 
		 System.out.println(" \n ************************************************ \n"); 
	
		Scanner s = new Scanner(System.in);
		
		
			System.out.println("LockMe.com Operations : \n");
			
			do {
				
				System.out.println("1. Sort  Files in Ascending Order ");
				System.out.println("2. Files Operations");
				System.out.println("3. Close the Application");
				System.out.println("\n Enter your choice please :");
				
				int choice=ss.nextInt();
				
				
				switch (choice) {
					
				case 1 :
					try {
							
						System.out.println("Enter the path of file that contains the files");
					String path = ss.next();
					Sort(path);}
					catch (Exception e){System.out.println("Error" +e);}
						break;
					
					case 2 :
						
							do {
								System.out.println("1.Add File");
								System.out.println("2.Delete File");
								System.out.println("3.Search");
								System.out.println("4.Navigate to Main Context ");
						
						int choice2 = ss.nextInt();
						switch (choice2) {
						
						case 1:
							
						try {
						System.out.println("Enter the name of file you want to add");
						String name = s.nextLine();
						add(name);}
						catch (Exception e) {System.out.println("Error:" +e);}
							
							break;
					case 2 :
						System.out.println("Enter the name of file you want to delete");
						String name1 = s.nextLine();
						delete(name1);
						break;
					
					case 3:
						
						System.out.println("Write the name of file you want to search for");
						String name2 = s.nextLine();
						search(name2);
						break;
					
					case 4:
						
						continue;
						
					default : System.out.println("Wrong Entry ");
					break;
						}
						System.out.println("Do you want to continue (Type y or n) ");
			            ch = ss.next().charAt(0);
							}while (ch == 'Y'|| ch == 'y');
					
					case 3 :
						
						System.out.println("Application is Closed");
						System.exit(0);
						break;
					
					default : System.out.println("Wrong Entry ");
					break;
					}
				System.out.println("Do you want to continue (Type y or n) ");
	            ch = ss.next().charAt(0);
				
		}while (ch == 'Y'|| ch == 'y' );
	}
	                              
	
 public static void add(String name) {
	 try{
		 File file = new File ("D:/Project/Files/ " +name );
		 file.createNewFile(); 
		 System.out.println("File is Created");}
	 catch(Exception e){System.out.println("Error "+e);}
	 }	
 
 public static void delete(String name1) {
	 File Dfile = new File ("D:/Project/Files/ "+name1 );
	 
	  if(Dfile.exists()) {
		  Dfile.delete();
		  System.out.println("File is Deleted");
	  }
	  else { System.out.println("File Not Found");}
 	}
 
 public static void search (String name2){
	 File Sfile = new File(name2);
	 
	 if(Sfile.exists()){
		 System.out.println("File is  Found");}

		 else {System.out.println("File not Found");
		 	}	
 	}
 
 public static void Sort(String path) {
	 try{
	 File FilesPath = new File (path);
	 String contents[] = FilesPath.list();
	 
	 System.out.println("List of Files in Ascending Order");
	 for (int i=0; i<contents.length;i++){
		 System.out.println(contents[i]);}
	 } catch (Exception e){System.out.println("Error "+e );}
	 
 	}
}

