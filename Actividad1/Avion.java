import java.util.Scanner;

/**
 * 
 */
public class Avion
{
    public void main(String[] args)
    {
        double ClasInput1, ClasInput2, ClasInput3, PasInput1, PasInput2, PasInput3, plata;
        int cost1 = 500000;
        int cost2 = 200000;
        int cost3 = 125000;
        double Pas1 = 0;
        double Pas2 = 0;
        double Pas3 = 0;        
                
        //Asociar el teclado y el programa
        Scanner teclado = new Scanner(System.in);
        
        //1. Solicitar los datos de entrada
        System.out.println("Ingresos de la empresa por vuelo");
        System.out.println("");
                        
        System.out.println("Clase:");
        ClasInput1 = teclado.nextDouble();
        System.out.println("Pasajeros:");
        PasInput1 = teclado.nextDouble();
                
        if (ClasInput1 == 1)
        {
            Pas1 = PasInput1;
            }
        else
            if (ClasInput1 == 2)
        {
            Pas2 = PasInput1;
        }
        else
            if (ClasInput1 == 3)
        {
            Pas3 = PasInput1;
        }     
        else
        {
            System.out.println("ERROR!!! Solo hay clases 1, 2 o 3.");
            System.exit(0);
        }
                
        System.out.println("Clase:");
        ClasInput2 = teclado.nextDouble();
        System.out.println("Pasajeros:");
        PasInput2 = teclado.nextDouble();
        if (ClasInput2 == 1)
        {
            Pas1 = PasInput2;
            }
        else
            if (ClasInput2 == 2)
        {
            Pas2 = PasInput2;
        }
        else
            if (ClasInput2 == 3)
        {
            Pas3 = PasInput2;
        }     
        else
        {
            System.out.println("ERROR!!! Solo hay clases 1, 2 o 3.");
            System.exit(0);
        }
                
        System.out.println("Clase:");
        ClasInput3 = teclado.nextDouble();
        System.out.println("Pasajeros:");
        PasInput3 = teclado.nextDouble();
        if (ClasInput3 == 1)
        {
            Pas1 = PasInput3;
            }
        else
            if (ClasInput3 == 2)
        {
            Pas2 = PasInput3;
        }
        else
            if (ClasInput3 == 3)
        {
            Pas3 = PasInput3;
        }     
        else
        {
            System.out.println("ERROR!!! Solo hay clases 1, 2 o 3.");
            System.exit(0);
        }
                
        // 2. Hallar los datos de salida
        plata = (Pas1 * cost1) + (Pas2 * cost2) + (Pas3 * cost3);
        
        // 3. Mostrar los datos de salida en pantalla
        System.out.println("Ingresos de la empresa en este vuelo:" + plata);
        
    }
}