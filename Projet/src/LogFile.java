import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


    public class LogFile extends Target {
      protected File file;
      public LogFile(String Path){
         file = new File(Path);
        }
@Override
      public void traitement(String msg) {
         
         FileWriter writer = null;
     try{
       writer = new FileWriter(file, true);
       writer.write("\n" + msg);
       writer.close();
       } catch(IOException e) {
            e.printStackTrace();
        
      }
   }
    }
    

