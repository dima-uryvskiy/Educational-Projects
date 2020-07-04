from Customer import *
from Car import *
from Shop import *


def read_file(file_input):
    return [string.replace(' ', '').split(',') for string in file_input]


cars = list()
customers = list()
shops = list()

# Заполнение спискв с файла
with open('car.txt', 'r') as file:
    file_input = file.readlines()
    for data in read_file(file_input):
        cars.append(Car(data[0], data[1], data[2], data[3], data[4], data[5], data[6], data[7]))

with open('customer.txt', 'r') as file:
    file_input = file.readlines()
    car_index = 0
    for data in read_file(file_input):
        customers.append(Customer(data[0], data[1],  cars[car_index]))
        car_index += 1

with open('shop.txt', 'r') as file:
    file_input = file.readlines()
    car_index = 0
    for data in read_file(file_input):
        shops.append(Shop(data[0], cars[car_index]))
        car_index += 1





