class Product:

    def __init__(self, lot_number, name, option, start_price, end_price):
        self.lot_number = lot_number
        self.name = name
        self.option = option
        self.start_price = start_price
        self.end_price = end_price

    def __str__(self):
        return f"\nОсновная информация о предмете: " \
               f"\nЛот №: {self.lot_number} " \
               f"\nНазвание: {self.name} " \
               f"\nСпецифика: {self.option} " \
               f"\nНачальная цена: {self.start_price} " \
               f"\nКонечная цена: {self.end_price}"

