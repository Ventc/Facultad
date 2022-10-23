class Persona2:
    def __init__(self, nombre, apellido, edad):
        self._nombre = nombre
        self._apellido = apellido
        self._edad = edad

    def mostrar_detalles(self):
        print(f"Los datos a mostrar son los siguientes: {self._nombre} {self._apellido} {self._edad}")

    @property  # Decorador
    def nombre(self):  # Metodo Getter
        print("Estamos usando el metodo Get")
        return self._nombre

    @nombre.setter
    def nombre(self, nombre):  # Metodo Setter
        print("Estamos utilizando el metodo Set")
        self._nombre = nombre

    @property
    def apellido(self):
        return self._apellido

    @apellido.setter
    def apellido(self, apellido):
        self._apellido = apellido

    @property
    def edad(self):
        return self._edad

    @edad.setter
    def edad(self, edad):
        self._edad = edad

    def __del__(self):
        print(f"Persona2: {self._nombre} {self._apellido} {self._edad}")

if __name__ == "__main__":
    persona1 = Persona2("Matias", "Ivan", 20)
    print(persona1.nombre)  # Llamamos al metodo Getter
    persona1.nombre = "Ludmila Rossi"  # Llamamos el metodo setter
    print(persona1.nombre)  # Otra vez con el metodo getter
    print(persona1.mostrar_detalles())  # Llamamos el metodo mostrar_detalles
    # Atributo read-only seria la edad porque no tiene el metodo set
    print(persona1.edad)

    # Tarea crear tres objetos mas utilizando los metodos getter and setter
    # para modificar, y mostrar los cambios

    # Objeto numero uno de la tarea
    persona2 = Persona2("Ludmi", "Ro", 21)
    persona2.nombre = "Ludmila"
    persona2.apellido = "Rossi"
    persona2.edad = 23
    print(persona2.nombre)
    print(persona2.apellido)
    print(persona2.edad)
    print(persona2.mostrar_detalles())

    # Objeto numero dos de la tarea
    persona3 = Persona2("Kev", "LaRo", 25)
    persona3.nombre = "Kevin"
    persona3.apellido = "LaRocca"
    persona3.edad = 22
    print(persona3.nombre)
    print(persona3.apellido)
    print(persona3.edad)
    print(persona3.mostrar_detalles())

    # Objeto numero tres de la tarea
    persona4 = Persona2("Juani", "Valla", 23)
    persona4.nombre = "Juan"
    persona4.apellido = "Valladares"
    persona4.edad = 19
    print(persona4.nombre)
    print(persona4.apellido)
    print(persona4.edad)
    print(persona4.mostrar_detalles())

    print(__name__)
