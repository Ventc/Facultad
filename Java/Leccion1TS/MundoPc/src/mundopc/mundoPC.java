
package mundopc;

import ar.com.system2023.mundopc.*;

public class mundoPC {
    public static void main(String[] args) {
        Monitor monitorHP = new Monitor("HP", 13); //Importar la clase
        Teclado tecladoHP = new Teclado("Bluetooth", "HP");
        Raton ratonHP = new Raton("Bluetooth", "HP");
        Computadora computadoraHP = new Computadora("Computadora HP", monitorHP, tecladoHP, ratonHP);
        
        //Creamos otros objetos de diferentes marca
        Monitor monitorGamer = new Monitor("Gamer", 32);
        Teclado tecladoGamer = new Teclado("Bluetooth", "Gamer");
        Raton ratonGamer = new Raton("Bluetooth", "Gamer");
        Computadora computadoraGamer = new Computadora("Computadora Gamer", monitorGamer, tecladoGamer, ratonGamer);
        
        Monitor monitorAMD = new Monitor("Gamer", 32);
        Teclado tecladoAMD = new Teclado("Bluetooth", "Gamer");
        Raton ratonAMD = new Raton("Bluetooth", "Gamer");
        Computadora computadoraAMD = new Computadora("Computadora Gamer", monitorGamer, tecladoGamer, ratonGamer);
        
        Monitor monitorIntel = new Monitor("Gamer", 32);
        Teclado tecladoIntel = new Teclado("Bluetooth", "Gamer");
        Raton ratonIntel = new Raton("Bluetooth", "Gamer");
        Computadora computadoraIntel = new Computadora("Computadora Gamer", monitorGamer, tecladoGamer, ratonGamer);
        
        Monitor monitorNvidia = new Monitor("Gamer", 32);
        Teclado tecladoNvidia = new Teclado("Bluetooth", "Gamer");
        Raton ratonNvidia = new Raton("Bluetooth", "Gamer");
        Computadora computadoraNvidia = new Computadora("Computadora Gamer", monitorGamer, tecladoGamer, ratonGamer);
        
        Monitor monitorHyperx = new Monitor("Gamer", 32);
        Teclado tecladoHyperx = new Teclado("Bluetooth", "Gamer");
        Raton ratonHyperx = new Raton("Bluetooth", "Gamer");
        Computadora computadoraHyperx = new Computadora("Computadora Gamer", monitorGamer, tecladoGamer, ratonGamer);
        
        Monitor monitorAlloy = new Monitor("Gamer", 32);
        Teclado tecladoAlloy = new Teclado("Bluetooth", "Gamer");
        Raton ratonAlloy = new Raton("Bluetooth", "Gamer");
        Computadora computadoraAlloy = new Computadora("Computadora Gamer", monitorGamer, tecladoGamer, ratonGamer);
        
        Monitor monitorRedragon = new Monitor("Gamer", 32);
        Teclado tecladoRedragon = new Teclado("Bluetooth", "Gamer");
        Raton ratonRedragon = new Raton("Bluetooth", "Gamer");
        Computadora computadoraRedragon = new Computadora("Computadora Gamer", monitorGamer, tecladoGamer, ratonGamer);
        
        Monitor monitorAsrock = new Monitor("Asrock", 32);
        Teclado tecladoAsrock = new Teclado("Bluetooth", "Asrock");
        Raton ratonAsrock = new Raton("Bluetooth", "Asrock");
        Computadora computadoraAsrock = new Computadora("Computadora Asrock", monitorAsrock, tecladoAsrock, ratonAsrock);
        
        Monitor monitorAsus = new Monitor("Asus", 32);
        Teclado tecladoAsus = new Teclado("Bluetooth", "Asus");
        Raton ratonAsus = new Raton("Bluetooth", "Asus");
        Computadora computadoraAsus = new Computadora("Computadora Asus", monitorAsus, tecladoAsus, ratonAsus);
        
        Monitor monitorGigabyte = new Monitor("Gigabyte", 32);
        Teclado tecladoGigabyte = new Teclado("Bluetooth", "Gigabyte");
        Raton ratonGigabyte = new Raton("Bluetooth", "Gigabyte");
        Computadora computadoraGigabyte = new Computadora("Computadora Gigabyte", monitorGigabyte, tecladoGigabyte, ratonGigabyte);
        
        
        
        
        Orden orden1 = new Orden();//Inicializamos el arreglo vacio
        Orden orden2 = new Orden();//Una nueva lista para el objeto orden2
        orden1.agregarComputadora(computadoraHP);
        orden1.agregarComputadora(computadoraGamer);
        orden1.agregarComputadora(computadoraAsus);
        orden1.agregarComputadora(computadoraGigabyte);
        orden1.agregarComputadora(computadoraIntel);
        orden1.agregarComputadora(computadoraAMD);
        orden1.agregarComputadora(computadoraNvidia);
        orden1.agregarComputadora(computadoraRedragon);
        orden1.agregarComputadora(computadoraAsrock);
        orden1.agregarComputadora(computadoraAlloy);
        orden1.agregarComputadora(computadoraHyperx);
        
        
        Computadora computadoraVarias = new Computadora("Computadora de diferentes marcas", monitorHP, tecladoGamer, ratonHP);
        orden2.agregarComputadora(computadoraVarias);
        
        
        orden1.mostrarOrden();
        orden2.mostrarOrden();
        
        //Crear mas objetos de tipo computadora con todos sus elementos
        //completar una lista en el objeto orden1 que llegue a los 10 elementos
        //probar de esta manera los metodos al maximo rendimiento       
    }
}
