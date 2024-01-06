import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double temp = 0;
        double temp2 = 0;
        sc.close();

        if(c > a && c > b && b > a ){
            temp = a;
            a = c;
            //b = b;
            c = temp;
        }else if(c > a && c > b && a > b){
            temp = a;
            temp2 = b;
            a = c;
            b = temp;
            c = temp2;
        }else if(b > a && b > c && c > a){
            temp = a;
            a = b;
            b = c;
            c = temp;
        }else if (b > a && b > c && a > c){
            temp =a;
            temp2 = c;
            a = b;
            b = temp;
            c = temp2;
        }else if(a > b && a > c && c > b){
            temp = b;
            //a = a;
            b = c;
            c = temp;
        }else if(a == b && c > a){
            temp = a;
            a = c;
            c = temp;
        }else if (a == c && b > a ){
            temp = a;
            a = b;
            b = temp;
        }

        

        if(a >= b + c){
            System.out.println("NAO FORMA TRIANGULO");
        }else{
        if(a * a == b * b + c * c){
            System.out.println("TRIANGULO RETANGULO");
        }
         if(Math.pow(a, 2) > Math.pow(b, 2) + Math.pow(c, 2)){
            System.out.println("TRIANGULO OBTUSANGULO");
        }
         if(Math.pow(a, 2) < Math.pow(b, 2) + Math.pow(c, 2)){
            System.out.println("TRIANGULO ACUTANGULO");
        }
        if(a == b && a == c && b == c){
            System.out.println("TRIANGULO EQUILATERO");
        }
         else if(a == b || a == c || c == b ){
            System.out.println("TRIANGULO ISOSCELES");
        }
        }
        

    
    }
}
