package create_and_hide_file;

import static create_and_hide_file.Operation_search_file.parseAllFiles;
import java.io.File;

public class ProgramFilesx86 
{
 
    
    public void ProgramFilesx86()
    {
        try {
          System.getenv("ProgramFiles(X86)");
        }
        catch (Exception e) {
          System.getenv("ProgramFiles");
        }
    }

    
   public static void main(String [] args) 
   {
        ProgramFilesx86 prog = new ProgramFilesx86();
        prog.ProgramFilesx86();
   }
}
