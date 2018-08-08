import java.util.Scanner;

/**
 * 
 */
public class Hexagono
{
    public void main(String[] args)
    {
        double L, Area;
        
        //Asociar el teclado y el programa
        Scanner teclado = new Scanner(System.in);
        
        //1. Solicitar los datos de entrada
        System.out.println("Area del Hexagono");
        System.out.println("");
                        
        System.out.println("Medida del lado del hexagono.");
        L = teclado.nextDouble();
        
                        
        if (L<0)
        {
            Verificacion();
        }
        
        // 2. Hallar los datos de salida
        Area = (3 * Math.sqrt(3) / 2 )*Math.pow(L,2);
        
        // 3. Mostrar los datos de salida en pantalla
        System.out.println("El area del hexagono es:" + Area);
        
    }
    
    
    private void Verificacion(){
        System.out.println("Error!! los datos deben ser positivos");
        System.exit(0);
    }
}
