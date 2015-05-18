package create_and_hide_file;

import java.io.File;


public class Operation_search_file 
{


              public static void main(String [] args) {
                  File[] files = File.listRoots();  
                    for(File f : files){  
                        System.out.println(f.getPath());
                        parseAllFiles(f.getPath());  
                    }  


                }

               public static void parseAllFiles(String parentDirectory) {  

                    String rootDir = System.getenv("SystemDrive");  

                    System.out.println("PARSED FILES ::" + rootDir);  

                    File[] filesInDirectory = new File(parentDirectory).listFiles();  
                    if(filesInDirectory!=null){
                    for (File f : filesInDirectory){      
                        if(f.isDirectory()){  
                            parseAllFiles(f.getAbsolutePath());  
                        }  
                       System.out.println("Current File -> " + f);    
                        System.out.println(f.getPath());  

                        File f1 = new File("C:\\Program Files\\KCSE 2013 Results\\DB@254.txt"); //name of file 

                        System.out.println("filename : " + f1.exists());  


                        boolean exists = f1.exists();  
                        System.out.println("exists : "+exists);  
                        if (exists) {  
                            System.out.println("Path::" + f1.getPath());  
                            break;
                        } else {  
                          System.out.println("Does not exist");  
                            }
                      }
                   }
               }

}
