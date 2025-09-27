import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner (System.in);
         //asignamos valora variables
         double suma = 0;
         double diferencia = 0;
         double multiplicacion= 0;
         double division = 0;
         // pedimos al usuario los datos
         System.out.println("ingrese un numero");
         double num1 = scanner.nextDouble();
            System.out.println("ingrese un segundo numero");
         double num2 = scanner.nextDouble(); 
         // hacemos suma y resta
         if (num1 > num2){
            suma = num1 + num2;
            diferencia = num1 - num2;
            System.out.println("la suma de: " + num1 + "+" + num2 + "=" + suma +"");
            System.out.println("la suma de: " + num1 + "+" + num2 + "=" + suma +"");
         }
         // hacemos multiplicacion y division
         if ( num1 == num2){
            multiplicacion = num1 * num2;
            System.out.println("la multiplicacion entre:" + num1 + "*" + num2 + "=" + multiplicacion +"");
            division = num1/num2;
            System.out.println("la division entre :" + num1 + "/" + num2 + "=" + division + "");
         } else {
            if (num2 == 0){
                System.out.println("error no se puede dividir por 0");
             }
             
            }
             scanner.close()
         }
       
  }
