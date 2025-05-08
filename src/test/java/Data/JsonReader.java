package Data;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class JsonReader {

    public String Name,Email,Password,FirstName,LastName,Address,State,City,ZipCode,MobileNumber
            ,ProductName,ReviewMessage,CardNumber,CVC,Month,Year,Subject,Message;

    public void ReadJsonFile() throws IOException, ParseException {

        Path path = Paths.get("src","test","java","Data","UserData.json");
        String filepath = path.toString();
        File srcFile = new File(filepath);


        JSONParser parser = new JSONParser();
        JSONArray jarray = (JSONArray) parser.parse(new FileReader(srcFile));


        for (Object obj : jarray) {
            JSONObject person = (JSONObject) obj;

            Name = (String) person.get("Name");
            Email = (String) person.get("Email");
            Password = (String) person.get("Password");
            FirstName = (String) person.get("FirstName");
            LastName = (String) person.get("LastName");
            Address = (String) person.get("Address");
            State = (String) person.get("State");
            City = (String) person.get("City");
            ZipCode = (String) person.get("ZipCode");
            MobileNumber = (String) person.get("MobileNumber");
            ProductName = (String) person.get("ProductName");
            ReviewMessage = (String) person.get("ReviewMessage");
            CardNumber = (String) person.get("CardNumber");
            CVC = (String) person.get("CVC");
            Month = (String) person.get("Month");
            Year = (String) person.get("Year");
            Subject = (String) person.get("Subject");
            Message = (String) person.get("Message");

        }





    }
}

