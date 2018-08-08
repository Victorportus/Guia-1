import java.util.Scanner;

/**
 * 
 */
public class TroncoCono
{
        double h, H, r, cono, a, R, x, ha, conito, tronco;
        
        Scanner teclado = new Scanner(System.in);
    
    public void main(String[] args)
    {
        System.out.println("Volumen del tronco de cono");
        System.out.println("");
        
        //1. Solicitar los datos de entrada
        PedirDatos1();
        PedirDatos2();
        PedirDatos3();
        
        
        if(h>H)
        {
            System.out.println("ERROR!, La altura del cono debe ser mayor que la altura del tronco.");
            PedirDatos1();
            PedirDatos2();
            PedirDatos3();
        }
        
                
        // 2. Hallar los datos de salida
        cono = ((Math.PI)*(r*r))*H;
        a = Math.atan(H/r); 
        x = (Math.tan(a))/h;
        R = r - x;
        ha = H - h;
        conito = ((Math.PI)*(R*R))*ha;
        tronco = cono - conito;
        
        // 3. Mostrar los datos de salida en pantalla
        System.out.println("El volumen del tronco de un cono es:" + tronco);
        
    }
        
    private double PedirDatos1(){
        System.out.println("Altura del tronco de cono.");
        h = teclado.nextDouble();
        return h;           
      }
       
    private double PedirDatos2(){
        System.out.println("Altura total del cono.");
        H = teclado.nextDouble();
        return H;
    }
    
    private double PedirDatos3(){
        System.out.println("Radio del cono.");
        r = teclado.nextDouble();
        return r;
    }
}  
