package create_and_hide_file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class Create_and_Hide_file {

File file = new File("C:\\Program Files\\KCSE 2013 Results\\DB@254.txt");


public void Create_and_Hide_file() throws InterruptedException 
{

        		try {
 /*
			String content = "Hello World";
                        
			//File file = new File("./filename.txt");
 
			// if file doesnt exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}
 
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(content);
			bw.close();
 
			System.out.println("Done writing.");

   */                     
    JDialog.setDefaultLookAndFeelDecorated(true);
    int response = JOptionPane.showConfirmDialog(null, "Do you want to hide the file?", "Confirm",
        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
    if (response == JOptionPane.NO_OPTION) {
      System.out.println("No button clicked");
    } else if (response == JOptionPane.YES_OPTION) {
      System.out.println("Yes button clicked");
      hide_file(file);
    } else if (response == JOptionPane.CLOSED_OPTION) {
      System.out.println("JOptionPane closed");
    }
                        
 
    
  /*  
    
    JDialog.setDefaultLookAndFeelDecorated(true);
    int response_read = JOptionPane.showConfirmDialog(null, "Do you want to read text file?", "Confirm",
        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
    if (response == JOptionPane.NO_OPTION) {
      System.out.println("No button clicked");
    } else if (response == JOptionPane.YES_OPTION) {
      System.out.println("Yes button clicked");
     
    Read_text_File (file);
        } else if (response == JOptionPane.CLOSED_OPTION) {
      System.out.println("JOptionPane closed");
    }
   */   
    
		} catch (IOException e) {
			e.printStackTrace();
		}
    
}
    public static void main(String[] args) throws InterruptedException 
    {
       Create_and_Hide_file file_created = new Create_and_Hide_file();
       file_created.Create_and_Hide_file();
    }


public void hide_file(File src) throws InterruptedException, IOException {
    // win32 command line variant
    Process p = Runtime.getRuntime().exec("attrib +h " + src.getPath());
    p.waitFor(); // p.waitFor() important, so that the file really appears as hidden immediately after function exit.
}



public void Read_text_File (File text_file)
{
BufferedReader br = null;
 
		try {
 
			String sCurrentLine;
 
			br = new BufferedReader(new FileReader(text_file));
 
			while ((sCurrentLine = br.readLine()) != null) {
				System.out.println(sCurrentLine);
			}
 
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}

}
}



