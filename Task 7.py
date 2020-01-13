"""
A durak deck contains 36 cards. Each card has a suit of either clubs, diamonds, hearts, or spades (denoted C, D, H, S).
Each card also has a value of either 6 through 10, jack, queen, king, or ace (denoted 6, 7, 8, 9, 10, J, Q, K, A).
For scoring purposes card values are ordered as above, with 6 having the lowest and ace the highest value.
Напишите программу, которая определяет, бьёт ли одна карта другую.
Если встречаются две карты одной масти, то побеждает та, у которой выше значение;
Если карты разных мастей, то карта, имеющая козырную масть, побеждает;
Если карты разных мастей и нет козырных, то никто не побеждает.
Формат ввода:
На первой строке через пробел указываются две карты в формате <значение><масть>,
а на следующей строке указывается козырная масть.
Формат вывода:
Программа должна вывести слово
First, если первая карта бьёт вторую,
Second, если вторая карта бьёт первую,
Error, если ни одна из карт не может побить другую.

Sample Input 1:
AH JH
D

Sample Output 1:
First

Sample Input 2:
AH JS
S

Sample Output 2:
Second

Sample Input 3:
7C 10H
S

Sample Output 3:
Error
"""


def check_value():
    len_first = len(first) - 1  # кол-во символов до масти
    len_second = len(second) - 1  # кол-во символов до масти
    if value.index(first[0: len_first]) == value.index(second[0: len_second]):  # карты равны
        print("Error")
    elif value.index(first[0: len_first]) > value.index(second[0: len_second]):  # первая карта старше второй
        print("First")
    else:
        print("Second")


value = "6 7 8 9 10 J Q K A".split()  # для поиска старшей карты
first, second = input().split()
trump = input()

if first[-1] == trump and second[-1] != trump:  # первая козырь, а вторая нет
    print("First")
elif second[-1] == trump and first[-1] != trump:  # вторая козырь, а первая нет
    print("Second")
elif first[-1] == second[-1]:  # масть равна
    check_value()
else:
    print("Error")
