import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReedBook {
    public static void main(String[] args) {
        JSONParser jsonParser = new JSONParser();
        try (FileReader reader = new FileReader("book.json")) {

            Object obj = jsonParser.parse(reader);

            JSONArray bookList = (JSONArray) obj;
            System.out.println(bookList);

            bookList.forEach(emp -> parsebookObject((JSONObject) emp));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    private static void parsebookObject(JSONObject book) {
        JSONObject bookObject = (JSONObject) book.get("book");

        String ID = (String) bookObject.get("ID");

        String Name = (String) bookObject.get("Name");
        System.out.println(Name);

        String prince = (String) bookObject.get("prince");
        System.out.println(prince);

        String author = (String) bookObject.get("author");
        System.out.println(author);
    }
}
