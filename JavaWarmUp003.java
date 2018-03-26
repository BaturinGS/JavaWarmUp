//Напишите метод, заменяющий в строке все вхождения слова «бяка» на «вырезано цензурой».
import java.util.Scanner;
public class Java003 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String text2 = text.replaceAll("бяка","/вырезано цензурой/" );
        text2 = text2.replaceAll("Бяка","/вырезано цензурой/" );
        System.out.println(text2);
    }
}
