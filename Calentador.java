public class Calentador
{
    private int temperatura;
    private int max;
    private int min;
    public Calentador(int minusr,int maxusr)
    {
        max = maxusr;
        min = minusr;
        temperatura = 15;
    }
    public void calentar()
    {
        if((temperatura + 5) <= max){
        temperatura += 5;
    }
    }
    public void enfriar()
    {
        if((temperatura - 5 )>= min){
        temperatura -= 5;
    }
    }
    public int muestraTemperatura()
    {
        return temperatura;
    }
    
}