public class Clase_Numeros
{
    // Atributos (inicializados para evitar valores nulos)
    private int entero=0;
    private double decimal=0;
    // Constructores para la clase
    public Clase_Numeros(){} // Constructor sin parametros
    public Clase_Numeros(int e) // Constructor con parametro entero
    {
        this.entero = e;
    }
    public Clase_Numeros(double d) // Constructor con parametro decimal
    {
        this.decimal=d;
    }
    // Metodo getter
    public String Numeros()
    {
        return "El numero entero es: "+this.entero+
                "\n El numero decimal es: "+this.decimal;
    }
}
