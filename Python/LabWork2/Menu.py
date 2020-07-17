from Patient import *
from Paramedic import *
from Plot import *


def read_file(file_input):
    return [string.replace(' ', '').replace('-', ' ').rstrip('\n').split(',') for string in file_input]


paramedics = list()
patients = list()
plots = list()

with open('plot.txt', 'r') as file:
    file_input = file.readlines()
    for data in read_file(file_input):
        plots.append(Plot(data[0], data[1]))

with open('paramedic.txt', 'r') as file:
    file_input = file.readlines()
    index_plot = 0
    for data in read_file(file_input):
        paramedics.append(Paramedic(data[0], data[1], data[2], data[3], data[4], plots[index_plot], data[5], data[6], data[7]))
        index_plot += 1

with open('patient.txt', 'r') as file:
    file_input = file.readlines()
    for data in read_file(file_input):
        patients.append(Patient(data[0], data[1], data[2], data[3], data[4], data[5], data[6], data[7]))


print('\nСписки пациентов, обслуживаемых данным врачом:')
select_doctor = paramedics[2]
for doctor in paramedics:
    if select_doctor.plot.address == doctor.plot.address:
        for person in patients:
            if select_doctor.plot.address == person.address:
                print(person)

print('\nСколько медсестер на каждом участке:')
for doctor in paramedics:
    if doctor.special == 'medsister':
        print(doctor.plot, ' - 1')
    else:
        print(doctor.plot, ' - 0')

print('\nРасписание приема всех врачей заданной специализации:')
select_special = paramedics[0].special
for doctor in paramedics:
    if select_special == doctor.special:
        print('ФИО:', doctor.fio, 'Кабинет:', doctor.room, 'Время:', doctor.date, doctor.graphic)


print('\nАдрес данного больного, дата последнего посещения поликлиники и диагноз:')
select_person = patients[2]
for person in patients:
    if select_person.fio == person.fio:
        print('Адрес:', person.address, 'Дата обращения:', person.date, 'Диагноз:', person.diagnosis)