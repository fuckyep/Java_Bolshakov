import java.util.Scanner;

public class first {
    public static void main (String[] args){
        System.out.println("Введите первое число");
        Scanner sc1 = new Scanner(System.in);

        if (sc1.hasNextInt()) {}
        else {
            System.out.println("Вы ввели не число.");
            System. exit(0);
        }
        int a = sc1.nextInt();

        System.out.println("Введите второе число");
        Scanner sc2 = new Scanner(System.in);
        if (sc2.hasNextInt()) {}
        else {
            System.out.println("Вы ввели не число.");
            System. exit(0);
        }
        int b = sc2.nextInt();

        if (a<b){
            System.out.println(a+"<"+b);
        }
        if (a>b){
            System.out.println(a+">"+b);
        }
        if (a==b){
            System.out.println(a+"="+b);
        }
        System.out.println(a+"+"+b+"="+(a+b));
        System.out.println(a+"-"+b+"="+(a-b));
        try {
            System.out.println(a+"/"+b+"="+(a/b));
        }
        catch (ArithmeticException e) {
            System.out.println("На ноль поделить не получится");
        }
        System.out.println(a+"*"+b+"="+(a*b));
    }
}








