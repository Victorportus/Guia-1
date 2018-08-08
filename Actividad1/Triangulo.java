import java.util.Scanner;

/**
 * 
 */
public class Triangulo
{
    public void main(String[] args)
    {
        double L1, L2, L3, S, A, R;
        
        //Asociar el teclado y el programa
        Scanner teclado = new Scanner(System.in);
        
        //1. Solicitar los datos de entrada
        System.out.println("Un triangulo cualquiera.");
        System.out.println("Ingrese los lados del triangulo.");
        System.out.println("");
                        
        System.out.println("Lado 1");
        L1 = teclado.nextDouble();
        
        System.out.println("Lado 2");
        L2 = teclado.nextDouble();
        
        System.out.println("Lado 3");
        L3 = teclado.nextDouble();
        
                
        if (L1<0 && L2<0 && L3<0)
        {
            Verificacion();
        }
        
        // 2. Hallar los datos de salida
        S = (L1 + L2 + L3) / 2;
        A = Math.sqrt( S * ( S - L1 ) * ( S - L2 ) * ( S - L3 ));
        R = (L1 * L2 * L3)/ (4 * Math.PI * A);
        
        // 3. Mostrar los datos de salida en pantalla
        System.out.println("Semiperimetro del triangulo:" + S);
        System.out.println("Area del trangulo:" + A);
        System.out.println("Circunradius del triangulo:" + R);
        
    }
    
    
    private void Verificacion(){
        System.out.println("Error!! los datos deben ser positivos");
        System.exit(0);
    }
}
