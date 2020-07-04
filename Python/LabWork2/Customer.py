class Customer:

    def __init__(self, fio, address, car, max_price):
        self.fio = fio
        self.address = address
        self.car = car
        self.max_price = max_price

    def __str__(self):
        return f"Покупатель: ФИО: {self.fio} Координаты: {self.address} {self.car}, максимальная цена: {self.max_price}"
