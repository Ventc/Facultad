
package test;

import enumeraciones.Continentes;
import enumeraciones.Dias;

public class TestEnumeraciones {
    public static void main(String[] args) {
        //System.out.println("Dia 1: "+Dias.LUNES);
        //indicarDiaSemana(Dias.LUNES); //Las enumeraciones se tratan como cadenas
        //ahora no se deben utilizar comillas, se accede a través de el operador de punto
        System.out.println("Continente No. 5: "+Continentes.OCEANIA);
        System.out.println("No. de paises en el 5to. continente: "
                +Continentes.OCEANIA.getPaises());
        System.out.println("No. de habitantes en el 5to. continente: "
                +Continentes.OCEANIA.getHabitantes());

        System.out.println("Continente No. 4: "+Continentes.AMERICA);
        System.out.println("No. de paises en el 4to. continente: "
                +Continentes.AMERICA.getPaises());
        System.out.println("No. de habitantes en el 4to. continente: "
                +Continentes.AMERICA.getHabitantes());
        
        System.out.println("Continente No. 3: "+Continentes.ASIA);
        System.out.println("No. de paises en el 3er. continente: "
                +Continentes.ASIA.getPaises());
        System.out.println("No. de habitantes en el 3er. continente: "
                +Continentes.ASIA.getHabitantes());
        
        System.out.println("Continente No. 2: "+Continentes.EUROPA);
        System.out.println("No. de paises en el 2do. continente: "
                +Continentes.EUROPA.getPaises());
        System.out.println("No. de habitantes en el 2do. continente: "
                +Continentes.EUROPA.getHabitantes());
        
        System.out.println("Continente No. 1: "+Continentes.AFRICA);
        System.out.println("No. de paises en el 1er. continente: "
                +Continentes.AFRICA.getPaises());
        System.out.println("No. de habitantes en el 1er. continente: "
                +Continentes.AFRICA.getHabitantes());
        
    }
    
    private static void indicarDiaSemana(Dias dias){
        switch(dias){
            case LUNES:
                System.out.println("Primer dia de la semana");
                break;
            case MARTES:
                System.out.println("Segundo dia de la semana");
                break;
            case MIERCOLES:
                System.out.println("Tercer dia de la semana");
                break;
            case JUEVES:
                System.out.println("Cuarto dia de la semana");
                break;
            case VIERNES:
                System.out.println("Quinto dia de la semana");
                break;
            case SABADO:
                System.out.println("Sexto dia de la semana");
                break;
            case DOMINGO:
                System.out.println("Septimo dia de la semana");
                break;
            default:
                System.out.println("El valor ingresado no es valido");
                break;
        }
    }
}
