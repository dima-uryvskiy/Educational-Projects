from Product import *
from Customer import *
from Seller import *
from Auction import *
from Reader import *


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

reader = Reader()
auctions = reader.read_file(file_input)
name_auction = 'Yarmarka'
date_auction = '22.05.2020'
option_product = 'Image1'

for auction in auctions:
    #  Какие предметы на заданную дату и на заданном аукционе выставлены на продажу.
    if auction.name == name_auction and auction.date == date_auction:
        auction.look_info()

    #  На каком аукционе продавались предметы заданной специфики.
    for seller in auction.sellers:
        if seller.product.option == option_product:
            auction.look_info()

# TODO: написать метод для красивого вывода

#  Предмет, имеющий максимальную разницу между начальной и конечной ценами.
#print('\nМаксимальная  между начальной и конечной ценами:\n', find_max_different_price(auctions))

#  На каком аукционе было продано больше всего предметов.
#print('\nАукцион:')
