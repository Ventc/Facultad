//Ejercicio 1: Calcular estación del año
let mes = 9;
let estacion;
if(mes == 1 || mes == 2 || mes == 12){
    estacion = "Verano";
}
else if(mes == 3 || mes == 4 || mes == 5){
    estacion = "Otoño";
}
else if(mes == 6 || mes == 7 || mes == 8){
    estacion = "Invierno";
}
else if(mes == 9 || mes == 10 || mes == 11){
    estacion = "Primavera";
}
else{
    estacion = "Valor incorrecto";
}
console.log("El valor corresponde a la estación de: "+estacion);
//Ejercicio 2: Hora del día
/*
de 6 a 11 nos saluda: Good Morning
de 12 a 16 nos saluda: Good afternoom
de 17 a 19 nos saluda: Good evening
de 20 a 23 nos saluda: Good night
Trabajaremos con 24 horas
*/
let horaDia = 9;
let mensaje;
if(horaDia >= 6 && horaDia <= 11){
    mensaje = "Good morning";
}
else if(horaDia >= 12 && horaDia <= 16){
    mensaje = "Good afternoom";
}
else if(horaDia >= 17 && horaDia <= 19){
    mensaje = "Good evening";
}
else if(horaDia >= 20 && horaDia <= 23){
    mensaje = "Good night";
}
else{
    mensaje = "Valor incorrecto";
}
console.log(mensaje);

//Estructura switch(la sintaxis es igual a Java)
switch(mes){ //No solo se pueden utilizar número, también cadenas
    case 1: case 2: case 12:
        estacion = "Verano";
        break;
    case 3: case 4: case 5:
        estacion = "Otoño";
        break;
    case 6: case 7: case 8:
        estacion = "Invierno";
        break;
    case 9: case 10: case 11:
        estacion = "Primavera";
        break;
    default:
        estacion = "Valor incorrecto";
}
console.log("Bienvenido a la estación de: "+estacion);

//Ampliando el uso de var let y const
/*
Con var puedes reasignar en cualquier momento
este forma parte del ambito global
Un error es que se sobreescriba  
*/

var nombre = 'Matias';
nombre = 'Ludmila';
console.log(nombre);

function saludar(){
    var nombre3 = 'Kevin';
    console.log(nombre3);
}
//console.log(nombre3); //Aquí no lee el dato en la función


if(true){
    var edad = 22;
    console.log(edad);
}
console.log(edad); //En la función funciono correctamente, en la estructura if fallo

/*
let: esta puede ser reasignada en cualquier momento
la diferencia es que su ambito es de bloque,
solo disponible dentro de un bloque de llaves 
o dentro de una función
*/

function saludar2(){
    let nombre2 = 'Matias';
    console.log(nombre2);
}
//console.log(nombre2);

if(true){
    let edad2 = 20;
    console.log(edad2);
}
//console.log(edad2);

/*
const se utiliza para valores constantes que no pueden ser reasignadas
*/

const fechaNacimiento = 2001;
console.log(fechaNacimiento);
//fechaNacimiento = 2003;
//console.log(fechaNacimiento); //solo se ejecuta el console anterior

//Evitar repetir tu codigo
//dry don't repeat yourself
//
let days = 3
switch (days) {
    case 1:
        console.log('Today is Monday');
         break;
    case 2:
        console.log('Today is Tuesday');
        break;
    case 3:
        console.log('Today is Wednesday');
        break;
    case 4:
        console.log('Today is Thursday');
        break;
    case 5:
        console.log('Today is Friday');
        break;
    case 6:
        console.log('Today is Saturday');
        break;
    case 7:
        console.log('Today is Sunday')
        break;
    default:
        console.log("Error en el ingreso del día de la semana.");
        break;
}

//Esta es una versión mejorada
//Creada con arrays o arreglos
let days2 = ['Monday', 'Tuesday', 'Wednesday','Thursday', 'Friday','Saturday','Sunday'];
//Creamos una función getDay con un parametro de tipo entero.  con una estructura if
function getDay(n){
    if(n < 1 || n > 7){
        throw new Error('out of range');
    }
    return days2[n+1];
}
console.log(getDay(5));

let month = 2
switch (month) {
    case 1:
        console.log('January');
        break;
    case 2:
        console.log('February');
        break;
    case 3:
         console.log('March');
        break;
    case 4:
        console.log('April');
        break;
    case 5:
        console.log('May');
        break;
    case 6:
        console.log('June');
        break;
    case 7:
        console.log('is July');
        break;
    case 8:
        console.log('is August');
        break;
    case 9:
        console.log('is September');
        break;
    case 10:
        console.log('is October');
        break;
    case 11:
        console.log('is November');
        break;
    case 12:
        console.log('is December');
        break;
    default:
        console.log('Erro en el ingreso del mes del año');
        break;
}
//Operacion mejorada
let month2 = ['The month is January', 'The month is February', 'March','April','May','June','July','August','September','October','November','December'];
function getMonth(n){
    if(n < 1 || n > 12){
        throw new Error('out of range');
    }
    return month2[n-1];
}
console.log(getMonth(2));