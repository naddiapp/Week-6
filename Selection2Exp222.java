import java.util.Scanner;

public class Selection2Exp222 {
    public static void main(String[] args) {
        Scanner input22 = new Scanner(System.in);
        int angle1, angle2, angle3, totalAngle;

        System.out.println("Input angle1 = ");
        angle1 = input22.nextInt();
        System.out.println("Input angle2 = ");
        angle2 = input22.nextInt();
        System.out.println("Input angle3 = ");
        angle3 = input22.nextInt();
        totalAngle = angle1+angle2+angle3;

        if(totalAngle == 180) {
            if((angle1==90 || angle2==90 || angle3==90)) {
                System.out.println("Right triangle");
            }else if(angle1==angle2&&angle2==angle3) {
                System.out.println("Equilateral triangle");
            }else if (angle1==angle2||angle1==angle3||angle2==angle3) {
                System.out.println("Isosceles triangle"); 
            }else 
                System.out.println("Any triangle"); 
            }else         
                System.out.println("Not a triangle");
            }   
         }
        
