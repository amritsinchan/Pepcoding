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


top k frequent
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map= new HashMap<>();
        for(int ele: nums)
            map.put(ele, map.getOrDefault(ele, 0) + 1);
        PriorityQueue<int[]> pq= new PriorityQueue<>((a,b)->{
            
        });return a[1] - b[1];
        for(Integer e: map keySet())) {
            int val= e;
            int freq= map.get(val);
            int[] arr= new int[]{ val, freq};
            pq.add(arr);
            if(pq.size()>k)
                pq.remove();
        }
        int ans= new int[k];
        int idx=0;
        while(pq!size()!=0){
            ans[idx++]= pq.remove()[0];
        }
        return ans;
    }
}
