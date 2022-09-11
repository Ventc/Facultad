print("Hola mundo!")

miVariable = 3
print(miVariable)
miVariable = "Hola a todos los estudiantes de la tecnicatura"
print(miVariable)
miVariable = 3.5
print(miVariable)
x = 10
y = 2
z = x + y
print(id(x))

print(id(y))
print(id(z))

a = True
print(type(a))

# Tipos int, float, String, Bool
x = 10
print(x)
print(type(x))
x = 14.5
print(x)
print(type(x))
x = "Hola alumnos"
print(x)
print(type(x))
x = True
print(x)
print(type(x))
x = False
print(x)
print(type(x))

# Manejo de Cadenas (String)

"""
miGrupoFavorito = "Simple Plan:"
caracteristicas = "The Best Band Rock"
print("Mi grupo favorito es:", miGrupoFavorito, caracteristicas)
"""

# numero1 = "7"
# numero2 = "8"
# print(int(numero1) + int(numero2))

# Tipos Boleanos (bool)

"""
miBooleano = 3 > 2
print(miBooleano)

if miBooleano:
    print("El resultado es verdadero")
else:
    print("El resultado es falso")
"""

# Procesar la entrada del usuario
# función input
# resultado = input("Digite un numero: ")  # regresa un dato tipo string
# print(resultado)

# Conversión de la entrada de datos
"""
numero1 = int(input("Escribe el primer numero: "))
numero2 = int(input("Escribe el segundo numero: "))
resultado = numero1 + numero2
print("El resultado de la suma es: ", resultado)
"""

# Ejercicio
"""
alto = int(input("Proporciona el alto del rectangulo: "))
ancho = int(input("Proporciona el ancho del rectangulo: "))
area = alto * ancho
print("el area es: ", area)
perimetro = (alto + ancho) * 2
print("el perímetro es: ", perimetro)
"""

miVariable3 = 10
print(miVariable3)

# Operadores de Reasignación
miVariable3 = miVariable3 + 1
print(miVariable3)

miVariable3 += 1
print(miVariable3)

# miVariable3 = miVariable3 - 2
miVariable3 -= 2
print(miVariable3)

# miVariable3 = miVariable3 * 3
miVariable3 *= 3
print(miVariable3)

# miVariable3 = miVariable3 / 2
miVariable3 /= 2
print(miVariable3)

# Operadores de Comparación

d = 4
b = 6
resultado = d == b  # Comprobamos si son iguales
print(resultado)

# Operador Diferente
resultado = d != b
print(resultado)

# Operador Mayor que
resultado = d > b
print(resultado)

# Operador Menor que
resultado = d < b
print(resultado)

# Operador Menor o Igual que
resultado = d <= b
print(resultado)

# Operador Mayor o Igual que
resultado = d >= b
print(resultado)

# Ejercicio: Numero par o impar
# 1: Solicitamos al usuario que ingrese un numero
# 2: Este se asigna a una variable
# 3: Utilizaremos la estructura "if else"
# 4: La formula: <num> % 2 == 0 esta operación nos dice si es un numero par
# 5: Si es True imprimimos que es par
# 6: Si es False imprimimos que es impar

"""
num1 = int(input("Proporciona un número: "))
if num1 % 2 == 0 :print(f"el número {num1} es par")
else :print(f"el número {num1} es impar")
"""
# Ejercicio: Determinar si es mayor de edad
# 1: Solicitamos al usuario que ingrese un numero
# 2: Almacenar el valor en una variable
# 3: Utilizaremos la estructura "if else"
# 4: La formula: <num> >= 18
# 5: Si es True: Eres mayor de edad, imprimir
# 6: Si es False: Eres menor de edad, imprimir

"""
num1 = int(input("Escribe tu edad: "))
if num1 >=18:print(f"{num1} Es mayor de edad")
else :print(f"{num1} Es menor de edad")
"""

# Ejercicio
"""
valor = int(input("Digite un numero: "))
valorMinimo = 0
valorMaximo = 5
dentroRango = (valor >= valorMinimo and valorMaximo <= valorMaximo)
if dentroRango:
    print(f'El valor {valor} esta dentro del rango')
else:
    print(f'El valor {valor} No esta dentro del rango')
"""

# Ejercicio con el operador or

vacaciones = False
diasDescanso = False

if not (vacaciones or diasDescanso):
    print('Tiene trabajo que hacer')
else:
    print('Puede asistir al juego')


# Ejercicio

edad = int(input("Digite su edad: "))
veinte = edad >= 20 and edad < 30
print(veinte)
treinta = edad >= 30 and edad < 40
print(treinta)

# if veinte or treinta:
"""
if (edad >= 20 and edad < 30) or (edad >= 30 and edad < 40):
    print("Estas dentro del rango de los (20'0) a (30'0) años")

#   if veinte:
#    print("Estas dentro del rango de los (20'0) años")
#    elif treinta:
#    print("Estas dentro del rango de los (30'0) años")
#    else:
#    print('No estas dentro del rango')

else:
    print("No estas dentro del rango de los (20'0) a (30'0) años")
"""

# Ejercicio

num1 = int(input("Ingrese un número: "))
num2 = int(input("Ingrese otro número: "))
if num1 > num2: print(f"{num1} es el mayor de los dos números")
else: print(f"{num2} es el mayor de los dos numeros")

# Ejercicio

nombre = input("Digite el nombre del libro: ")
id = int(input("Digite el ID del libro: "))
precio = float(input("Digite el preico del libro: "))
envio = bool(input("Indique si el envio es gratuito (True/False): "))
print(f"Nombre: {nombre}")
print(f"id: {id}")
print(f"precio: {precio}")
if envio:
    print("Envio: Gratuito")
else:
    print("Envio: No posee Envio Gratuito")

