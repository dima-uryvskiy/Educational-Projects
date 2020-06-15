from Product import *
from Customer import *
from Seller import *
from Auction import *


def find_max_different_price(auctions):
    max_different = 0
    product = ''

    for auction in auctions:
        price = auction.sellers.product.end_price - auction.sellers.product.start_price

        if max_different < price:
            max_different = price
            product = auction.sellers.product

    return product


with open('data.txt', 'r') as file:
    file_input = file.readlines()

data_file = [string.split(',') for string in file_input]

product = None
customers = list()
sellers = list()

for data in data_file:
    for value in data:
        if value == 'product':
            product = Product(data[1], data[2], data[3], data[4], data[5])
            print(product)
        elif value == 'seller':
            sellers.append(data[1], data[2], product)
        elif value == 'customer':
            customers.append(data[1], data[2], product)
        else
            continue


# TODO: тут будет цикл (получить все предметы из файла и насоздавать объектов)
product = Product(2, "Test", "kek", 100, 200)

customer = Customer("Alex Test Testivch", "60 1934", product)
seller = Seller("Ivan Ivanivich Ivnov", "77 7777", product)

auctions = list()

for i in range(1):
    auctions.append(Auction("Yarmarka", "Moscow", "22.05.2020", 1, customer, seller))
    auctions.append(Auction("May", "Moscow", "22.05.2020", 1, customer, seller))
    auctions.append(Auction("Testa", "Moscow", "22.05.2021", 2, customer, seller))




##################################################
print("Введите название аукциона и его дату")
#name_auction = input()
#date_auction = input()


name_auction = 'Yarmarka'
date_auction = '22.05.2020'

option_product = 'kek'

for auction in auctions:
    #  Какие предметы на заданную дату и на заданном аукционе выставлены на продажу.
    if auction.name == name_auction and auction.date == date_auction:
        print(auction)
        print(name_auction)

    #  На каком аукционе продавались предметы заданной специфики.
    if auction.sellers.product.option == option_product:
        print(auction)
        print(option_product)


#  Предмет, имеющий максимальную разницу между начальной и конечной ценами.
print('\nМаксимальная  между начальной и конечной ценами:\n', find_max_different_price(auctions))

#  На каком аукционе было продано больше всего предметов.
print('\nАукцион:')
