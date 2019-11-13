package laba_16;
import java.io.IOException;
import java.util.Scanner;
interface IFunc {
	
double function(double x, double y);

}
public class Main {


 static double f1(double x, double y) {
 return (x/Math.abs(Math.pow(x,3) + Math.pow(y,3)))+(y/Math.abs(x+y));
 }

 static double f3(double a, double b, IFunc f) {
 return Math.pow(f.function(a + Math.sqrt(b), b - Math.sqrt(a)), 2) - f.function(1, a + b);
 }


 public static void main(String[] args) throws IOException {



 Scanner sc = new Scanner(System.in);

 System.out.print("a = ? ");
 double a = sc.nextDouble();

 System.out.print("b = ? ");
 double b = sc.nextDouble();


 double c = Math.pow(f1(a + Math.sqrt(b), b - Math.sqrt(a)), 2) - f1(1, a + b);
 System.out.println("c = " + c);


 IFunc f2 = (x, y) -> (x/Math.abs(Math.pow(x,3) + Math.pow(y,3)))+(y/Math.abs(x+y));
 double d = f3(a, b, f2);
 System.out.println("d = " + d);
 }
}
