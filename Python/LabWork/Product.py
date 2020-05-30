class Product:

    def __init__(self, name, option, start_price, end_price):
        self.name = name
        self.option = option
        self.start_price = start_price
        self.end_price = end_price

    def __str__(self):
        return "Main info for Product: {0} {1} {2}".format(self.name,  self.option, self.start_price, self.end_price)
