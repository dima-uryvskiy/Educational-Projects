"""
Напишите программу, которая выводит число в стиле LCD калькулятора.
На вход программе подаётся последовательность цифр, которую нужно вывести на экран в специальном стиле (см. пример).
Размер всех цифр 4 символа в ширину и 7 символов в высоту. Между цифрами в выводе должен быть один пустой столбец.
Перед первой цифрой не должно быть пробелов.
Выведенные цифры должны быть обведены рамочкой, в углах которой находится символ x ("икс"), горизонтальная линия
создаётся из символа - ("дефис"), а вертикальная -- из символа вертикальной черты: |.
Формат ввода:
Строка произвольной длины (минимум один символ), содержащая последовательность цифр.
Формат вывода:
9 строк, содержащих цифры, записанные в указанном в задании формате.

Sample Input:
0123456789

Sample Output:
x-------------------------------------------------x
| --        --   --        --   --   --   --   -- |
||  |    |    |    | |  | |    |       | |  | |  ||
||  |    |    |    | |  | |    |       | |  | |  ||
|           --   --   --   --   --        --   -- |
||  |    | |       |    |    | |  |    | |  |    ||
||  |    | |       |    |    | |  |    | |  |    ||
| --        --   --        --   --        --   -- |
x-------------------------------------------------x
"""


input_string = list(map(lambda x: int(x), ''.join(input().split())))

dict_result = {0: (' -- ', '|  |', '|  |', '    ', '|  |', '|  |', ' -- '),
               1: ('    ', '   |', '   |', '    ', '   |', '   |', '    '),
               2: (' -- ', '   |', '   |', ' -- ', '|   ', '|   ', ' -- '),
               3: (' -- ', '   |', '   |', ' -- ', '   |', '   |', ' -- '),
               4: ('    ', '|  |', '|  |', ' -- ', '   |', '   |', '    '),
               5: (' -- ', '|   ', '|   ', ' -- ', '   |', '   |', ' -- '),
               6: (' -- ', '|   ', '|   ', ' -- ', '|  |', '|  |', ' -- '),
               7: (' -- ', '   |', '   |', '    ', '   |', '   |', '    '),
               8: (' -- ', '|  |', '|  |', ' -- ', '|  |', '|  |', ' -- '),
               9: (' -- ', '|  |', '|  |', ' -- ', '   |', '   |', ' -- ')
               }


def print_border(len_s=len(input_string)):
    print('x', end='')
    print('-' * len_s * 5, end='')
    print('x')


print_border()

for i in range(7):
    first = True
    for key in input_string:
        if first:
            print('|', end='')
        print(dict_result[key][i], end=' ')
        first = False
    print('|')

print_border()
