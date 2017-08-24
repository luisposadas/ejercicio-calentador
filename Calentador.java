public class Calentador
{
    private int temperatura;
    private int max;
    private int min;
    int incremento;
    public Calentador(int minusr,int maxusr)
    {
        incremento = 5;
        max = maxusr;
        min = minusr;
        temperatura = 15;
    }
    public void calentar()
    {
        if((temperatura + incremento) <= max){
        temperatura += incremento;
    }
    }
    public void enfriar()
    {
        if((temperatura - incremento )>= min){
        temperatura -= incremento;
    }
    }
    public int muestraTemperatura()
    {
        return temperatura;
    }
    public void modificarIncremento(int incrementousr)
    {
        if(incrementousr >= 0){
            incremento = incrementousr;
        }
        
    }
}