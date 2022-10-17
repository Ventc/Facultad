class Persona:  # Creamos una clase

    def __init__(self, nombre, apellido, dni, edad, *args, **kwargs):  # Se lo llama metodo init Dunder
        self.nombre = nombre
        self.apellido = apellido
        self._dni = dni # Este atributo esta encapsulado de una manera sugerida
        self.edad = edad
        self.args = args
        self.wkargs = kwargs

    def mostrar_detalle(self): # self es igual a this
        print(f"La clase Persona tiene los siguientes datos: {self.nombre} {self.apellido} {self._dni} {self.edad}, la dirreccion es: {self.args}, los datos importantes son: {self.wkargs}")


persona1 = Persona("Matias", "Ivan", 43145033, 20)  # Necesitamos enviar argumentos
# print(persona1.nombre)
# print(persona1.apellido)
# print(persona1.edad)
print(f"El objeto1 de la clase persona: {persona1.nombre} {persona1.apellido} Su edad es: {persona1.edad}")
persona2 = Persona("Ludmila", "Rossi", 41764518, 23)
print(f"El objeto2 de la clase persona: {persona2.nombre} {persona2.apellido} Su edad es: {persona2.edad}")

persona1.nombre = "Julieta"
persona1.apellido = "Borda"
persona1.edad = 5
print(f"El objeto1 modificado de la clase persona: {persona1.nombre} {persona1.apellido} Su edad es: {persona1.edad}")

# Los atributos son: caracteristicas
# Los metodos son: el comportamiento que van a tener los objetos (acciones)
persona1.mostrar_detalle() # La referencia en este caso se pasa de manera automatica
persona2.mostrar_detalle()

#Persona.mostrar_detalle() # Debemos pasarle una referencia para el self o dara error
persona1.telefono = "41293219"
print(f"Este es el telefono de: {persona1.nombre} {persona1.telefono}") # Hemos creado un atributo de un objeto

#print(persona2.telefono) el objeto persona2 no tiene este atributo, da error
persona3 = Persona("Julieta", "Borda", 50982300, 7, "Telefono", "30213094", "Calle Padilla", 2273, "Manzana", 120, "Casa", 18, Altura=1.57, Peso=70, CFavorito="Negro", Auto="Ford K", Modelo=2017)
persona3.mostrar_detalle()
#print(persona3._dni) esto no se debe utilizar (esta encapsulado), esto dice que lo desconocemos python
#persona3.__nombre  Esta totalmente encapsulado