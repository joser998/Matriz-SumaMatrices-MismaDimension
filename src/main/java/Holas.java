import java.util.Scanner;
public class Holas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Suma de Matrices misma Dimension.\n");
        System.out.print("Inserta numero de Filas: ");
        int nFilas=sc.nextInt();
        System.out.print("Inserta numero de Columnas: ");
        int nColumnas=sc.nextInt();
        
        int[][] matriz1 = new int[nFilas][nColumnas];
        int[][] matriz2 = new int[nFilas][nColumnas];
        int[][] matrizResultante = new int[nFilas][nColumnas];

        //Guardar Matriz1 
        System.out.println("\nGuardar datos Matriz1: ");
        for(int i=0; i<matriz1.length; i++){
            for(int j=0; j<matriz1.length; j++){
                System.out.print("Matriz1 ["+i+"]["+j+"]: ");
                matriz1[i][j]=sc.nextInt();
            }
        }
        
        //Guardar Matriz2
        System.out.println("\nGuardar datos Matriz2: ");
        for(int i=0; i<matriz2.length; i++){
            for(int j=0; j<matriz2.length; j++){
                System.out.print("Matriz2 ["+i+"]["+j+"]: ");
                matriz2[i][j]=sc.nextInt();
            }
        }
        
        //Sumatoria de las dos Matrices
        for(int i=0; i<matriz1.length; i++){
            for(int j=0; j<matriz2.length; j++){
                matrizResultante[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        
        //Impresion de Matrices
        System.out.println("\nMatriz 1:");
        for(int i=0; i<matriz1.length; i++){
            for(int j=0; j<matriz1.length; j++){
                System.out.print("["+matriz1[i][j]+"]" + " ");
            }
                System.out.println();
        }
        
        System.out.println("\nMatriz 2:");
        for(int i=0; i<matriz2.length; i++){
            for(int j=0; j<matriz2.length; j++){
                System.out.print("["+matriz2[i][j]+"]" + " ");
            }
                System.out.println();
        }
        
        System.out.println("\nMatriz Resultante: (Sumatoria Matrices)");
        for(int i=0; i<matrizResultante.length; i++){
            for(int j=0; j<matrizResultante.length; j++){
                System.out.print("["+matrizResultante[i][j]+"]" + " ");
            }
                System.out.println();
        }  
    }
}
