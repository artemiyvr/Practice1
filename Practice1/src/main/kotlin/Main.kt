fun main(args: Array<String>) {
    /*
    Задание 1. Создал константу exercises со значением 13
    Создал переменную exercisesSolved со значением 0
    Увеличил переменную на 1 при решении задачи
    */
    val exercises = 13;
    var exercisesSolved = 0;
    exercisesSolved += 1;
    println(exercises)
    /*
    Задание 2. Создал константу типа Int. Название в соответствии со стандартами - MyAge
    Значение - мой возраст (17)
     */
    val MyAge:Int = 17;
    println(MyAge)
    exercisesSolved += 1
    /*
    Задание 3. Объявил переменную типа Double в соответствии со стандартами - MyAge2, т.к MyAge уже было использовано
    Начальное значение MyAge - 17. Изменил значение переменной MyAge2 на среднее арифметическое
    MyAge2 и 30
     */
    var MyAge2:Double = 17.0;
    MyAge2 = (MyAge2+30)/2;
    println(MyAge2)
    exercisesSolved += 1
    /*
    Задание 4. Создал константу testNumber с целым числом 5 в значении.
    Создал другую константу - evenOdd, значение которой - остаток от деления testNumber на 2
    Заменил testNumber на число 6, evenOdd поменялся на значение 0
     */
    val testNumber:Int = 5;
    val evenOdd = testNumber%2;
    println(evenOdd)
    exercisesSolved += 1
    /*
    Задание 5. Создал переменную answer со значением 0, добавил к ней 1, затем прибавил к результату 10,
    умножил новый результат на 10 и сместил полученный результат на 3 вправо. Конечный результат - 13
     */
    var answer = 0;
    answer +=1;
    answer +=10;
    answer *=10;
    answer = answer shr 3;
    println(answer)
    exercisesSolved += 1
    /*
    Задание 6. Использую var (переменную), т.к она, в отличие от константы (val), может меняться
     */
    var age = 16
    print(age)
    age = 30
    println(age)
    exercisesSolved += 1
    /*
    Задание 7. Создал константы целочисленного типа a = 46 и b = 10
    При замене последней строки кода результат меняется
     */
    val a:Int = 46;
    val b:Int = 10;
    val answer1:Int = (a*100) + b;
    val answer2:Int = (a*100) + (b*100);
    val answer3:Int = (a*100) + (b/10);
    println(answer1)
    println(answer2)
    println(answer3)
    exercisesSolved += 1
    /*
    Задание 8. Создал константу abc целочисленного типа и расставил скобки в нужных местах
     */
    val abc:Int = (5*3)-((4/2)*2);
    println(abc)
    exercisesSolved += 1
    /*
    Задание 9. Создал константы a1 и b1 (a и b уже использовались ранее) типа Double
    Также создал константу average типа double.
    Вычислил среднее арифметическое между a1 и b1 и поместил результат в константу average
     */
    val a1:Double = 15.6;
    val b1:Double = 30.3;
    val average:Double = (a1+b1)/2;
    println(average)
    exercisesSolved += 1
    /*
    Задание 10. Создал константу fahrenheit типа Double и присвоил значение 95.5
    Создал константу celcius типа Double
    Высчитал значение celcius через формулу перевода Градусов по Фаренгейту в Градусы по Цельсию
     */
    val fahrenheit:Double = 95.9;
    val celcius:Double = (fahrenheit - 32) / 1.8;
    println(celcius)
    exercisesSolved += 1
    println(exercisesSolved)
    //больше не знаю
}
