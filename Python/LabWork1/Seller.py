class Seller:

    def __init__(self, fio, passport, product):
        self.fio = fio
        self.passport = passport
        self.product = product

    def __str__(self):
        return f"Основная информация о продаце: ФИО: {self.fio} Паспорт: {self.passport} {self.product}"


