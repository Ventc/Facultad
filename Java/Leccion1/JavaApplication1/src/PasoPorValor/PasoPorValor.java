
package PasoPorValor;

public class PasoPorValor {
    public static void main(String[] args) {
        var valorX = 20;
        System.out.println("valorX = " + valorX);
        cambioValor(valorX); //Solo le enviamos una copia
    }
    
    public static void cambioValor(int arg1){ //Parametro por valor
        System.out.println("arg1 = " + arg1);
        arg1 = 15;
    }
}
