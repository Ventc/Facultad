#Ejercicio 4 leer 10 calificaciones se calculara el promedio y la nota más baja

calificacion = 0
promedio = 0
califBaja = 100
sumaCalif = 0

for i in range (10):
    calificacion = float(input(f"Digite la {i + 1}calificacion: "))
    sumaCalif = sumaCalif + calificacion
    if calificacion < califBaja:
        califBaja = calificacion
else:
    print(f"El promedio de las 10 calificaciones es {sumaCalif / 10}")
    print(f"La calificacion mas baja es {califBaja}")