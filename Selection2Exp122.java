import java.util.Scanner;
public class Selection2Exp122 {
    public static void main(String[] args) {
        Scanner input22 = new Scanner(System.in);
        int year;
        System.out.print("Input year= ");
        year = input22.nextInt();

        if (year%4 == 0) 
            if (year%100 == 0 && year%400 ==0) 
                 System.out.println("Leap year");
            else 
                 System.out.println("Not a leap year");
        else
            System.out.println("Not a leap year");
    }
}