# Ejercicio 2 suma de N numeros

num = None
suma = 0
num = int(input("Digite la cantidad de numeros a sumarse: "))
for i in range(num+1):
    suma = suma + i
else:
    print(f'La suma de {num} total es: {suma}')
    