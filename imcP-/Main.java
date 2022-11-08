import java.util.*;
public class Main
{
    Scanner sc = new Scanner(System.in);
    private int cantidadPersonas;
    public void Main(String[] args)
    {
        cantidadPersonas=sc.nextInt();
        Imc imc = new Imc(cantidadPersonas);
    }
}
