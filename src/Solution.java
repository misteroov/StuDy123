import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
      BufferedReader reader = new BufferedReader(new FileReader("1.txt") );
      String s ,name;
      Double d;
      String[] arr;
      ArrayList <String> list = new ArrayList<>();
      Map<String,Double> map = new HashMap<>();
      while ((s=reader.readLine())!=null){
          arr = s.split(" ");
          name = arr[0];
          d = Double.valueOf(arr[1]);
          if (map.isEmpty()){
              map.put(name, d);
          }else {
              if (map.containsKey(name))
                  map.put(name,map.get(name)+d);
              else map.put(name,d);
          }

      }
      list.addAll(map.keySet());
      Collections.sort(list);
      for (String x:list){
          System.out.println(x+" "+map.get(x));
      }
     }
}
