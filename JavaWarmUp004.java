/*Расчет расстояния до места удара молнии. Звук в воздухе распространяется со скоростью приблизительно равной 1100 футам в секунду. 
Зная интервал времени между вспышкой молнии и звуком сопровождающим ее можно рассчитать расстояние. Допустим интервал 7,2 секунды.*/
import java.util.Scanner;
public class Java004 {
    public static void main (String [] args){
        System.out.println("Введите время от вспышки, до звука:");
        Scanner sc = new Scanner (System.in);
        double t = sc.nextDouble();
        System.out.println("До места удара "+t*1100+" футов");
    }
}
