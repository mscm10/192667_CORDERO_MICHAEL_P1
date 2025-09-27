import java.util.Scanner;


public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        // pedimos al usuario las notas
        System.out.println("ingrese la primera nota: ");
        double nota1 = scanner.nextDouble();
        System.out.println("ingrese la segunda nota: ");
        double nota2 = scanner.nextDouble();
        System.out.println("ingrese la tercera nota: ");
        double nota3 = scanner.nextDouble();
        // calculamos el promedio
        double promedio = (nota1 + nota2 + nota3) / 3;
        System.out.println("el promedio es: " + promedio);
        // validamos las notas y mostramos el resultado
        if (nota1 < 0 ) && (nota1 > 5.0) &&  (nota2 < 0 ) &&  (nota2 > 5.0) && (nota3 < 0 ) && (nota3 > 5.0){
            System.out.println("nota no valida");
        } else {
            if (promedio >= 4.5){
                System.out.println("promocionado");
            } else {
                if (4.0 <= promedio >= 4.5){
                    System.out.println("regular");
                } else {
                    if (promdeio < 4.0){
                        System.out.println("reprobado");
                    }}
                    scanner.close();
                }
              }
            }
        }
        

