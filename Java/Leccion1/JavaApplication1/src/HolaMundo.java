public class HolaMundo {

    public static void main(String[] args) {
//           /*System.out.println("Hola mundo desde Java");
//        int miVariable= 100;
//        System.out.println(miVariable);
//        miVariable = 5;
//        System.out.println(miVariable);
//        String miVariableCadena= "Bienvenidos";
//        System.out.println(miVariableCadena);
//        miVariableCadena="Sigamos Creciendo en programacion";
//        System.out.println(miVariableCadena);
//        clase 22/04
//        var : inferencia de tipos en java
//        var miVariableEntera2 = 10;
//        var miVariableCadena2 = "Seguimos Estudiando";
//        System.out.println("miVariableEntera2 = "+miVariableEntera2);
//        System.out.println("miVariableCadena2 = "+miVariableCadena2);
//        var usuario = "Osvaldo";
//        var titulo1 = "Ingeniero";
//        var union = titulo1 + " " + usuario;
//        System.out.println("Union= "+ union);
//        var a = 8;
//        var b = 4;
//        System.out.println(usuario + (a + b));
//        Ejercicio: Caracteres especiales con Java
//        var nombre = "Natalia";
//        System.out.println("\nNueva Linea: \n"+nombre);
//        System.out.println("Tabulador: \t"+nombre);
//        System.out.println("\t\t.:MENU:."+nombre);
//        System.out.println("Retroceso: \b\b"+nombre);
//        System.out.println("Comillas Simples: \'"+nombre+"\'");
//        System.out.println("Comillas Dobles: \""+nombre+"\"");
//        Clase Scanner
//        Scanner entrada = new Scanner(System.in);
//        System.out.println("Digite su nombre: ");
//        var usuario2= entrada.nextLine();
//        System.out.println("Usuario2= "+usuario2);
//        System.out.println("Escriba el titulo: ");
//        var titulo3 = entrada.nextLine();
//        System.out.println("Resultado: "+titulo3+" "+usuario2);
//        Ejercicio
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Proporiciona el titulo: ");
//        String titulo= scanner.nextLine();
//        System.out.println("Proporiciona el Autor: ");
//        String autor= scanner.nextLine();
//        System.out.println(titulo+" fue escrito por "+ autor);
//    */
////        Clase 28/04
//        /*
//        byte numeroByte = 10;
//        System.out.println("numero entero byte: "+numeroByte);
//        System.out.println("El valor minimo del Byte: "+ Byte.MIN_VALUE);
//        System.out.println("El valor maximo del Byte: "+ Byte.MAX_VALUE);
//        short numeroEnteroShort= 32767;
//        System.out.println("numEnteroShort: "+numeroEnteroShort);
//        System.out.println("El valor minimo del Short: "+ Short.MIN_VALUE);
//        System.out.println("El valor maximo del Short: "+ Short.MAX_VALUE);
//        int numeroEnteroInt= 2147483647;
//        System.out.println("numEnteroInt: "+ numeroEnteroInt);
//        System.out.println("El valor minimo del Short: "+ Integer.MIN_VALUE);
//        System.out.println("El valor maximo del Short: "+ Integer.MAX_VALUE);
//        long numeroEnteroLong = 9223372036854775806L;
//        System.out.println("numEnteroInt: " + numeroEnteroLong);
//        System.out.println("El valor minimo del Short: " + Long.MIN_VALUE);
//        System.out.println("El valor maximo del Short: " + Long.MAX_VALUE);
//        float numFloat= 3.4028235E38F;
//        System.out.println("numFloat: " + numFloat);
//        System.out.println("El valor minimo del Float: " + Float.MIN_VALUE);
//        System.out.println("El valor maximo del FLoat: " + Float.MAX_VALUE);
//        double numDouble= 1.7976931348623157E308D;
//        System.out.println("numFloat: " + numDouble);
//        System.out.println("El valor minimo del Double: " + Double.MIN_VALUE);
//        System.out.println("El valor maximo del Double: " + Double.MAX_VALUE);
//        */
//        Clase del 6/05
//       /* var numEntero = 20;//Las literales sin punto son automaticamente enteros
//        System.out.println("numEntero = " + numEntero);
//        var numFloat = 10.0F;//Las literales con punto son automaticamente de tipo double
//        System.out.println("numFloat = " + numFloat);
//        var numDouble = 10.0;
//        System.out.println("numDouble = " + numDouble);
//        Tipos primitivos char
//        char miVariableChar = 'a';
//        System.out.println("miVariableChar = " + miVariableChar);
//        char varCaracter = '\u0024';//Indicamos la asignacion del codigo unicode
//        System.out.println("varCaracter = " + varCaracter);
//        char varCaracterSimbolo = 36;//Indicamos el valor decimal del dodigo unicode
//        System.out.println("varCaracterSimbolo = " + varCaracterSimbolo);
//        Clase 13/05
//        Tipos Primitivos tipos booleanos
//        /*
//        boolean varBool = true;
//        System.out.println("VarBool= " + varBool);
//        if(varBool){
//            System.out.println("La Bandera es verde");
//        }
//        else{
//            System.out.println("La Bandera es Roja");
//        }
//        var edad = 30;
//        var adulto = edad >= 18;
//        if(adulto){
//            System.out.println("Eres mayor de edad");
//        }else{
//            System.out.println("Eres menor de edad");
//        }
//        var edad1 = 15;
//        if( edad1 >= 18){
//            System.out.println("Eres mayor de edad");
//        }else{
//            System.out.println("Eres menor de edad");
//        }
//        */
//        /*
//        Conversion de Tipos
//        var edad = Integer.parseInt("20");
//        System.out.println("edad = " + (edad + 1));
//        var valorPI = Double.parseDouble("3.1416");
//        System.out.println("ValorPI = " + valorPI);
//        Pedir un valor
//        var entrada = new Scanner(System.in);
//        System.out.println("Digite su edad");
//        edad = Integer.parseInt(entrada.nextLine());
//        System.out.println("edad = " + edad);
//        */
////        Conversion de Tipos primitivos en java parte 2
//        /*
//        var edadTexto = String.valueOf(10);
//        System.out.println("edadTexto = " + edadTexto);
//        var fraseChar = "programadores".charAt(12);
//        System.out.println("fraseChar = "+ fraseChar);
//        var entrada = new Scanner(System.in);
//        System.out.println("Digite un caracter");
//        fraseChar = entrada.nextLine().charAt(0);
//        System.out.println("FraseChar = " + fraseChar);
//        var a = "A";
//        System.out.println(a);
//        a = "B";
//        System.out.println(a);
//        int num1 = 5, num2 = 4;
//        inferencia de tipos no se puede asignar varias variables en la misma linea
//        var solucion = num1 + num2;
//        System.out.println("Solucion de la suma= "+solucion);
//        solucion = num1 - num2;
//        System.out.println("solucion de la resta= "+solucion);
//        solucion= num1*num2;
//        System.out.println("Solucion de la multiplicacion= "+solucion);
//        solucion = num1/num2;
//        System.out.println("Solucion de la division="+solucion);
//        var solucion2 = 3.4/num2;
//        System.out.println("Solucion2 de la division="+solucion2);
//        solucion = num1 % num2;
//        System.out.println("solucion resultado del mod = "+solucion);
//        if (num1 % 2 == 0){
//            System.out.println("Es par");
//        }else{
//            System.out.println("Es impar");
//        }
//        int varNum1=4, varNum2=4;
//        int varNum3=varNum1+6 - varNum2;
//        System.out.println("varNum3= "+varNum3);
//        varNum1+=1;//Operador de Composicion
//        System.out.println("varNum1 suma = "+varNum1);
//        - * / %
//        varNum1-=1;//Operador de Composicion resta
//        System.out.println("varNum1 resta= "+varNum1);
//        varNum1*=1;//Operador de Composicion producto
//        System.out.println("varNum1 producto = "+varNum1);
//        varNum1/=1;//Operador de Composicion division
//        System.out.println("varNum1 division = "+varNum1);
//        varNum1%=1;//Operador de Composicion modulo
//        System.out.println("varNum1 modulo = "+varNum1);
//        */
        //Operadores unarios
        var varA = 7;
        var varB = -varA;
        System.out.println("varA =" + varA);
        System.out.println("varB = " + varB);
        //Operador de negacion
        var varC = true;
        var varD = !varC;
        System.out.println("VarD = " + varD);

        //operadores unarios de incrmento: preincremento
        var varE = 9;
        var varF = ++varE;//primero se inc la variable y despues se usa su valor
        System.out.println("varE = " + varE);//se incrementa la unidad
        System.out.println("varF = " + varF);//va a sumar uno
        //postincremento el simbolo va despues de la variable
        var varG = 3;
        var varH = varG++;
        System.out.println("varG = " + varG);
        System.out.println("varH = " + varH);

        //Operadores unarios de decremento
        //predecremento
        var varI = 4;
        var varJ = --varI;
        System.out.println("varI = " + varI);//la variable ya esta en decremento
        System.out.println("varJ = " + varJ);

        //postdecremento
        var varK = 8;
        var varL = varK--;//primero el valor de la variable, luego queda el decremento
        System.out.println("varK = " + varK);//aqui va el decremento en 11
        System.out.println("varL = " + varL);

        //Operadores de igualdad
        var aNum = 5;
        var bNUm = 4;
        var cNum = (aNum == bNUm);
        System.out.println("cnum = " + cNum);
        var dNum = aNum != bNUm;
        System.out.println("dNum = " + dNum);
        var cadenaA = "Hello";
        var cadenaB = "bye bye";
        var cVar = cadenaA == cadenaB;
        System.out.println("cVar = " + cVar);
        var fvar = cadenaA.equals(cadenaB);
        System.out.println("fvar = " + fvar);
        //Operadores relacionales
        var gVar = aNum > bNUm;
        System.out.println("gVar = " + gVar);
        if (aNum % 2 == 0) {
            System.out.println("el numero es par");
        } else {
            System.out.println("impar");
        }
        var edad = 30;
        var adulto = 18;
        if (edad >= adulto) {
            System.out.println("es adulto");
        } else
            System.out.println("es menor de edad");

        //Operadores Condicionales
        var valorA = 7;
        var valorMinimo = 0;
        var valorMaximo = 10;
        var respuesta = valorA>=0 && valorA<=10;

        if(respuesta){
            System.out.println("Esta dentro del rango establecido");
        }else{
            System.out.println("Esta fuera del rango establecido");
        }
        var vacaciones = false;
        var diaLibre = true;
        if(vacaciones||diaLibre){
            System.out.println("papa puede asistir al juego de su hijo");
        }else{
            System.out.println("papa no puede asistir al juego de su hijo");
        }
        //Operador Ternario
        var resultadoT = (5>4)?"Verdadero":"falso";
        System.out.println("resultadoT = " + resultadoT);
        var numeroT = 7;
        resultadoT = (numeroT%2==0?"par":"impar");
        System.out.println("resultadoT"+resultadoT);

        var x = 5;
        var y = 10;
        var z = ++x + y--;
        System.out.println("x = " + x); //6
        System.out.println("y = " + y); //9
        System.out.println("z = " + z);//16

        var solucionAritmetica = 4 + 5 * 6 / 3; //4 + ((5 * 6) / 3) = 30 / 3 = 10 + 4 = 14
        System.out.println("solucionAritmetica = " + solucionAritmetica);

        solucionAritmetica = (4 + 5) * 6 / 3;
        System.out.println("solucionAritmetica = " + solucionAritmetica);
    }


}
