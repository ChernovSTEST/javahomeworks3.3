# Домашнее задание к занятию "Testability. Введение в ООП."

## Цель задания

1. Написать свои сервисные классы
2. Научиться писать многофайловую программу

------

## Инструкция к заданию

1. Скачайте и установите профессиональный редактор кода [Intellij Idea Community Version](https://www.jetbrains.com/idea/download/)
1. Откройте IDEA и [создайте новый Java-проект](QA_Java_Idea_Create.md) (под каждую задачу следует создавать отдельный проект, если обратное не сказано в условии)
2. Создайте пустой репозиторий на GitHub и свяжите его с папкой вашего проекта (не с какой-либо другой папкой).
3. Правильно настройте репозиторий в плане `.gitignore`. Проигнорируйте папки `.idea` и `out` и `.iml`-файл - их в репозитории быть не должно.
4. Выполните в IDEA требуемую задачу согласно условию.
5. Проверьте соблюдение [правил форматирования кода](QA_Java_Idea_Format.md)
6. Закоммитьте и отправьте в репозиторий содержимое папки проекта.

------

## Материалы, которые пригодятся для выполнения задания

1. [Как создать Java-проект в IDEA?](QA_Java_Idea_Create.md)
1. [Как отформатировать код в Java?](QA_Java_Idea_Format.md)

------

## Задание 3 (НЕобязательное)

В данной задаче мы считаем, что пользователь вводит корректные значения входных данных.

Вам поручили написать кредитный калькулятор, который считает как на сайте. Но формулы, естественно, не дали.

Вам нужно провести небольшой анализ и написать свой `CreditPaymentService`, который умеет рассчитывать ежемесячный платёж (см. аннуитетный платёж).

Параметры, их количество, типы, а также формулу вам необходимо определить самим.

Обратите внимание: на тех же данных ваш сервис должен считать так же.

Чтобы это продемонстрировать, в `Main` создайте объект и три раза вызовите его метод `calculate`. Результаты каждого вызова выводите в консоль.

Скриншоты для решения задачи. Важно: это не реальный сервис.

![image](https://user-images.githubusercontent.com/53707586/212545840-11c9918b-832a-4f19-9ade-29e5c259ecf8.png)

![image](https://user-images.githubusercontent.com/53707586/212545847-3b72640a-3c13-49dd-bacd-0020c8d4966a.png)

![image](https://user-images.githubusercontent.com/53707586/212545851-949d5826-82dc-47f7-b18a-e476819633af.png)

Подсказка: для возведения чисел в степень в Java изучите и используйте команду `Math.pow`.

------