import java.io.File;
import java.io.IOException;
import java.util.*;
import java.io.FileWriter;
class BasicFilops{
    public static void main(String[] args) {
         
      Scanner sc = new Scanner(System.in); 
      
      int c=0;
      while(c!=9){
        System.out.println("1.Create a new folder "); 
        System.out.println("2.Create a new text file"); 
        System.out.println("3.Write into a text file");
        System.out.println("4.Append data to a text file");
        System.out.println("5.Rename a file");
        System.out.println("6.Delete a file");
        System.out.println("7.Exit"); 
      System.out.println("Please Enter the Menu:");
      int num=sc.nextInt();
      switch(num){
        case 1:{
            System.out.println("Please enter the Folder-name to be Created:  ");  
            String path = sc.next();  
            System.out.println("Please enter the Path where you wish to save a new folder");  
            path = path+sc.next();  
            File gl=new File(path);
            boolean b=gl.mkdir();
            if(b==false){
              System.out.println("Folder is not created");
            }
            else{
              System.out.println("Folder is created");
            }
            break;
        }

        case 2:{
            try{
              System.out.println("Enter the path where you wish to create the file: "); 
              String path1 = sc.next();  
            System.out.println("Enter the name of the file :");  
              path1 = path1+sc.next();  
              File k=new File(path1);
              if(k.createNewFile()){
                 System.out.println("File is created");   
              }
              else{
                System.out.println("File already exists!!");
              }
            }
            catch(IOException e1){
              System.out.println("Error occured while creating the file");
              e1.printStackTrace();
            }
            break;
        }
        case 3:{
        try{
          System.out.println("Enter path of  the file: "); 
          String pt = sc.next();  
          FileWriter f2=new FileWriter(pt);
          f2.write("This is line 1");
          f2.close();
          System.out.println("Successfully written into the file");
        }
        catch(IOException e2){
          System.out.println("Error occured while writing into the file");
          e2.printStackTrace();
        }
        break;
      }
      case 4:{
      try
      {
        System.out.println("Enter the data the file: "); 
          String path3 = sc.next();  
          FileWriter f3 = new FileWriter(path3, true);
         String s2="This is appended text";
         f3.write(s2);
         f3.close();
      }
      catch(IOException e3){
        System.out.println("Error occured while appending text into the file");
          e3.printStackTrace();
      }
      break;

    }
    case 5:{
        System.out.println("Enter the path of existing file: "); 
          String path4 = sc.next(); 
          System.out.println("Enter the path the new file: "); 
          String path5=sc.next();
          File o=new File(path4);
          File neww=new File(path5);
          boolean flag=o.renameTo(neww);
          if(flag==true){
            System.out.println("File renamed successfully");
          }
          else{
            System.out.println("Operation Failed");
          }
          break;
      }
      case 6:{
        System.out.println("Enter the path of file you want to delete: "); 
          String p6 = sc.next(); 
          File f6=new File(p6);
          boolean flag=f6.delete();
          if(flag==true){
            System.out.println("File deleted successfully");
          }
          else{
            System.out.println("Operation Failed");
          }
          break;
      }
      case 7:{
        c=9;
          break;
      }
    }
      }

  
    }
}