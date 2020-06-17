from Reader import *


def find_max_different_price(auctions):
    max_different = 0
    product = ''

    for auction in auctions:
        for seller in auction.sellers:
            price = int(seller.product.end_price) - int(seller.product.start_price)
        if max_different < price:
            max_different = price
            product = seller.product

    print('Разница:', max_different)
    return product


def find_max_price_customer(auctions):
    max_different = 0
    max_customer = ''

    for auction in auctions:
        for customer in auction.customers:
            price = int(customer.product.end_price)
        if max_different < price:
            max_different = price
            max_customer = customer

    print('Цена', max_different)
    return max_customer


def find_max_price_seller(auctions):
    max_different = 0
    max_seller = ''

    for auction in auctions:
        for seller in auction.sellers:
            price = int(seller.product.end_price)
        if max_different < price:
            max_different = price
            max_seller = seller

    print('Цена', max_different)
    return max_seller


def find_count_product(auctions):
    max_count = 0
    count = 0
    max_auction = None

    for auction in auctions:
        for seller in auction.sellers:
            if seller.product.name != '':
                count += 1
                max_auction = auction

            if max_count < count:
                max_count = count
        count = 0

    print('Число предметов:', max_count)
    return max_auction


with open('data.txt', 'r') as file:
    file_input = file.readlines()

reader = Reader()
auctions = reader.read_file(file_input)
name_auction = 'Yarmarka'
date_auction = '22.05.2020'
option_product = 'Image'

for auction in auctions:
    if auction.name == name_auction and auction.date == date_auction:
        print('\nКакие предметы на заданную дату и на заданном аукционе выставлены на продажу.')
        auction.look_info()

    for seller in auction.sellers:
        if seller.product.option == option_product:
            print('На каком аукционе продавались предметы заданной специфики.')
            auction.look_info()

print('Предмет, имеющий максимальную разницу между начальной и конечной ценами.')
print(find_max_different_price(auctions))

print('На каком аукционе было продано больше всего предметов.')
find_count_product(auctions).look_info()

print('Покупатель самого дорогого лота.')
print(find_max_price_customer(auctions))

print('Продавец самого дорогого лота')
print(find_max_price_seller(auctions))


print('Добавим предмет для первого ацкциона')

product = Product(777, 'Test', 'House', 1000, 2000)

auctions[0].add_product(Seller('Ivan1 Ivanivich2 Ivnov3', '77 7600', product), Customer('Alex6 Test5 Testivch4', '60 1122', product))

auctions[0].look_info()
