class Seller:

    def __init__(self, fio, pasport, product):
        self.fio = fio
        self.pasport = pasport
        self.product = product

    def __str__(self):
        return "Main info for Seller: {0} {1} {2}".format(self.fio, self.pasport, self.product)
