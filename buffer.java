import java.io.*;
public class buffer{
    public static void main(String args[]){
        FileReader ob=new FileReader(add.txt);
        BufferedReader on=new BufferedReader(ob);
        int a;
        while(a=on.read()!=-1){
            System.out.println((char)a);
        }
        on.close();
        on.close();
    }
    
}
