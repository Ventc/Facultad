#Ejercicio 3 leer 10 numeros e imprimir cuantos son positivos, negativos y neutros

pos = 0
neg = 0
neu = 0
num = 0

for i in range(10):
    num = int(input("Digite un numero: "))
    if num > 0:
        pos += 1
    elif num < 0:
        neg += 1
    else:
        neu += 1

else:
    print(f"La cantidad de numeros positivos es: {pos}")
    print(f"La cantidad de numeros negativos es: {neg}")
    print(f"La cantidad de numeros neutros es: {neu}")



