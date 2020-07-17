class Patient:

    def __init__(self, fio, address, sex, age, poliсy, date, complaint, diagnosis):
        self.fio = fio
        self.address = address
        self.sex = sex
        self.age = age
        self.policy = poliсy
        self.date = date
        self.complaint = complaint
        self.diagnosis = diagnosis

    def __str__(self):
        return f'ФИО: {self.fio}\n' \
               f'Адрес: {self.address}\n' \
               f'Пол: {self.sex}\n' \
               f'Возраст: {self.age}\n' \
               f'№ полиса: {self.policy}\n' \
               f'Дата посещения: {self.date}\n' \
               f'Жалоба: {self.complaint}\n' \
               f'Диагноз: {self.diagnosis}'
