public class Main {
    public static void main(String[] args) {
        // Шпаргалка.Строки.
        System.out.println("Шпаргалка");
        // Сравнение строк.Метод equals.
        System.out.println("Сравнение строк.Метод equals.");
        String s = "Hello, world!";
        String s2 = "Hello, world!";
        String s3 = "Hello, Ivan!";
        String s4 = "Hello, " + "world!";

        boolean sEqualsS2 = s.equals(s2);
        System.out.println(sEqualsS2);
        // Будет присвоено значение true, так как содержимое строк равно

        boolean sEqualsS3 = s.equals(s3);
        System.out.println(sEqualsS3);
        // Будет присвоено false, так как содержимое разное

        boolean sEqualsS4 = s.equals(s4);
        System.out.println(sEqualsS4);
        // "Будет присвоено true, так как содержимое двух разных строк сложилось и превратилось
        // в одну строку, содержимое которой идентично содержимому строки s
        // Чтобы сравнить строки без учета регистра, нам необходимо заменить метод equals"

        // Сравнение строк. Метод equalsIgnoreCase.
        System.out.println("Сравнение строк. Метод equalsIgnoreCase.");
        String s5 = "Anna";
        String s6 = "ANNA";

        boolean s5EqualsS6 = s5.equals(s6);
        System.out.println(s5EqualsS6);
        /* false, так как данный метод сравнивает полную идентичность,
        в том числе регистр буквы (строчная или заглавная) */

        boolean s5EqualsIgnoreCaseS6 = s5.equalsIgnoreCase(s6);
        System.out.println(s5EqualsIgnoreCaseS6);
        /* true, так как при вызове метода будет запущен цикл по всем символам обеих
        строк, каждый из которых будет преобразован в нижний регистр, а затем будет
        осуществлено сравнение каждой пары символов через оператор ==, так как
        символы (char) являются примитивами */

        // Размер строки.Метод length.
        System.out.println("Размер строки.Метод length.");
        String x = "abc";
        int xLength = x.length(); // Будет присвоено значение 3
        System.out.println("Размер строки " + xLength + " символа.");
        // Пример:
        //Мы разработали регистрационную форму, где просим пользователя ввести email.
        //Чтобы проверить, что пользователь что-то ввел, а уже в дальнейшем проводить более
        // глубокий анализ над содержимым, нам требуется осуществить проверку, пуста ли строка
        // (равна ли ее длина 0).
        //Подобный код мог выглядеть так:
        if (x.length() == 0) {
            throw new RuntimeException("Внимание!Не забудьте ввести свой E - MAIL !!!");
        // Печатаем ошибку и просим пользователя ввести email
        }

        //Но мы ведь теперь работаем с методами, а они зачастую облегчают для нас
        // шаблонные задачи.

        if (x.isEmpty()) {
            throw new RuntimeException("Внимание!Не забудьте ввести свой E-MAIL !!!");
        // Печатаем ошибку и просим пользователя ввести email
        }
        // Два метода для решения задачи: isEmpty и length.Оба рабочие.


        // Различные проверки строки.
        System.out.println("Различные проверки строки.");
        String z = "abcde";

        boolean xContains = z.contains("bcd");
        System.out.println(xContains);
        // true, так как строка s действительно содержит внутри себя последовательность символов
        // "bcd"

        boolean zEndWith = z.endsWith("de");
        System.out.println(zEndWith);
        // true, так как строка s действительно заканчивается на "de"

        boolean zStartsWith = z.startsWith("ab");
        System.out.println(zStartsWith);
        // true, так как строка s действительно начинается с "ab"

        boolean zEquals = z.equals("abcde");
        System.out.println(zEquals);
        // true, так как содержимое строк равно

        boolean zEqualsIgnoreCase = z.equalsIgnoreCase("ABCDE");
        System.out.println(zEqualsIgnoreCase);
        // true, так как при приведении к нижнему регистру содержимое строк равно

        boolean zIsEmpty = z.isEmpty();
        System.out.println(zIsEmpty);
        // false, так как s.length() не равен 0

        boolean zIsBlank = z.isBlank();
        System.out.println(zIsBlank);

        // false, так как s.length() не равен 0 и имеет буквы и/или числа

        boolean zNumber = "   ".isBlank();
        System.out.println(zNumber);
        // true, так как строка не имеет внутри букв и чисел, но состоит из пробелов,
        // т. е. пуста (этот метод отсутствует в 8-й версии Java)


        // Другие популярные методы для работы со строками
        //Теперь пора узнать и о других методах, позволяющих нам работать со строками комфортно.
        System.out.println("Методы для комфортной работы.");
        String w = "abcde";
        char c = w.charAt(2);
        System.out.println(c);
        /* c будет инициализировано значением c, так как именно оно стоит
        на третьей позиции в строке s (строка — это массив, т. е. 3-я позиция
        располагается под индексом 2) */

        String a = "abcd";
        String s10 = a.toUpperCase();
        System.out.println(s10);
        /* s10 будет присвоена копия строки s, где все символы будут в верхнем
        регистре, т. е. "ABCD" */

        String b = "ABCD";
        String s11 = b.toLowerCase();
        System.out.println(s11);
        /* s11 будет присвоено значение строки s, но все символы снова перейдут
        в нижний регистр, т. е. "abcd" */

        String t = "   abcd    ";
        String s12 = t.trim();
        System.out.println(s12);
        /* s12 будет присвоено значение строки s, но без «лидирующих» и
        «завершающих» пробелов, они будут удалены, т. е. "abcd" */

        String d = "My name is Ivan";
        String[] ws = d.split(" ");
        System.out.println(ws);
        /* Данный метод создаст из строки массив, разбив ее на части.
        Разделитель указывается в скобках. Мы указали в скобках пробел,
        следовательно, делить строку на элементы метод будет в тех местах,
        где стоит пробел, т. е. words будет равно {"My", "name", "is", "Ivan"} */
        //Что-то,не работает метод!!!

        String e  = "abcd";
        char[] cj = e.toCharArray();
        System.out.println(cj);
        /* Преобразует строку в массив символов, присвоив c массив
        вида {'a', 'b', 'c', 'd'} */
        // И этот метод не работает!

        String f = "abcdef";
        String s13 = f.substring(2, 4);
        System.out.println(s13);
        /* s13 получит значение, которое находится в строке s, начиная
        с индекса 2 включительно и заканчивая индексом 4 не включительно, т. е. "cd" */

        String g  = "ab c de";
        String s14 = g.replace(" ", "");
        System.out.println(s14);
        /* s14 получит копию строки s, но из этой копии будут удалены все
        пробелы (заменены символы из первого параметра (пробел) на символ
        из второго параметра (пустая строка)) */

        String s22 = g.replace("a", "b");
        System.out.println(s22);
        /* s2 получит строку s, где все символы 'a' (первый параметр)
        будут заменены на 'b' (второй параметр), т. е. "bb c de" */

        String fN = "#";
        String s125 = fN.repeat(10);
        System.out.println(s125);
        /* s1 получит строку s, которая будет повторена 10 раз (значение из скобок),
        т. е. "##########" */
        StringBuilder sb = new StringBuilder("Mot♂rhead");
        System.out.println(sb);
        // Будет создана сущность StringBuilder на основе пустой строки

        StringBuilder sv = new StringBuilder("123");
        System.out.println(sv);
        // Будет создана сущность StringBuilder на основе строки "123"
        sv.append("456");
        System.out.println(sv);
        // Добавит нашей сущности sv (с "123" внутри) строку "456",
        // изменив содержимое на "123456".
        // char c = sv.charAt(1);
        // System.out.println(sv);
        // Также вернет символ по индексу 1, т. е. c получит значение '2', так как именно этот
        // символ находится на второй позиции

        int svLength = sv.length();
        System.out.println(svLength);
        // Получит значение 6, так как именно такая длина у нашей строки "123456",
        // что лежит внутри сущностиik

        // int svReplace = sv.replace("1","2");
        // System.out.println(svReplace);
        // Заменит все единицы в содержимом сущности на двойки,
        // т. е. "223456"

        System.out.println("на уроке Ильи Сазонова");
        System.out.println("linesLesson");
        String phone = "917-884-03-09";
        phone = phone.replace("-", "");
        phone = phone.replace(" ", "");
        phone = phone.replace("+", "");

        if (phone.length() == 10) {
            phone = '7' + phone;
        } else if (phone.length() > 11) {
            throw new RuntimeException("Телефон слишком длинный.");
        } else if (phone.length() < 10) {
            throw new RuntimeException("Телефон слишком короткий.");
        } else if (phone.length() == 11 && phone.charAt(0) != '7') {
            throw new RuntimeException("Среди нас посторонний!");
        }

        System.out.println("phone = " + phone);
        String expectedPhone = "79178840309";
        if (phone.equals(expectedPhone)) {
            System.out.println("Успех!");
        } else {
            System.out.println("Неудача!");
        }



    }
}