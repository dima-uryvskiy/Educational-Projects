class Paramedic:

    def __init__(self, fio, category, stag, age, special, plot, date,  room, graphic):
        self.fio = fio
        self.category = category
        self.stag = stag
        self.age = age
        self.special = special
        self.plot = plot
        self.date = date
        self.room = room
        self.graphic = graphic

    def __str__(self):
        return f'ФИО: {self.fio} \n' \
               f'Категория: {self.category} \n' \
               f'Стаж: {self.stag} \n' \
               f'Возраст: {self.age} \n' \
               f'Специализация : {self.special} \n' \
               f'Участок: {self.plot} \n' \
               f'Расписание: {self.date} \n' \
               f'Кабинет: {self.room} \n' \
               f'Расписание приема: {self.graphic}'











