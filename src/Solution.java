import java.util.Scanner;

public class Solution{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));  //El método .matches() ya viene por defecto en Java. Forma parte de la clase String y no requiere una importación especial.
        }//while
        in.close(); //Aqui no tiene sentido usar close() ya que la finalidad de la línea 7 es ejecutar siempre y cuando haya más direcciones ip, es útil cuando se lee un archivo, ahi si hay fin
        //para simular el final hacemos ctrl+z+enter 
    }//main
}// class Solution

class MyRegex {
    String num = "([01]?\\d{1,2}|2[0-4]\\d|25[0-5])";
    String pattern = num + "." +  num + "." +  num + "." + num;
}// class MyRegex