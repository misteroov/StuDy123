import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException, ParseException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        String name="";
        String date="";
        String s;
        int x;
        String[]ar;
        while ((s=reader.readLine())!=null){
            ar=s.split(" ");
            for (String s1:ar){
                try {
                 x= Integer.parseInt(s1);
                 date+=s1+" ";
                }catch (NumberFormatException e){
                    name+=" "+s1;
                }

            }
           name= name.trim();
            SimpleDateFormat sd = new SimpleDateFormat("dd mm yyyy");
            Date date1 = new Date();
            date1=sd.parse(date);
            PEOPLE.add(new Person(name,date1));

        }
reader.close();



    }
}                                                  
                                                  
         