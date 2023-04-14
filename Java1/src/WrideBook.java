import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

public class WrideBook {
    public static void main(String[] args) {
        JSONObject bookDetails = new JSONObject();
        bookDetails.put("ID" , "S01");
        bookDetails.put("Name" , "Thao Tung Tam Ly");
        bookDetails.put("price", "500K");
        bookDetails.put("author", "Nguyen Van Hung");

        JSONObject bookObject = new JSONObject();
        bookObject.put("book" , bookDetails);

        JSONObject bookDetails2 = new JSONObject();
        bookDetails2.put("ID", "S02");
        bookDetails2.put("Name" , "Cach Lam Giau");
        bookDetails2.put("price", "550k");
        bookDetails2.put("author", "Nguyen Van Hung");

        JSONObject bookObject2 = new JSONObject();
        bookObject2.put("book", bookDetails2);

        JSONArray bookList = new JSONArray();
        bookList.add(bookObject);
        bookList.add(bookObject2);
        try (FileWriter file = new FileWriter("book.json")) {
            file.write(bookList.toJSONString());
            file.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
