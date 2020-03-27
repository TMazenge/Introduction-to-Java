import java.io.*; 
import java.util.Arrays;
import java.util.*;

  
public class FileMerge  
{ 

    public static void main(String[] args) throws IOException   
    { 
         
        BufferedReader br = new BufferedReader(new FileReader(new File("file1.txt"))); 
          
        String line = br.readLine(); 
        ArrayList<String> list = new ArrayList<String>(); 
        while (line != null) {

            list.add(line);
            line = br.readLine(); 
        } 
          
        br = new BufferedReader(new FileReader("file2.txt")); 
          
        line = br.readLine(); 
        while(line != null){ 

            list.add(line); 
            line = br.readLine(); 
        } 
        
        Collections.sort(list);
        BufferedWriter writer = new BufferedWriter(new FileWriter("file3.txt"));
             
             
        for (String str : list){

                writer.write(str);
                writer.newLine();
            }  
          
        br.close(); 
        writer.close(); 

    } 


} 