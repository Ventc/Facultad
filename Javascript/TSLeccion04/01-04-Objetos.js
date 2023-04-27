let x = 10; //Variable de tipo primitiva
console.log(x.lenght) 
console.log("Tipos primitivos")
//Objeto
let persona = {
    nombre: "Kevin",
    apellido: "LaRocca",
    email: "kevin12@gmail.com",
    edad: 22,
    nombreCompleto: function(){ //Metodo o funcion en JS
        return this.nombre+" "+this.apellido;
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