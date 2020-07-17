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
        return f'Авто: ' \
               f'Фирма: {self.firm} \n' \
               f'Модель: {self.model} \n' \
               f'Год выпуска: {self.year} \n' \
               f'Мощность двигателя: {self.power_engine} \n' \
               f'Коробка: {self.transmission} \n' \
               f'Состояние: {self.state} \n' \
               f'Особенности: {self.special} \n' \
               f'Цена: {self.price}'
