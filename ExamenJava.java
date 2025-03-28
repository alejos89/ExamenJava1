import java.util.Scanner;

public class ExamenJava {

    public static void main(String[] args) {
        
        System.out.println("Primera serie");
        System.out.println("");


             Scanner numeros=new Scanner(System.in);
             System.out.println("Ingrese el valor de x");
             int x=numeros.nextInt();
       int resultado= x+(2*x);
             System.out.println("El resultado de la primera ecuación es "+resultado);
             System.out.println("---------------------");

              System.out.println("Ingrese el número 5");
            int x2=numeros.nextInt();

            int resultado2= x2*x2-(3*x2);
            System.out.println("El resultado de la segunda ecuación es "+resultado2);
            System.out.println("---------------------");

            System.out.println("Ingrese el primer número");
            int num1=numeros.nextInt();

            System.out.println("Ingrese el segundo número");
            int num2=numeros.nextInt();

            System.out.println("Ingrese el tercer número");
            int num3=numeros.nextInt();

            int resultado3=(num1+num2+num3)/3;
            System.out.println("El promedio de los 3 números es de "+resultado3);
            System.out.println("---------------------");

            System.out.println("Ingrese el valor de x");
            int x3=numeros.nextInt();

            int resultado4=(x3*x3)+2*(x3+1);
            System.out.println("El resultado de la cuarta ecuación es "+resultado4);

            System.out.println("---------------------");
            System.out.println("Segunda serie");


            Scanner menu=new Scanner(System.in);
            int Menu;
            do {
                System.out.println("[1]Calcular la moda");
                System.out.println("[2]La mitad es");
                System.out.println("[3]Dí Hola mundo");
                System.out.println("[4]Salir");

                System.out.println("Ingrese una opción");
                Menu=menu.nextInt();

                switch (Menu) {
                    case 1:
                    int[] listaN = {5, 8, 12, 5, 9, 7, 12, 14, 8, 5, 9, 12, 7, 5, 8, 14, 8, 12, 7, 9};
            
                    int moda = listaN[0];
                    int numeroM = 0;
            
                    for (int i = 0; i < listaN.length; i++) {
                        int numeroo = 0;
                        for (int j = 0; j < listaN.length; j++) {
                            if (listaN[j] == listaN[i]) {
                                numeroo++;
                            }
                        }
                        if (numeroo > numeroM) {
                            numeroM = numeroo;
                            moda = listaN[i];
                        }
                    }
            
                    System.out.println("La moda es: " + moda);
            
                    break;

                        case 2:
                        System.out.println("Ingrese un número");
                        int num4=numeros.nextInt();

                        int resultado5=num4/2;
                        System.out.println("La mitad de "+num4+" es "+resultado5);
                        
                        break;

                        case 3:
                        System.out.println("Hola mundo :D");
                        
                        break;

                        case 4:
                       System.out.println("Saliendo del programa");
                       
                        break;

                        
                
                    default:
                      System.out.println("Opción no valida");
                        break;
                }
                System.out.println("");
                
            } while (Menu!=4);

           
                    
            


            



            
            
       
    }
}