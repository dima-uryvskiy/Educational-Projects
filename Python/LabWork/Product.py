class Product:

    def __init__(self, lot_number, name, option, start_price, end_price):
        self.lot_number = lot_number
        self.name = name
        self.option = option
        self.start_price = start_price
        self.end_price = end_price

    def __str__(self):
        return f"\nMain info for Product: " \
               f"\n№ Lot: {self.lot_number} " \
               f"\nName: {self.name} " \
               f"\nOption: {self.option} " \
               f"\nStart price: {self.start_price} " \
               f"\nEnd price: {self.end_price}"

