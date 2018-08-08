import java.util.Scanner;

/**
 * 
 */
public class Paseo
{
    public void main(String[] args)
    {
        double Eg, Ef, Silxbus, Costbus, Dias, Vapla, Vaha, Perxhab, silreq, BuReq, AlqBus, CostCom, Numhab, CostHabxdia, CostHabxpaseo, CostoPaseo;
        
        //Asociar el teclado y el programa
        Scanner teclado = new Scanner(System.in);
        
        //1. Solicitar los datos de entrada
        System.out.println("Area y volumen del tronco de piramide cuadrangular.");
        System.out.println("");
                        
        System.out.println("Numero de estudiantes gordos");
        Eg = teclado.nextDouble();
        
        System.out.println("Numero de estudiantes flacos");
        Ef = teclado.nextDouble();
        
        System.out.println("Silla disponibles en el bus");
        Silxbus = teclado.nextDouble();
        
        System.out.println("Costo del bus");
        Costbus = teclado.nextDouble();
        
        System.out.println("Dias del paseo");
        Dias = teclado.nextDouble();
        
        System.out.println("Valor por plato");
        Vapla = teclado.nextDouble();
        
        System.out.println("Valor de habitacion");
        Vaha = teclado.nextDouble();
        
        System.out.println("Numero de personas por habitacion");
        Perxhab = teclado.nextDouble();
                
        if (Eg<0 && Ef<0 && Silxbus<0 && Costbus<0 && Dias<0 && Vapla<0 && Vaha<0 && Perxhab<0)
        {
            Verificacion();
        }
        
        // 2. Hallar los datos de salida
        BuReq = Math.ceil((Eg * 2 + Ef) / Silxbus);
        AlqBus = BuReq * 2 * Costbus;
        CostCom = (Eg * 5 + Ef * 3)* Vapla;
        Numhab = Math.ceil((Eg + Ef)/ Perxhab);
        CostHabxdia = Numhab * Vaha;
        CostHabxpaseo = Numhab * Vaha * Dias;
        CostoPaseo = AlqBus + CostCom+ CostHabxpaseo;
        
        // 3. Mostrar los datos de salida en pantalla
        System.out.println("Cantidad de buses:" + BuReq);
        System.out.println("Costo alquiler buses:" + AlqBus);
        System.out.println("Costo de comida:" + CostCom);
        System.out.println("Numero de habitaciones:" + Numhab);
        System.out.println("Costo de habitaciones por dia:" + CostHabxdia);
        System.out.println("Costo de habitaciones por paseo:" + CostHabxpaseo);
        System.out.println("Costo total del paseo:" + CostoPaseo);
    }
    
    
    private void Verificacion(){
        System.out.println("Error!! los datos deben ser positivos");
        System.exit(0);
    }
}
