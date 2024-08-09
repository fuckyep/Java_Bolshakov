import java.util.Scanner;

public class second {
    public static void main (String[] args){
        System.out.println("Введите первую строку:");
        Scanner sc1 = new Scanner(System.in);
        String a = sc1.nextLine();

        System.out.println("Введите вторую строку:");
        Scanner sc2 = new Scanner(System.in);
        String b = sc2.nextLine();

        if(a.equals(b)){
            System.out.println("Строки идентичны");
        }
        else {
            System.out.println("Строки не идентичны");

        }
    }
}
