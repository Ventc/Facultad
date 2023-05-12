let x = 10; //Variable de tipo primitiva
console.log(x.lenght) 
console.log("Tipos primitivos")
//Objeto
let persona = {
    nombre: "Kevin",
    apellido: "LaRocca",
    email: "kevin12@gmail.com",
    edad: 25,
    idioma: "es",
    get lang(){
        return this.idioma.toUpperCase(); //Convierte las minisculas a mayusculas
    },
    set lang(Lang){
        this.idioma = Lang.toUpperCase();
    },
    nombreCompleto: function(){ //Metodo o funcion en JS
        return this.nombre+" "+this.apellido;
    },
    get nombreEdad(){ //Este es el metodo get
        return "El nombre es: "+ this.nombre+", edad: "+this.edad;
    }
}

console.log(persona.nombre);
console.log(persona.apellido);
console.log(persona.email);
console.log(persona.edad);
console.log(persona.nombreCompleto())
console.log("Ejecutando con un objeto");

let persona2 = new Object(); //Debe crear un nuevo objeto en memoria
persona2.nombre = "Juani";
persona2.direccion = "Gesell 111"
persona2.telefono = "334349502"
console.log(persona2.telefono);
console.log("Creamos un nuevo objeto");
console.log(persona ["apellido"]); //Accedemos como si fuera un arreglo
console.log("Usamos el ciclo For in");
//For in
for(propiedad in persona){
    console.log(propiedad);
    console.log(persona[propiedad]);
}
console.log("Cambiamos y elminamos un error");
persona.apellida = "Rossi";//Cambiamos dinamicamente un valor del objeto
delete persona.apellida; //Eliminamos el error
console.log(persona);

//Distinta formas de imprimir un objeto
//Numero 1: La mas sencilla: Concatenar cada valor de cada propiedad
console.log("Distintas formas de imprimir un objeto: Forma 1");
console.log(persona.nombre+", "+persona.apellido);

//Numero 2: A traves del ciclo For in
console.log("Distintas formas de imprimir un objeto: Forma 2");
for(nombrePropiedad in persona){
    console.log(persona[nombrePropiedad]);
}

//Numero 3: La funcion Object.values()
console.log("Distintas formas de imprimir un objeto: Forma 3");
let personaArray = Object.values(persona);
console.log(personaArray);

//Numero 4: Utilizaremos el metodo JSON.stringify
console.log("Distintas formas de imprimir un objeto: Forma 4");
let personaString = JSON.stringify(persona);
console.log(personaString);

console.log("Comenzamos a utilizar el metodo get")
console.log(persona.nombreEdad);

console.log("Comenzamos a utilizar el metodo set");
console.log("Comenzamos con el metodo get y set para idiomas");
persona.lang = "en";
console.log(persona.lang);

function Persona3(nombre, apellido, email){ //Constructor
    this.nombre = nombre;
    this.apellido = apellido;
    this.email = email;
    this.nombreCompleto = function(){
        return this.nombre+" "+this.apellido;
    }
}
let padre = new Persona3("Leo", "Lopez", "leolo@gmail.com");
padre.nombre = "Luis"; //Modificamos el nombre
padre.telefono = "363490509"; //Una propiedad exclusiva del objeto padre
console.log(padre);
console.log(padre.nombreCompleto()); //Utilizamos la funcion
let madre = new Persona3("Daniela", "Chavez", "dachavez@gmail.com");
console.log(madre);
console.log(madre.telefono); //La propiedad no esta definida
console.log(madre.nombreCompleto());

//Diferentes formas de crear objetos
//Caso 1:
let miObjeto = new Object(); //Esta es una opcion formal
//Caso 2:
let miObjeto2 = {}; //Esta opcion es breve y recomendada
//Caso 3:
let miObjeto3 = new String("Hola"); //Esta es la sintaxis simplificada y recomendada

//Caso con numeros 1:
let miNumero = new Number(1); //Es formal no recomendable
//Caso con numeros 2:
let miNumero2 = 1; //Sintaxis recomendada

//Caso boolean 1:
let miBoolean1 = new Boolean(false); //Forma 1
//Caso boolean 2:
let miBoolean2 = false; //Sintaxis recomendada

//Caso Arreglos 1:
let miArreglo1 = new Array(); //Forma 1
//Caso Arreglos 2:
let miArreglo2 = []; //Sintaxis recomendada

//Caso function 1:
let miFuncion1 = new function(){}; //Todo despues de new es considerado objeto
//Caso function 2:
let miFuncion2 = function(){}; //Notacion simplificada y recomendada

//Uso de prototype
Persona3.prototype.telefono = "540120390";
console.log(padre);
console.log(madre.telefono);
madre.telefono = "1412309050";
console.log(madre.telefono);

//Uso de call
let persona4 ={
    nombre: "Juani",
    apellido: "Valladares",
    nombreCompleto2: function(titulo, telefono){
        return titulo+": "+this.nombre+" "+this.apellido+" "+telefono;
        //return this.nombre+" "+this.apellido;
    }
}

let persona5 = {
    nombre: "Carlos",
    apellido: "Lara"
}

console.log(persona4.nombreCompleto2("Lic.", "609103049"));
console.log(persona4.nombreCompleto2.call(persona5, "Ing", "124120905"));

//Metodo Apply
let arreglo = ["Ing.", "809457909"];
console.log(persona4.nombreCompleto2.apply(persona5, arreglo));