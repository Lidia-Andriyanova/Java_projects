// 1.Дана строка sql-запроса "select * from students where ".
// Сформируйте часть WHERE этого запроса, используя StringBuilder.
// Данные для фильтрации приведены ниже в виде json строки.
// Если значение null, то параметр не должен попадать в запрос.
// Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}

public class Seminar2DZ1 {
    public static void main(String[] args) {
       StringBuilder sqlQuery = new StringBuilder("select * from students where "); 
       StringBuilder jsonCondition = new StringBuilder("{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}");
       StringBuilder whereCondition = new StringBuilder("");
       StringBuilder temp = new StringBuilder("");

       if (jsonCondition.indexOf("{") == 0 && jsonCondition.indexOf("}") == jsonCondition.length() - 1) {

            jsonCondition.delete(0, 1);
            jsonCondition.delete(jsonCondition.length() - 1, jsonCondition.length());

             int commaPos = jsonCondition.indexOf(",");
             int colonPos = 0;

            while (commaPos > -1) {
                // Выделение части до запятой
                temp.append(jsonCondition.substring(0, commaPos));

                // Разделение по двоеточию
                if (temp.indexOf("null") < 0) {
                    colonPos = temp.indexOf(":");
                    if (whereCondition.length() > 0) whereCondition.append(" and ");
                    whereCondition.append(temp.substring(1, colonPos - 1));
                    whereCondition.append(" = ");
                    whereCondition.append(temp.substring(colonPos + 2, temp.length() - 1));
                }
                 
                jsonCondition.delete(0, commaPos + 2);
                temp.delete(0, temp.length());

                commaPos = jsonCondition.indexOf(",");
                if (commaPos == -1 && jsonCondition.length() > 0) commaPos = jsonCondition.length();
            }

            sqlQuery.append(whereCondition);
            System.out.println(sqlQuery);
       }
    }   
}
