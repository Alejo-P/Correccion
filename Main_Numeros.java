public class Main_Numeros {
    public static void main(String[] args) {
        Clase_Numeros numero1=new Clase_Numeros();
        Clase_Numeros numero2=new Clase_Numeros(50);
        Clase_Numeros numero3=new Clase_Numeros(3.5);
        System.out.printf("los numeros ingresados son:\nNumero1 %s\nNumero2: %s\nNumero3: %s", numero1.Numeros(), numero2.Numeros(), numero3.Numeros());
    }
}
