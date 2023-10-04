
# Bool contiene los valores de True y False
# Los tipos numéricos, es false para 0(cero), true para los demas valores
valor = 0
resultado = bool(valor)
print(f'El valor: {valor}, Resultado: {resultado}')

valor = 1
resultado = bool(valor)
print(f'El valor: {valor}, Resultado: {resultado}')

# Tipo String -> False '', True demás valores
valor = ''
resultado = bool(valor)
print(f'El valor: {valor}, Resultado: {resultado}')

valor = 'Hola'
resultado = bool(valor)
print(f'El valor: {valor}, Resultado: {resultado}')

# Tipo colecciones -> False para colecciones vacias
# Tipo colecciones -> True para todas las demás
# Lista
valor = []
resultado = bool(valor)
print(f'El valor de una lista vacia: {valor}, Resultado: {resultado}')

valor = [2, 3, 4]
resultado = bool(valor)
print(f'El valor de una lista con elementos: {valor}, Resultado: {resultado}')

# Tuplas
valor = ()
resultado = bool(valor)
print(f'El valor de una tupla vacia: {valor}, Resultado: {resultado}')

valor = (5,)
resultado = bool(valor)
print(f'El valor de una tupla con elementos: {valor}, Resultado: {resultado}')

# Diccionario
valor = {}
resultado = bool(valor)
print(f'El valor de un diccionario vacio: {valor}, Resultado: {resultado}')

valor = {'Nombre': 'Juan', 'Apellido': 'Perez'}
resultado = bool(valor)
print(f'El valor de un diccionario con elementos: {valor}, Resultado: {resultado}')

# Sentencias de control con bool
if bool(''):
    print('Regresa verdadero')
else:
    print('Regresa falso')

# ciclos
variable = 3
while variable:
    print('Regresa verdadero')
    break
else:
    print('Regresa falso')
