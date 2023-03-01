class Monitor:

    contador_monitores = 0

    def __init__(self, marca, tamaño):
        Monitor.contador_monitores += 1
        self.id_monitor = Monitor.contador_monitores
        self._marca = marca
        self._tamaño = tamaño

    def __str__(self):
        return f"Id: {self.id_monitor}, Marca: {self._marca}, Tamaño: {self._tamaño}"


if __name__ == "__main__":
    monitor1 = Monitor("HP", "15 Pulgadas")
    print(monitor1)
    monitor2 = Monitor("LG", "27 Pulgadas")
    print(monitor2)
