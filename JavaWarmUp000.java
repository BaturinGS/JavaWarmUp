//Напишите программу, которая считывает символы пока не встретится точка. Также предусмотрите вывод количества пробелов.
import java.util.Scanner;
public class JavaWarmUp000 {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        NChar(s);
    }
    public static void NChar(String s){
        String end = "";
        for (int i=0; i<s.length(); i++) {
            char c=s.charAt(i);
            end+=c;
            if (c=='.') {
                break;
            }
        }
        System.out.println(end);
        PrN(end);
    }
    public static void PrN(String s){
        int N=0;
        for (int i=0; i<s.length(); i++){
            char k=s.charAt(i);
            if (k == ' '){
             N++;
            }
        }
        System.out.println("В этой строке: "+N+" пробелов");
    }
}
