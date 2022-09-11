#Ejercicio 1 Ciclos

anio = 1
while anio == 1:
    anio = int(input("Digite el año: "))
    if ((anio % 4 == 0) and (anio % 100 != 0)) or (anio % 400 == 0):
        print(f"{anio} es año bisiesto")
    else:
        print(f"{anio} no es año bisiesto")
    anio = int(input("Para seguir adelante digite la opcion 1: "))
else:
    print("Adios")