package TestQuestions;

import java.util.*;

public class CountCharacter{

    public static void main(String[] args) {
       String str="Dilshaddahhahad";
       
       char arr[]=str.toCharArray();
       Map<Character, Integer> count= new HashMap<>();
       
       for(char Char:arr)
       {
           count.put(Char,count.getOrDefault(Char,0)+1);
           
       }
       
       for(Map.Entry<Character,Integer> entry: count.entrySet())
       {
           System.out.println(entry.getKey()+ " comes " +entry.getValue() + " Times");
       }
    }
}
