import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
    //realizar un menu que te de 5 opciones que nos dibuje con asteriscos un cuadrado
    //un triangulo, ambos sin relleno y salir del menu
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion =0;
        do{
            mostrarMenu();
            opcion= scanner.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Elige la dimension de la figura: ");
                    int dimensionC = scanner.nextInt();
                    pintarCuadrado(dimensionC);
                    break;
                case 2:
                    System.out.println("Elige la dimension de la figura: ");
                    int dimensionCV = scanner.nextInt();
                    pintarCuadradoVacio(dimensionCV);
                    break;
                case 3:
                    System.out.println("Elige la dimension de la figura: ");
                    int dimensionT = scanner.nextInt();
                    dibujarTriangulo(dimensionT);
                    break;
                case 4:
                    System.out.println("Elige la dimension de la figura: ");
                    int dimensionTV = scanner.nextInt();
                    dibujarTrianguloVacio(dimensionTV);


            }
        }while(opcion!=5);
        scanner.close();
    }
    //metodo de mostrar el menu
    public static void mostrarMenu(){
        System.out.println("Menú figuras. Seleccione una opción: ");
        System.out.println("-----------------------------------------------");
        System.out.println("1- Cuadrado ");
        System.out.println("2- Cuadrado sin relleno ");
        System.out.println("3- Triangulo ");
        System.out.println("4- Triangulo sin relleno ");
        System.out.println("5- Salir del menú ");
        System.out.println("-----------------------------------------------");
    }

    /**
     * Dibujar un cuadrado con relleno formado por astericos
     * @params n Es el lado del cuadrado
     */
    public static void pintarCuadrado(int n){
        for(int i =0; i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(" * "); //print normal es sin salto de linea
            }
            //salto de linea al final de cada fila
            System.out.println();
        }
    }
    public static void pintarCuadradoVacio(int n){
        for(int i =0; i<n;i++){
            if(i==0 || i==n-1){
                for(int j=0; j<n;j++){
                    System.out.print(" * ");
                }
            }else{
                for(int j=0;j<n;j++){
                    if(j==0||j==n-1){
                        System.out.print(" * ");
                    }else{
                        System.out.print("   ");
                    }
                }
            }
            System.out.println();//salt de linea
        }
    }
    public static void dibujarTriangulo(int altura){
        for(int i=0; i<altura;i++){
            for(int j=0;j<altura-i;j++){
                //primer bucle anidado para imprimir los espacios
                System.out.print("   ");
            }
            for(int k=0;k<=i*2;k++){
                //imprimir los asteriscos al final de cada fila
                System.out.print(" * ");
            }
            System.out.println();//salto de linea
        }
    }
    public static void dibujarTrianguloVacio(int altura){
        System.out.println();
        for(int i=0;i<altura;i++){
            for(int j=0;j<=i;j++){
                if(i==0||i==altura-1||j==0||j==i){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}