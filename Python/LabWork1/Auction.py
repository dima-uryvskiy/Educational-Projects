class Auction:

    def __init__(self, name, place, date, lot_number, customers, sellers):
        self.name = name
        self.place = place
        self.date = date
        self.lot_number = lot_number
        self.customers = customers
        self.sellers = sellers

    def look_info(self):
        print(
            f"\nОсновная информация: "
            f"\nНазвание: {self.name} "
            f"\nМесто: {self.place}"
            f"\nДата: {self.date} "
            f"\nАукцион №: {self.lot_number} ")

        for customer in self.customers:
            print(customer)

        for seller in self.sellers:
            print(seller)

    def add_product(self, seller, customer):
        self.sellers.append(seller)
        self.customers.append(customer)

    def delete_product(self, id_lot):
        for index, customer in enumerate(self.customers):
            if int(customer.product.lot_number) == id_lot:
                del self.customers[index]

        for index, seller in enumerate(self.sellers):
            if int(seller.product.lot_number) == id_lot:
                del self.sellers[index]
