class Seller:

    def __init__(self, fio, passport, product):
        self.fio = fio
        self.passport = passport
        self.product = product

    def __str__(self):
        return f"\nMain info for Seller: FIO: {self.fio} Passport: {self.passport} {self.product}"


