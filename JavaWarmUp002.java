 //Напишите метод, который будет увеличивать заданный элемент массива на 10%.
 public class Java002 {
    public static void main (String[] args){
        //Напишите метод, который будет увеличивать заданный элемент массива на 10%.
        int k[] ={1,2,3,4,5,10};
        double c [] = {2,3,4.5,7.3};
        k[5]=addT(k[5]);
        c[0]=addT(c[0]);
        System.out.println(k[5]+" "+c[0]);
    }
     static int addT(int a){
        a+=a*0.10;
        return a;
    }
     static double addT(double a){
        a+=a*0.10;
        return a;
    }
}
