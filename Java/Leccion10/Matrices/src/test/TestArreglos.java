
package test;

public class TestArreglos {
    public static void main(String[] args) { //lado derec. instaciamos un objeto de tipo object
        int edades[] = new int [3]; //El lado izq. declaramos la viarable
        System.out.println("edades = " + edades);
        
        edades[0] = 17;
        System.out.println("edades 0 = " + edades[0]);
        
        edades[1] = 22;
        System.out.println("edades 1 = " + edades[1]);
        
        edades[2] = 18;
        System.out.println("edades 2 = " + edades[2]);
        
        //edades[3] = 7; //Fuera de rango, error en tiempo de ejecucion
        
        for(int i = 0; i < edades.length; i++){
            System.out.println("edades y sus elementos "+i+": "+edades[i]);
        }
    }
}
