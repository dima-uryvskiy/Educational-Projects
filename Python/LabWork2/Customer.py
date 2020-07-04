class Customer:

    def __init__(self, fio, address, car):
        self.fio = fio
        self.address = address
        self.car = car

    def __str__(self):
        return f"Покупатель: ФИО: {self.fio} Координаты: {self.passport} {self.product}"
