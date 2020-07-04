class Customer:

    def __init__(self, fio, address, car, max_price):
        self.fio = fio
        self.address = address
        self.car = car
        self.max_price = max_price

    def __str__(self):
        return f'ФИО: {self.fio}\nКоординаты: {self.address}\nМаксимальная цена: {self.max_price}\n{self.car}'
