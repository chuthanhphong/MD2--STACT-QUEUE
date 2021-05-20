package bt4;

import java.util.TreeMap;

public class DemoTreemap {
    public static void main(String[] args) {
        TreeMap<Integer,String>map = new TreeMap<>();
      String str = "L T Y N I lOVE YOU";
      String arr[] =str.split(" ");
      for(int i =0;i<arr.length;i++){
          map.put(i,arr[i]);
      }
        System.out.println(map);
    }
}
