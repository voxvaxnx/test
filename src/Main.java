public class Main {
    public static void main(String[] args) {
       String text1="text1", text2="text1",text3="text3";
       //Методом возвращается символ (значение типа
        //char) из строки
       System.out.println(text1.charAt(1));
        //Метод для сравнения строк
       System.out.println(text1.compareTo(text2));
       System.out.println(text1.compareTo(text3));
       //объединения строк.
       System.out.println(text1.concat(" ".concat(text3)));
       //Если методу в качестве аргумента передана подстрока, то результатом является логическое зна-
        //чение true, если строка объекта вызова заканчивается данной подстрокой. В противном случае
        //возвращается значение
       System.out.println(text1.endsWith("t1"));
       //Методом сравниваются строки возвр true или false
       System.out.println(text1.equals(text2));
       System.out.println(text1.equals(text3));
       //перевод строки в массив символов (getBytes() такой же но создает числовой массив кода символа)
       int a = text1.length();
       char[] symbMass = new char[a];
       text1.getChars(0,a,symbMass,0);
       for (int i=0;i<a;i++) { System.out.print(symbMass[i]+"."); }
        System.out.println();
       //indexOf() Если методу передается символьный аргумент(или текстовая подстрока), то в качестве значения
        //возвращается индекс первого вхождения символа(подстроки) в строку. Если такого символа (под-
        //строки) в строке нет, возвращается значение -1.Можно указать второй целочисленный аргумент.
        //Он определяет индекс начала поиска (lastIndexOf() то же самое но последнее вхождение)

        System.out.println(text1.indexOf("t1",1));

       //replace() Методу передаются два символьных аргумента. В качестве результата методом возвращается
        //строка, которая получается из строки объекта вызова заменой первого символа-аргумента на вто-
        //рой символ-аргумент

        System.out.println(text1.replace('t','c'));

        //substring() Методом возвращается текстовая подстрока (объект класса String) текста, записанного в объект
        //вызова. У метода два целочисленных аргумента например, a и b. Возвращается подстрока из сим-
        //волов с индексами от a до b-1. Если второй аргумент не указан, возвращается подстрока до конца текста

        System.out.println(text1.substring(2,4));

        //toCharArray() Метод для преобразования текстовой строки из объекта вызова в символьный массив, который
       // возвращается в качестве результата метода
        char[] symbMass1 = text1.toCharArray();
        for (int i=0;i<text1.length();i++) {
            System.out.print(symbMass1[i]+" ");
        }



    }
}