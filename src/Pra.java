import java.io.*;
import java.net.*;
public class Pra {
    public static void main(String[] args){
       FileOutputStream fout=null;
      // Byte[] b={7,-2,5,6,3};
       int n;
       try{
           fout=new FileOutputStream("c:\\temp\\data.txt");
          while ((n=System.in.read())!=-1){
                fout.write(n);
           }
          fout.close();
       }catch (IOException e){
           e.printStackTrace();
       }
    }
}