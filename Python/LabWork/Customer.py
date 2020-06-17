class Customer:

    def __init__(self, fio, passport, product):
        self.fio = fio
        self.passport = passport
        self.product = product

    def __str__(self):
        return f"Основная информация о покупателе: ФИО: {self.fio} Паспорт: {self.passport} {self.product}"
