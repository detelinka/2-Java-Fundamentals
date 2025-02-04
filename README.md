# CHEAT SHEET - JAVA FUNDAMENTALS

## Data Types an Variables / Типове данни
```java
### Integer Data Types / Целочислени типове данни
byte - Byte.parseByte(scanner.nextLine());
short - Short.parseShort(scanner.nextLine());
int - Integer.parseInt(scanner.nextLine());
long - Long.parseLong(scanner.nextLine());
Big Integer - new Big Integer(scanner.nextLine());

### Decimal Data Types / Дробни типове данни
float - Float.parseFloat(scanner.nextLine());
double - Double.parseDouble(scanner.nextLine());

### Boolean Data Type / Булев тип данни
boolean - true / false или булев израз, в който има оператор за сравнение

### Character Data Type / Символен тип данни
char - scanner.nextLine().charAt(0);
```
![image](https://github.com/user-attachments/assets/17f0f9f4-9864-4bef-82a4-e071f30c8515)

## Arrays / Масиви
```java
### Създаване на масив
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
int[] numbers = {10, 20, 30, 40};

### Allocating an array of 10 integers:
int[] numbers = new int[10];    // All elements are initially == 0;

### Четене на масив от конзолата
1. Масив от текстове: String[] stringArr = scanner.nextLine().split(" ");
2. Масив от цели числа: int[] integerArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
3. Масив от дробни числа: double[] doubleArr = Arrays.stream(scanner.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
4. Масив от символи: char[] charArr = scanner.nextLine().toCharArray();

### Достъпване на елемент на масив
1. Масив от текстове: String firstItem = stringArr[0];
2. Масив от цели числа: int firstItem = integerArr[0];
3. Масив от дробни числа: double firstItem = doubleArr[0];
4. Масив от символи: char firstItem = charArr[0];

### Сортиране на масив
1. Масив от текстове: Arrays.sort(stringArr);
2. Масив от цели числа: Arrays.sort(integerArr);
3. Масив от дробни числа: Arrays.sort(doubleArr);
4. Масив от символи: Arrays.sort(charArr);

### Отпечатване на масив
1. Метод For цикъл:     for (int i = 0; i < integerArr.length; i++) { System.out.print(integerArr[i] + " ");}
2. Метод Foreach цикъл: for (int item : integerArr) { System.out.print(item + " ");}  
3. Метод String.join (само за масив от текстове): System.out.println(String.join(", ", stringArr));
4. Метод replaceAll: System.out.println(Arrays.toString(integerArr).replaceAll("[\\[\\]]",""));
```

## Lists / Листове
```java
### Четене на лист от конзолата
Лист от текстове: List stringList = Аrrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
Лист от цели числа: List integerList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
Лист от дробни числа: List doubleList = Arrays.stream(scanner.nextLine().split(" ")).map(Double::parseDouble).collect(Collectors.toList());

### Методи
integerList.get(index) – връща елемента на позицията (index), подадена като аргумент в скобите
integerList.size() – връща цяло число – брой на елементите в листа
integerList.indexOf(element) – връща цяло число – позицията, на която се намира елемента (element)
integerList.isEmpty() – връща булева стойност true при празен лист, с 0 елемента; връша булева стойност false при пълен лист, с минимум 1 елемент в него
integerList.contains(element) – връща булева стойност true, ако елемента се съдържа в листа; връща булева стойност false, ако елемента НЕ се съдържа в листа
integerList.add(element) – добавя елемента в края на листа
integerList.add(index, element) – вмъква елемента на позицията, която сме подали като аргумент
integerList.set(index, element) – заменя елемент на конкретна позиция с новия елемент
integerList.remove(index) – премахва елемент на дадената позиция
integerList.remove(Integer.valueOf(elment)) – премахва елемент, ако съществува в листа
Ако елементът е примитивен тип данни (double, int), чрез ValueOf() трябва да го превърнем в референтен тип данни, за да знае компилатора, че това е елемент.
Ако го оставим int компилатора ще припознае числото като индекс / позиция, а не като елемент от листа.
Ако елемента не съществува няма да ни даде грешка, просто ще игнорира командата.
integerList.addAll(numList) – може да добавим всички елементи от една колекция в друга; добавят се в края на колекцията
Collections.sort(integerList) - сортираме елементите в листа в нарастващ ред (ascending order)
Collections.reverse(integerList) – обръщаме реда на елементите в листа, независимо от това дали са сортирани или не

### Отпечатване на лист
****For цикъл: for (int i = 0; i < integerList.size(); i++) { System.out.print(integerList.get(i) + " "); }
Foreach цикъл: for (int item : integerList) { System.out.print(item + " "); }
Метод String.join (само за лист от текстове): System.out.println(String.join(", ", stringList));
Метод replaceAll: System.out.println(integerList.toString().replaceAll("[\[\],]", ""));
```

## Objects and Classes / Обекти и класове

## Associative Arrays / Мапове

## Text Processing
```java
### Превръщане на Стринг от и до чар масив:
String str = new String(new char[] {'s', 't', 'r'});
char[] charArr = str.toCharArray(); // ['s', 't', 'r']

### Конкатенация на стрингове
String text = "Hello" + ", " + "world!";  // "Hello, world!"
String text = "Hello, "; text += "John";  // "Hello, John"

String greet = "Hello, "; String name = "John"; 
String result = greet.concat(name); // "Hello, John"

String t = String.join("", "con", "ca", "ten", "ate");  // "concatenate"

```
## Regular Expressions
```java
### Основен синтаксис:
[A-Z] - една главна буква (аски код от 65 до 90)
[a-z] - една малка буква (аски код от 97 до 120)
[0-9] - една цифра [0-9] (аски код от 48 до 57)
[A-Za-z] - една буква, която или е малка, или е голяма
[aeiou] - всички гласни букви
[^aeiou] - всички съгласни букви
\w - един символ, който може да е малка буква, главна буква, цифра или _
\W - един символ, различен от малка буква, главна буква, цифра или _
\s - един интервал
\S - един символ, различен от интервал
\d - една цифра [0-9] (аски код от 48 до 57)
\D - един символ, различен от цифра

### Брой на срещанията:
* -> срещания 0 или безброй много пъти
+ -> срещания 1 или безброй много пъти
? -> срещания 0 или 1 пъти
{число} -> срещания {число} пъти
{число, } -> минимум колко пъти 
{число1, число2} -> минимум се среща число1 пъти, максимум се среща число2 брой пъти
() -> обособяваме група
(?<name> шаблон) -> обособяваме група с име

### Използване в Java:
String text = scanner.nextLine();
String regex = "\\b[A-Z][a-z]+ [A-Z][a-z]+\\b"; //текст на шаблона
Pattern pattern = Pattern.compile(regex); // шаблон
Matcher matcher = pattern.matcher(text); //текстовете от променливата text, които отговарят на шаблона
```


