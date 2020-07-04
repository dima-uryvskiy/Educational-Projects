class Car:

    def __init__(self, firm, model, year, power_engine, transmission, state, special, price):
        self.firm = firm
        self.model = model
        self.year = year
        self.power_engine = power_engine
        self.transmission = transmission
        self.state = state
        self.special = special
        self.price = price

    def __str__(self):
        return f"Авто: " \
               f"Фирма: {self.firm} " \
               f"Модель: {self.model} " \
               f"Год выпуска: {self.year} " \
               f"Мощность двигателя: {self.power_engine}" \
               f"Коробка: {self.transmission} " \
               f"Состояние: {self.state} " \
               f"Особенности: {self.special} " \
               f"Цена: {self.price}"
