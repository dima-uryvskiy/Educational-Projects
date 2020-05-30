class Auction:

    def __init__(self, name, place, date, lot_number, customers, sellers):
        self.name = name
        self.place = place
        self.date = date
        self.lot_number = lot_number
        self.customers = customers
        self.sellers = sellers

    def __str__(self):
        return f"\nMain info for Auction: " \
               f"\nName: {self.name} " \
               f"\nPlace: {self.place}" \
               f"\nDate: {self.date} " \
               f"\n№ Lot: {self.lot_number} " \
               f"\nCustomers: {self.customers} " \
               f"\nSellers: {self.sellers}"
