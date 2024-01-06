import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double aux = 0;

        double[] arr = {a,b,c};

        sc.close();

        for(int i = 0; i<3; i++){
            for(int j = 0; j<2; j++){
                if(arr[j] < arr[j + 1]){
                    aux = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = aux;
                }
            }
        }

        a = arr[0];
        b = arr[1];
        c = arr[2];

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
