import java.util.Scanner;

/**
 * 
 */
public class AreaVolumenTronco
{
    public void main(String[] args)
    {
        double b, B, h, ap, apq, area, volumen, rss, ss;
        
        //Asociar el teclado y el programa
        Scanner teclado = new Scanner(System.in);
        
        //1. Solicitar los datos de entrada
        System.out.println("Area y volumen del tronco de piramide cuadrangular.");
        System.out.println("");
        
        System.out.println("Lado del cuadrado inferior");
        B = teclado.nextDouble();
        
        System.out.println("Lado del cuadrado superior");
        b = teclado.nextDouble();
        
        System.out.println("Altura");
        h = teclado.nextDouble();
        
        if (B<0)
        {
            Verificacion();
        }
        if (b<0)
        {
            Verificacion();
        }
        if (h<0)
        {
            Verificacion();
        }
        // 2. Hallar los datos de salida
        apq = (((((B-b)/2)*((B-b)/2)))+(h*h));
        ap = Math.sqrt(apq);
        area = 2*(b+b)*ap+(b*b)+(B*B);
        
        ss = b*b*B*B;
        rss = Math.sqrt(ss);
        volumen = (h/3)*(b*b+B*B+rss);
        
        // 3. Mostrar los datos de salida en pantalla
        System.out.println("Area del tronco de piramide cuadrangular:" + area);
        System.out.println("Volumen del tronco de piramide cuadrangular:" + volumen);
        
    }
    
    private void Verificacion(){
        System.out.println("Error!! los datos deben ser positivos");
        System.exit(0);
    }
}
