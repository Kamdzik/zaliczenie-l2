import java.lang.Math;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    Scanner scaner = new Scanner(System.in);
    
  System.out.println("podaj a"); 
int a = scaner.nextInt();
  System.out.println("podaj b"); 
int b = scaner.nextInt();
  System.out.println("podaj c");
int c = scaner.nextInt();

    System.out.println("równanie: " + a + "x^2 * " + b + "x + " + c);
    
double delta = (b*b) - (4*a*c);
System.out.println("delta: " + delta);

    if(delta > 0){
  double pierwiastekdelta = Math.sqrt(delta); 
      System.out.println("pierwiastek delty: "+pierwiastekdelta);
  double x1 = ((-b) - pierwiastekdelta)/(2*a);
  double x2 = ((-b) + pierwiastekdelta)/(2*a); 
  System.out.println("2 Pierwiastki:  x1: " + x1 + " x2: " + x2 );  
    }
    
  if(delta == 0){
    double x0 = -b/(2*a); 
      System.out.println("1 Pierwiastek:  x0: " + x0);  
      }

  if(delta < 0){
      System.out.println("Brak rozwiązań rzeczywistych");  
      }
    
  
}
}