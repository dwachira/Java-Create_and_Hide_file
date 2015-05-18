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
			String content = "Dear Mum,\n" +
"How are you? I hope you are fairing on nicely and everything is alright. I am fine, just struggling with Homa (a cold). Here in Nairobi, it is chilling. Kuna baridi nyingi. On Thursday (10-07-2014), it was so cold that it was drizzling. Na haikuwa mvua – ni baridi tu.\n" +
"Yesterday(13-07-2014), I managed to go to Kamulu. I got there like at 0830 hrs. Njuki was sick kidogo. He also had Homa kali. However, hiyo homa ndio inaisha. All in all, kila kitu kiko sambamba huko. Those guys are working very hard. I went to the shamba and I saw they had tilled and prepared the shamba for planting. Especially, the area where there was a pit, opposite the greenhouse. I also saw that the pawpaw seedlings have grown tall. I saw them last week and so I was surprised to see tall seedlings. They have grown overnight.\n" +
"My attachment is going on well. Every day I am exposed to something new. This makes me happy. These days I leave the house before 0600 hrs and I get home at around 0700 hrs. I am happy with how things are going, although I get tired. Many at times, I get to the home, eat, and chat a little and then head to bed at 2100 hrs. \n" +
"Our church (PCEA Umoja) are building a big building which they intend to call “IMANI Towers”. We did the ground-breaking today. The English service was fixed together with the Kiswahili service. They say the building will cost about Ksh. 52 Million. The site of the building is just in the compound – next to the Multipurpose Hall. The contractor says that the building should be ready in 52 weeks, meaning that next year a time like now it should be complete.\n" +
"I met up with Maina wa akina Mama Nyaguthii (Kamulu) while coming from church. He was also from church in Tena. He told me to say hallo to everyone.\n" +
"I have never found time to go to Umoja Wendani Sacco to sign the Title deed. On weekdays, I am held up. They do not operate during the weekend. However, I shall try my best to find time and attend to those matters.\n" +
"Allow me to end this letter. Pass my regards to all and I wish you an awesome time. God bless you.\n" +
"Your Son,\n" +
"Wachira Mureithi";
                        
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



