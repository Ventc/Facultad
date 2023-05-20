//let persona3 = new Persona("Renzo", "Gira"); esto no se debe hacer: Persona is not defined

class Persona{ //Clase padre
    constructor(nombre, apellido){
        this._nombre = nombre;
        this._apellido = apellido;
    }

    get nombre(){
        return this._nombre;
    }

    set nombre(nombre){
        this._nombre = nombre;
    }

    get apellido(){
        return this._apellido;
    }

    set apellido(apellido){
        this._apellido = apellido;
    }
}

class Empleado extends Persona{ //Clase hija
    constructor(nombre, apellido, departamento){
        super(nombre, apellido);
        this._departamento = departamento;
    }

    get departamento(){
        return this._departamento;
    }

    set departamento(departamento){
        this._departamento = departamento;
    }
}

let persona1 = new Persona("Ludmila", "Rossi");
console.log(persona1.nombre);
console.log(persona1.apellido);
persona1.nombre = "Juani";
persona1.apellido = "Valladares"
console.log(persona1.nombre);
console.log(persona1.apellido);
//console.log(persona1);
let persona2 = new Persona("Kevin", "LaRocca");
console.log(persona2.nombre);
console.log(persona2.apellido);
persona2.nombre = "Santi";
persona2.apellido = "Nieva";
console.log(persona2.nombre);
console.log(persona2.apellido);
//console.log(persona2);

let empleado1 = new Empleado("Ludmila", "Rossi", "Sistemas");
console.log(empleado1);
console.log(empleado1.nombre);