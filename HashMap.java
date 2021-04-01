1. frequency of char

import java.io.*;
import java.util.*;

public class Main {
    public static Scanner scn= new Scanner(System.in);
 public static void freqChar(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        System.out.println(map);
    }
    public static void main(String[] args) throws Exception {
        // write your code here
        String str= scn.nextLine();
        freqChar(str);
    }

}



2. highest freq char

import java.io.*;
import java.util.*;

public class Main {
    public static Scanner scn= new Scanner(System.in);
 public static void highestFreqChar(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        char ans = ' ';
        int freq = 0;
        for (Character ch : map.keySet()) {
            if (map.get(ch) > freq) {
                freq = map.get(ch);
                ans = ch;
            }
        }

        System.out.println(ans);
    }
    public static void main(String[] args) throws Exception {
        // write your code here
        String str= scn.nextLine();
        highestFreqChar(str);
    }

}



3. Position of all chars

import java.io.*;
import java.util.*;

public class Main {
    public static Scanner scn= new Scanner(System.in);
public static void positionofallchars(String str){
    HasMap<character, ArrayList<Integer>> map= new HashMap<>();
    for(int i=0;i<str.length();i++){
        char ch= str.charAt(i);
        if(!map.containsKey(ch))
        map.putIfAbsent(ch, new ArrayList<>() );
        map.get(ch).add(i);
    }
    for(character ch : map keySet()) {
        System.out.println(ch+ "->" + map.get(ch));
    }
}

    public static void main(String[] args) throws Exception {
        // write your code here
        String str= scn.nextLine();
       positionofallchars(str);
    }

}
