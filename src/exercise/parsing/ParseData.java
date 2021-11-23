package exercise.parsing;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

public class ParseData {

    private static String filepathToRead = "F:/JsonFileIn.txt";
    private static String filepathToWrite = "F:/JsonFileOut.txt";

//  Вид JSON из прочитанного файла:
//  {
//        "firstName": "Java",
//                "companies": ["Google", "Yandex", "Yahoo!"],
//        "pageInfo": {
//            "pageName": "abc",
//                    "pagePic": "http://example.com/content.jpg"
//        },
//        "posts": [
//        {
//            "post_id": "123456789012_123456789012",
//                "actor_id": "1234567890",
//                "picOfPersonWhoPosted": "http://example.com/photo.jpg",
//                "nameOfPersonWhoPosted": "Jane Doe",
//                "message": "Sounds cool. Can't wait to see it!",
//                "likesCount": "2",
//                "comments": [],
//            "timeOfPost": "1234567890"
//        }
//        ]
//    }

    public static void main(String[] args) throws IOException {
        jsonDataReader(filepathToRead);
        jsonDataWriter(filepathToWrite);
    }

    public static void jsonDataReader(String filepath){

        //Создаем объект класса JSONParser для того, чтобы прочитать данные из файла методом parse()
        JSONParser parser = new JSONParser();

        try {
            //Читаем json из файла в виде объекта с типом данных Object (требуемый тип данных метода parse())
            Object obj = parser.parse(new FileReader(filepath));

            //Преобразуем объект с типом данных Object в объект с типом данных JSONObject, из которого можно доставать его отдельные свойства
            JSONObject jsonObject = (JSONObject) obj;

            //Достаем конкретный параметр
            String firstName = (String) jsonObject.get("firstName");
            System.out.println("firstName value: " + firstName);

            //Достаем массив параметров Company List(название одного из параметров в JSON) из прочитанного json-файла
            JSONArray companyList = (JSONArray) jsonObject.get("companies");

            //Считаем количество полученных данных и формирует список. Итератор необходим для перебора коллекции(списка)
            Iterator iterator = companyList.iterator();

            //До тех пор, пока в списке есть следующий элемент выводим значения
            while (iterator.hasNext()) {
                System.out.println("companies: " + iterator.next());
            }
        } catch (Exception e) {
            //Вывод ошибки(например, нет такого файла)
            e.printStackTrace();
        }
    }

    public static void jsonDataWriter(String filepath){
        //1. Создаем объект с данными первого работника
        JSONObject employeeDetails = new JSONObject();

        //2. Добавляем в объект данные в фомате "ключ: значение"
        employeeDetails.put("firstName", "Lokesh");
        employeeDetails.put("lastName", "Gupta");
        employeeDetails.put("website", "howtodoinjava.com");

        //3. Создаем объект сотрудника, своего рода идентификатор работника
        JSONObject employeeObject = new JSONObject();

        //4. Данные первого сотрудника прикрепляем к идентификатору работника
        employeeObject.put("employee", employeeDetails);

        //Повторяем действия 1-4 для второго работника
        JSONObject employeeDetails2 = new JSONObject();
        employeeDetails2.put("firstName", "Brian");
        employeeDetails2.put("lastName", "Schultz");
        employeeDetails2.put("website", "example.com");

        JSONObject employeeObject2 = new JSONObject();
        employeeObject2.put("employee", employeeDetails2);

        //Добавляем объекты с идентфикаторами и данными работников в JSON-массив
        JSONArray employeeList = new JSONArray();
        employeeList.add(employeeObject);
        employeeList.add(employeeObject2);

        //Пишем полученный массив в файл
        try (FileWriter file = new FileWriter(filepath)) {
            file.write(employeeList.toJSONString());
            file.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
