from Product import *
from Customer import *
from Seller import *
from Auction import *


# TODO: тут будет цикл (получить все предметы из файла и насоздавать объектов)
product = Product(2, "Test", "kek", 100, 200)

customer = Customer("Alex Test Testivch", "60 1934", product)
seller = Seller("Ivan Ivanivich Ivnov", "77 7777", product)

print(customer)
print(seller)

auction = Auction("Yarmarka", "Moscow", "22.05.2020", 2, customer, seller)

print(auction)

