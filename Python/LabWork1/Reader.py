from Product import *
from Customer import *
from Seller import *
from Auction import *


class Reader:
    """
        Метод после считывания информации с файла заполняет списки нунжыми объектами
    """
    def read_file(self, file_input):

        #  Разделяем данные с файла по ,
        data_file = [string.replace(' ', '').split(',') for string in file_input]

        product = None
        customers = list()
        sellers = list()
        auctions = list()
        """
             Проверем какого типа данные, создаем нужные и заполняем списки, тк у одного аукциона
             может быть неограниченное число продавцов и товаров
        """
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

        return auctions

