# Поиск дубликантов.

### Программа написана на языке Scala.

## Описание решения.
Задается размерность коллекции, затем она проверяется на принадлежность диапазону 0 - 100 000. После происходит заполнение массива числами, проверка на то, чтобы их количество было равным количеству коллекции, и проверка каждого значения на принадлежность диапазону 0 - 100 000. Далее происходит группировка коллекции и подсчет одинаковых чисел и из последнего значения вычитается 1. После выводится количество "лишних" элементов в коллекции.

## Команды для сборки и запуска программы.

### Сбока программы:
	make build
### Запуск программы
    make run
