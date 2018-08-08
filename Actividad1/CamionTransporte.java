import java.util.Scanner;

/**
 * 
 */
public class CamionTransporte
{
   public void main(String[] args)
   {
       double Kgt, Kgv, gls_km, D, gls;
       int v;
        
        //Asocioar el teclado y el programa
        Scanner teclado = new Scanner(System.in);
        
        //1. Solicitar los datos de entrada
        System.out.println("Numero de viajes y galones de gasolina requeridos");
        
        System.out.println("Numero de Kilos a transportar");
        Kgt = teclado.nextDouble();
        
        System.out.println("Capacidad del camion por viaje");
        Kgv = teclado.nextDouble();
        
        System.out.println("Rendimiento de combustible Km/gls");
        gls_km = teclado.nextDouble();
        
        System.out.println("Distancia entre ciudades");
        D = teclado.nextDouble();
        
        if (Kgt<0)
        {
            Verificacion();
        }
        if (Kgv<0)
        {
            Verificacion();
        }
        if (gls_km<0)
        {
            Verificacion();
        }
        if (D<0)
        {
            Verificacion();
        }
                
        // 2. Hallar los datos de salida
        v = (int)Math.ceil(Kgt/Kgv);
        gls = (D * v)/gls_km;
        
        
        
        // 3. Mostrar los datos de salida en pantalla
        System.out.println("Se requieren " + v + " viajes.");
        System.out.println("Se requieren " + gls + " galones de combustible.");
    }
    
    private void Verificacion(){
        System.out.println("Error!! los datos deben ser positivos");
        System.exit(0);
    }
}
