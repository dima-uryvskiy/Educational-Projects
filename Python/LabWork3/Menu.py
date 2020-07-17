from Customer import *
from Car import *
from Shop import *


def read_file(file_input):
    return [string.replace(' ', '').rstrip('\n').split(',') for string in file_input]


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
        customers.append(Customer(data[0], data[1],  cars[car_index], data[2]))
        car_index += 1

with open('shop.txt', 'r') as file:
    file_input = file.readlines()
    car_index = 0
    for data in read_file(file_input):
        shops.append(Shop(data[0], cars[car_index]))
        car_index += 1


special = 'turbo'
print('\nПокупатель на автомобиль с заданными параметрами.\n')

for customer in customers:
    if special == customer.car.special:
        print(customer)

model = 'X2'
print('\nПокупатель желающие приобрести автомобиль заданной модели.\n')

for customer in customers:
    if model == customer.car.model:
        print(customer)

print('\nСписок автомобилей с пробегом меньше 30 тыс. км.\n')

for car in cars:
    if int(car.state) < 30000:
        print(car)

print('\nСписок новых автомобилей.\n')

for car in cars:
    if int(car.state) == 0:
        print(car)


print('\nПокупатели имеющие необоходимую сумму для покупки автомобиля.\n')

for customer in customers:
    if int(customer.max_price) >= int(customer.car.price):
        print(customer, '\n')

print('\nСамый дорогой автомобиль.\n')
max = int(cars[0].price)

for car in cars:
    if int(car.price) > max:
        max = int(car.price)

for car in cars:
    if int(car.price) == max:
        print(car)


customers.append(Customer('Test', 'London', Car('test', 'test', 2010, 100, 'test', 40000, 'test', 100000), '1500'))
print('\nДобавлен новый покупатель:\n', customers[3])

del customers[3]
print('\nПокупатель удален, количество покупателей на данный момент:\n', len(customers))
