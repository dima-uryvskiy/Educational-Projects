class Customer:

    def __init__(self, fio, passport, product):
        self.fio = fio
        self.passport = passport
        self.product = product

    def __str__(self):
        return f"\nMain info for Customer: FIO: {self.fio} Passport: {self.passport} {self.product}"
