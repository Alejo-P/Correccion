public class Bloque_tryCatch
{
    public static void main(String[] args)
    {
        //Atributos
        int num1 = 5;
        int num2 = 0;
        try
        {
            System.out.println("Ingrese el primer numero:");
            num1 = Integer.parseInt(System.console().readLine()); //Leer linea de la consola
            System.out.println("Ingrese el segundo numero:");
            num2 = Integer.parseInt(System.console().readLine()); //Leer linea de la consola
            System.out.println("Los numeros ingresados son: "+num1+","+num2);
        }
        catch (NumberFormatException e)
        {
            System.out.println("Error! No se ha ingresado un numero.");
        }
        // "finally" se ejecutara sin importar si se genero o no una excepcion
        finally
        {
            System.out.println("Finalizacion de la ejecucion!");
        }
    }
}
