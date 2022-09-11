#Ejercicio 7 calcular el salario de las horas trabajadas de 5 personas

sumaSalario = 0
for i in range(5):
    nombre = input("Digite el nombre del empleado: ")
    horas = int(input("Digite el numero de horas laboradas: "))
    salario = float(input("Digite el salario del empleado: "))
    salario=horas*salario
    sumaSalario=salario+sumaSalario
    print(f"El nombre de los empleado es: {nombre}")
    print(f"Sus salario a pagar son: {salario}")
else:
    print(f"la suma de los salarios es: {sumaSalario}")





