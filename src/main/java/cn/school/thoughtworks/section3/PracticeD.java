package cn.school.thoughtworks.section3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeD {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        //实现练习要求，并改写该行代码。
        Map<String,Integer> sameElementSet = new HashMap<String,Integer>();
        Map<String,Integer> collection3 = new HashMap<String,Integer>();
        for (String s1:collectionA) {
            int sum=0;
            for (int i = 0; i < s1.length();++i) {
                if((i!=s1.length()-1) && s1.charAt(i)=='-'){
                     sum=sum*10+s1.charAt(i+1)-'0';
                }
            }
            if (collection3.containsKey(String.valueOf(s1.charAt(0)))) {
                collection3.put(String.valueOf(s1.charAt(0)), collection3.get(String.valueOf(s1.charAt(0))) + sum);
            } else {
                collection3.put(String.valueOf(s1.charAt(0)),1);
            }
        }
        for (String s2:collection3.keySet()) {
            //boolean flag = false;
            if (object.containsKey(s2)) {
                //flag = true;
                if (collection3.get(s2)>3) {
                    int sub = collection3.get(s2)/3;
                    sameElementSet.put(s2,collection3.get(s2)-sub);
                }
            }
        }
        return sameElementSet;
    }
}
