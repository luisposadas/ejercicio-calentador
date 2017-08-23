public class Calentador
{
    private int temperatura;
    public Calentador()
    {
        temperatura = 15;
    }
    public void calentar()
    {
        temperatura += 5;
        
    }
    public void enfriar()
    {
        temperatura -= 5;
        
    }
    public int muestraTemperatura()
    {
        return temperatura;
    }
    
}