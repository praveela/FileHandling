import java.util.*;
import java.io.*;
class ReadChar{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        try{
            File name=new File("Text.txt");
            FileInputStream fis=new FileInputStream(name);
            BufferedReader br=new BufferedReader(new InputStreamReader(fis));
            String Line;
            int k=0;
            while((Line=br.readLine())!=null)
            {
                if(Line=="")
                {
                    k+=1;
                }
                k+=Line.length();
            }
            System.out.println(k);
            br.close();
            fis.close();
        }
        catch(IOException e)
        {
            System.err.println("Error: "+e.getMessage());
        }
    }
}