import  java.io.File;
import  java.io.FileInputStream;
import  java.io.FileNotFoundException;
import  java.io.IOException;

public class Main
{
    public static void main(String[] args)
    {
        File                f1;
        FileInputStream     fis;
        byte[]              buf;

        f1 = new File("./fichier.txt");
        fis = null;
        buf = new byte[8];

        try
        {
            fis = new FileInputStream(f1);
            System.out.println("Lecture du fichier");
            try
            {
                while ((fis.read(buf)) >= 0)
                {   
                    for (int i = 0, lim = buf.length; i < lim; i++)
                    {   
                        System.out.print((char)(buf[i]));
                    }   

                    buf = new byte[buf.length];
                }   
            }
            catch (IOException e)
            {
                System.out.println("IOException during FileInputStream.read().");
            }
             
        }   
        catch (FileNotFoundException e)
        {   
            System.out.println("File not found");
        }   
        finally
        {   
            try 
            {   
                if (fis != null)
                {
                    fis.close();
                    System.out.println("Fermeture du fichier");
                }
            }
            catch (IOException e)
            {
                System.out.println("IOException during FileInputStream.close().");
            }
        }
    }
}
                                     
