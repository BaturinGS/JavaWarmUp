// Сила тяжести на Луне примерно равна 17%, напишите программу, которая вычисляет ваш вес на Луне.

import java.util.Scanner;

public class JavaWarmUp001 {
    public static void main(String[] args){
        System.out.println("Введите свой вес в килограммах: ");
        Scanner in = new Scanner(System.in);
        double p = in.nextDouble();
        System.out.println("Ваш вес на луне равен: "+p*0.17);
    }
}
