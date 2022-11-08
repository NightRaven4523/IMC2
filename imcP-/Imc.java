 import java.util.*;
public class Imc
{
    Scanner sc=new Scanner (System.in);
    private Object [][] datosIMC=null;
    private int [][] Imcp =new int [datosIMC.length] [datosIMC[0].length];
    public Imc(int cantidadPersonas)
    {
        datosIMC = new Object[cantidadPersonas][4];
        for(int i=0; i<cantidadPersonas; i++)
        {
            for(int j=0; j<4; j++)
            {
                if(j<2)
                {
                    System.out.println("Ingrese el nombre/apellido de la persona");
                    datosIMC[i][j] = sc.next();
                }
                else 
                {
                    System.out.println("Ingrese la estatura/peso de la persona");
                    int dato = sc.nextInt();
                    datosIMC[i][j]=dato;
                    Imcp[i][j] = Integer.parseInt(datosIMC[i][j]);
                }
            }
        }
    }
    
    public void ImcP (int cantidadPersonas)
    {
 
    } 
}
