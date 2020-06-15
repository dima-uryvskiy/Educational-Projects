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

data_file = [string.replace(' ', '').split(',') for string in file_input]

product = None
customers = list()
sellers = list()
auctions = list()

for data in data_file:
    for value in data:
        if value == 'product':
            product = Product(data[1], data[2], data[3], data[4], data[5])
        elif value == 'customer':
            customers.append(Customer(data[1], data[2], product))
        elif value == 'seller':
            sellers.append(Seller(data[1], data[2], product))
        elif value == 'auction':
            auctions.append(Auction(data[1], data[2], data[3], data[4], customers, sellers))
            sellers = list()
            customers = list()
        else:
            continue
"""
for auction in auctions:
    print(auction)
    for seller in auction.sellers:
        print(seller)
    for customer in auction.customers:
        print(customer)
"""

name_auction = 'Yarmarka'
date_auction = '22.05.2020'
option_product = 'Image1'

for auction in auctions:
    #  Какие предметы на заданную дату и на заданном аукционе выставлены на продажу.
    if auction.name == name_auction and auction.date == date_auction:
        print(auction)

    #  На каком аукционе продавались предметы заданной специфики.
    for seller in auction.sellers:
        if seller.product.option == option_product:
            print(auction)

# TODO: написать метод для красивого вывода
#  Предмет, имеющий максимальную разницу между начальной и конечной ценами.
#print('\nМаксимальная  между начальной и конечной ценами:\n', find_max_different_price(auctions))

#  На каком аукционе было продано больше всего предметов.
#print('\nАукцион:')
