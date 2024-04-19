package com.cydeo;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapReview {
    public static void main(String[] args) {
    // create hash map
        Map<Integer,String> studentsMap=new HashMap<>();
        studentsMap.put(1, "Jack");
        studentsMap.put(2, "Julia");
        String st= "JavaDeveloper";

        System.out.println(findFirstNonRepeating(st));
    }
    public static Character findFirstNonRepeating(String str){

        int count;
        Map<Character,Integer> map = new TreeMap<>();

        for (char each : str.toCharArray()) {

            if (map.containsKey(each)){
                count = map.get(each);
                map.put(each,count+1);
            }
            else {
                map.put(each,1);
            }


        }


        for (char each1 : str.toCharArray()) {
            if (map.get(each1)==1) return each1;
        }

        return null;





    }



//      // create a map : this will cost me space complexity O(n)
//        Map<Character,Integer> map= new TreeMap<>();
//        int count;
//     // count the frequency of chars
//      for(Character ch:str.toCharArray()){
//          if(map.containsKey(ch)) {
//              count=map.get(ch);
//              map.put(ch, count+1);
//          }
//          else map.put(ch, 1);
//      }
//
//     // start from the beginning and check if there is a char with frequency 1
//        for(Character ch:str.toCharArray()){
//            if(map.get(ch)==1) return ch;
//        }
//        return null;
//    }
}