package scr.homeWork2;

public class Task1 {
    public static void main(String[] args) {
        String QUERY = "select * from students111 where ";
        String PARAMS = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"} ";
        System.out.println(answer(QUERY, PARAMS));
    }

    public static StringBuilder answer(String QUERY, String PARAMS) {
        String PARAMS1 = PARAMS.replace("{", "");
        String PARAMS2 = PARAMS1.replace("}", "");
        String PARAMS3 = PARAMS2.replaceAll("\"", "");
        StringBuilder result = new StringBuilder(QUERY);

        String [] arrayData = PARAMS3.split(", ");
        for (int i = 0; i < arrayData.length; i++) {
            String[] arrData = arrayData[i].split(":");
            if(!arrData[1].contains("null")) {
                if (i != 0) {
                    result.append(" and ");
                    result.append(arrData[0]);
                    result.append("=\'");
                    result.append(arrData[1]);
                    result.append("\'");
                } else {
                    result.append(arrData[0]);
                    result.append("=\'");
                    result.append(arrData[1]);
                    result.append("\'");
                }
            }

        }
        return result;
    }
}

/*

Не все тесты пройдены, есть ошибки :(

Количество затраченных попыток: 1

Время выполнения: 6.38699 сек

Общая статистика
Всего тестов: 2. Пройдено: 0. Не пройдено: 2.

Подробную информацию по каждому тесту смотрите ниже.

Тест 1
Тест не пройден ✗

Формулировка:

* Аргументы, передаваемые в метод/функцию:


'select * from students where '
'{"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}'


* Итоговый код для проверки. Иногда добавляем что-то от себя :)


class Answer {
    public static StringBuilder answer(String QUERY, String PARAMS){
        String PARAMS1 = PARAMS.replace("{", "");
        String PARAMS2 = PARAMS1.replace("}", "");
        String PARAMS3 = PARAMS2.replaceAll("\"", "");
        StringBuilder result = new StringBuilder("select * from students where ");

        String [] arrayData = PARAMS3.split(", ");
        for (int i = 0; i < arrayData.length; i++) {
            String[] arrData = arrayData[i].split(":");
            if(!arrData[1].contains("null")) {
                if (i != 0) {
                    result.append(", ");
                    result.append(arrData[0]);
                    result.append(" = ");
                    result.append(arrData[1]);
                } else {
                    result.append(arrData[0]);
                    result.append(" = ");
                    result.append(arrData[1]);
                }
            }

        }
        return result;

    }
}


// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer{
	public static void main(String[] args) {
      String QUERY = "";
      String PARAMS = "";

      if (args.length == 0) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
        QUERY = "select * from students where ";
	    PARAMS = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"} ";
      }
      else{
        QUERY = args[0];
        PARAMS = args[1];
      }

      Answer ans = new Answer();
      System.out.println(ans.answer(QUERY, PARAMS));
	}
} // Проверяем решение


Ожидаемый ответ:

select * from students where name='Ivanov' and country='Russia' and city='Moscow'
select * from students where name='Ivanov' and country='Russia' and city='Moscow'
Ваш ответ:

select * from students where name = Ivanov, country = Russia, city = Moscow
Тест 2
Тест не пройден ✗

Формулировка:

* Аргументы, передаваемые в метод/функцию:


'select * from students1111 where '
'{"name":"Andron", "country":"Russia", "city":"Moscow", "age":"null"}'


* Итоговый код для проверки. Иногда добавляем что-то от себя :)


class Answer {
    public static StringBuilder answer(String QUERY, String PARAMS){
        String PARAMS1 = PARAMS.replace("{", "");
        String PARAMS2 = PARAMS1.replace("}", "");
        String PARAMS3 = PARAMS2.replaceAll("\"", "");
        StringBuilder result = new StringBuilder("select * from students where ");

        String [] arrayData = PARAMS3.split(", ");
        for (int i = 0; i < arrayData.length; i++) {
            String[] arrData = arrayData[i].split(":");
            if(!arrData[1].contains("null")) {
                if (i != 0) {
                    result.append(", ");
                    result.append(arrData[0]);
                    result.append(" = ");
                    result.append(arrData[1]);
                } else {
                    result.append(arrData[0]);
                    result.append(" = ");
                    result.append(arrData[1]);
                }
            }

        }
        return result;

    }
}


// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer{
	public static void main(String[] args) {
      String QUERY = "";
      String PARAMS = "";

      if (args.length == 0) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
        QUERY = "select * from students where ";
	    PARAMS = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"} ";
      }
      else{
        QUERY = args[0];
        PARAMS = args[1];
      }

      Answer ans = new Answer();
      System.out.println(ans.answer(QUERY, PARAMS));
	}
} // Проверяем решение


Ожидаемый ответ:

select * from students1111 where name='Andron' and country='Russia' and city='Moscow'

Ваш ответ:

select * from students where name = Andron, country = Russia, city = Moscow


Скрыть терминал

Ассисте
 */