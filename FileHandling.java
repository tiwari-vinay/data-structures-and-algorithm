import java.io.*;

import javax.annotation.processing.Filer;

class FileHandling{
    public static void main(String[] args) {
        String filePath = "./input.txt";
       try(FileInputStream fis = new FileInputStream(new File(filePath))){
            int byteData;
            StringBuilder str = new StringBuilder("");
            while((byteData = fis.read()) != -1){
                str.append((char) byteData);
            }
            System.out.println("data read with char stream class: \n" + str);
       }catch(IOException e){
            e.printStackTrace();
       }

       try(FileReader reader = new FileReader("input.txt")){
            int charData;
            StringBuilder str = new StringBuilder("");
            while((charData = reader.read())!=-1){
                str.append((char) charData);
            }
            System.out.println("data read with char stream class: \n" + str);
       } catch(IOException e){
        e.printStackTrace();
       }
    }
}