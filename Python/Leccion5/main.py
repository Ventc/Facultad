# Comenzamos con Funciones
# mi_funcion() # No se puede llamar a una funcion que no esta definida
# Definimos una funcion
def mi_funcion(): # Para identificar a la funcion utilizamos parentesis
    print('Saludos a todos los alumnos de la Tecnicatura')

mi_funcion() # Estamos llamando a la funcion
mi_funcion() # Se puede llamar a una funcion N cantidad de veces

# Desempaquetado de listas o list unpacking
def show(name, lastname):
    print(name+" "+lastname)
person = ["Matias", "Borda"]
show(person[0], person[1]) # Pasamos uno por uno los datos de la lista a la funcion
show(*person) # Esto es lo mismo que lo anterior pero le pasamos todo junto
person2 = ["Ludmila", "Rossi"] # Desempaquetamos a traves de una tupla
show(*person2)
person3 = {"lastname": "LaRocca", "name": "Kevin"}
show(**person3)

numbers = [1, 2, 3, 4, 5]
for n in numbers:
    print(n)
    if n == 3:
        break # Esta es la unica manera para que no se ejecute el else
else:
    print("Esto se termina")

# List comprehension, lista de comprension
names = ["Ludmila", "Kevin", "Pedro", "Julieta"]
alongP = [p for p in names if p[0] == "P"] # Esto regresa una nueva lista
print(alongP)

bottleC = [{"name": "Quilmes", "country": "Arg"},
           {"name": "Corona", "country": "Mx"},
           {"name": "Stella Artois", "country": "Belgium"},
           ]
Arg = [b for b in bottleC if b["country"] == "Arg"]
print(Arg)
print(bottleC)

# Paso de Argumentos (funciones)
def mi_funcion2(name, lastname):
    print("Saludos a todos lo que ven a traves del canal de youtube")
    print(f"Nombre: {name}, Apellido: {lastname}")
mi_funcion2("Matias", "Borda")
mi_funcion2("Ludmila", "Rossi")
mi_funcion2("Kevin", "LaRocca")

# La palabra return en funciones
# Creamos una funcion para sumar
def sumar(a, b):
    return a + b
resultado = sumar(78, 22)
# print(f"El resultado de la suma es: {resultado}")
print(f"El resultado de la suma es: {sumar(55, 45)}")

def sumar2(a = 0, b = 0): # Le damos un valor por default
    return a + b
resultado = sumar2()
print(f"Resultado de la suma: {resultado}")
print(f"Resultado de la suma: {sumar2(22, 66)}")

# Argumentos, variables en funciones
def listarNombres(*nombres): # Normalmente se utiliza lo siguiente: *args
    for nombre in nombres: # Se va a convertir en una tupla
        print(nombre)
listarNombres("Ludmila", "Julieta", "Juani", "Kevin", "Matias")
listarNombres("Angelo", "Mateo", "Juan", "Romeo", "Roman", "Julian")