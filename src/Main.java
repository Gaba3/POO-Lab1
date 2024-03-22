import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int opcion;
        int a, b;
        do{
            System.out.println("Bienvenido al programa, selecciona una opcion:");
            System.out.printf("%n1. Sumar %n2. Restar %n3. Multiplicar %n4. Dividir %n5. Salir %n");
            opcion= sc.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("Escriba el primer numero: ");
                    a=sc.nextInt();
                    System.out.println("Escriba el segundo numero: ");
                    b=sc.nextInt();
                    System.out.print("Respuesta = ");
                    System.out.println(sumar(a,b));
                    break;
                case 2:
                    System.out.println("Escriba el primer numero: ");
                    a=sc.nextInt();
                    System.out.println("Escriba el segundo numero: ");
                    b=sc.nextInt();
                    System.out.print("Respuesta = ");
                    System.out.println(restar(a,b));
                    break;
                case 3:
                    System.out.println("Escriba el primer numero: ");
                    a=sc.nextInt();
                    System.out.println("Escriba el segundo numero: ");
                    b=sc.nextInt();
                    System.out.print("Respuesta = ");
                    System.out.println(multiplicar(a,b));
                    break;
                case 4:
                    System.out.println("Escriba el primer numero: ");
                    a=sc.nextInt();
                    System.out.println("Escriba el segundo numero: ");
                    b=sc.nextInt();
                    System.out.print("Respuesta = ");
                    dividir(a,b);
                    break;
                case 5:
                    System.out.println("Saliendo del programa ...");
                    break;
            }
        }while(opcion != 5);


    }
    public static int sumar(int a, int b){
        return a + b;
    }
    public static int restar(int a, int b){
        return a - b;
    }

    public static int multiplicar(int a, int b){
        return a * b;
    }

    public static void dividir(int a, int b){
        if(b==0){
            System.out.println("Operacion no valida");
        }else {
            System.out.println(a / b);
        }
    }
}